package org.example

import java.io.Serializable

data class Task(
    val id: Int,
    val name: String,
    val description: String,
    val priority: Int,
    var completed: Boolean = false
) : Serializable {
    companion object {
        private const val serialVersionUID = 1L
    }

    override fun toString(): String {
        val status = if (completed) "Tamamlandı ✅" else "Gözləyir ⏳"
        return "[$id] $name (Prioritet: $priority) - $status"
    }
}
