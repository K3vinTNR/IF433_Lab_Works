package oop_00000105724_KevinTaniar_week14

class MySqlDatabase {
    fun insertLog(log: String) { println("Inserted '$log' into MySQL.") }
}

class LogProcessor {
    private val database = MySqlDatabase() // Gandengan ketat (Tight Coupling)
    fun process(message: String) {
        database.insertLog(message)
    }
}