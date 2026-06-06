package oop_00000105724_KevinTaniar_week14

interface LogStorage {
    fun insertLog(log: String)
}

class MongoDbStorage : LogStorage {
    override fun insertLog(log: String) { println("Saved '$log' to MongoDB cloud database.") }
}

class InvertedLogProcessor(private val storage: LogStorage) { // Dependency Injection
    fun process(message: String) {
        storage.insertLog(message)
    }
}