package org.example

import javafx.application.Application
import javafx.geometry.Insets
import javafx.scene.Scene
import javafx.scene.control.*
import javafx.scene.layout.*
import javafx.stage.Stage

class Main : Application() {

    private val manager = TaskManager()
    private val taskList = ListView<String>()

    override fun start(stage: Stage) {
        stage.title = "🧠 Tapşırıq İdarəetmə Sistemi - Kotlin + JavaFX"

        val root = BorderPane()
        root.padding = Insets(10.0)

        refreshTaskList()
        root.center = taskList

        val buttons = HBox(10.0)
        val addBtn = Button("Əlavə et")
        val completeBtn = Button("Tamamla")
        val deleteBtn = Button("Sil")
        val refreshBtn = Button("Yenilə")

        buttons.children.addAll(addBtn, completeBtn, deleteBtn, refreshBtn)
        root.bottom = buttons

        addBtn.setOnAction { addTaskDialog() }
        completeBtn.setOnAction { completeSelectedTask() }
        deleteBtn.setOnAction { deleteSelectedTask() }
        refreshBtn.setOnAction { refreshTaskList() }

        val scene = Scene(root, 600.0, 400.0)
        stage.scene = scene
        stage.show()
    }

    private fun addTaskDialog() {
        val dialog = Dialog<Task>()
        dialog.title = "Yeni Tapşırıq"

        val nameField = TextField()
        val descField = TextField()
        val prioBox = ComboBox<Int>()
        prioBox.items.addAll(1, 2, 3)
        prioBox.value = 2

        val grid = GridPane()
        grid.hgap = 10.0
        grid.vgap = 10.0
        grid.add(Label("Adı:"), 0, 0)
        grid.add(nameField, 1, 0)
        grid.add(Label("Təsviri:"), 0, 1)
        grid.add(descField, 1, 1)
        grid.add(Label("Prioritet:"), 0, 2)
        grid.add(prioBox, 1, 2)

        dialog.dialogPane.content = grid
        dialog.dialogPane.buttonTypes.addAll(ButtonType.OK, ButtonType.CANCEL)

        dialog.setResultConverter { button ->
            if (button == ButtonType.OK)
                Task(0, nameField.text, descField.text, prioBox.value)
            else null
        }

        dialog.showAndWait().ifPresent { task ->
            manager.addTask(task.name, task.description, task.priority)
            refreshTaskList()
        }
    }

    private fun completeSelectedTask() {
        val selected = taskList.selectionModel.selectedItem ?: return
        val id = selected.substringAfter("[").substringBefore("]").toInt()
        manager.completeTask(id)
        refreshTaskList()
    }

    private fun deleteSelectedTask() {
        val selected = taskList.selectionModel.selectedItem ?: return
        val id = selected.substringAfter("[").substringBefore("]").toInt()
        manager.removeTask(id)
        refreshTaskList()
    }

    private fun refreshTaskList() {
        taskList.items.clear()
        taskList.items.addAll(manager.getAllTasks().map { it.toString() })
    }
}

fun main() {
    Application.launch(Main::class.java)
}
