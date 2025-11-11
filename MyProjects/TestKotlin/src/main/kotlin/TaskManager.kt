package org.example

import java.io.*
import java.util.logging.Logger

class TaskManager {
    private var tasks = HashMap<Int, Task>()
    private var nextId = 1
    private val fileName = "tasks.dat"
    private val logger = Logger.getLogger(TaskManager::class.java.name)

    init {
        loadFromFile()
    }

    fun addTask(name: String, description: String, priority: Int) {
        val task = Task(nextId++, name, description, priority)
        tasks[task.id] = task
        saveToFile()
    }

    fun removeTask(id: Int) {
        tasks.remove(id)
        saveToFile()
    }

    fun completeTask(id: Int) {
        tasks[id]?.completed = true
        saveToFile()
    }

    fun getAllTasks(): List<Task> =
        tasks.values.sortedBy { it.priority }

    private fun saveToFile() {
        try {
            ObjectOutputStream(FileOutputStream(fileName)).use { it.writeObject(tasks) }
        } catch (e: IOException) {
            logger.severe("Fayla yazarkən xəta: ${e.message}")
        }
    }

    @Suppress("UNCHECKED_CAST")
    private fun loadFromFile() {
        val file = File(fileName)
        if (!file.exists()) return

        try {
            ObjectInputStream(FileInputStream(file)).use { ois ->
                val obj = ois.readObject()
                if (obj is HashMap<*, *>) {
                    tasks = obj as HashMap<Int, Task>
                    if (tasks.isNotEmpty()) nextId = tasks.keys.maxOrNull()!! + 1
                }
            }
        } catch (e: Exception) {
            logger.warning("Fayl oxunarkən xəta: ${e.message}")
        }
    }
}
