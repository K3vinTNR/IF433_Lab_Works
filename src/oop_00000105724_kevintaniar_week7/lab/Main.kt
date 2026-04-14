package oop_00000105724_kevintaniar_week7.lab

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n=== TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1)
    println("Sama? ${reg1 == reg2}") // Akan menghasilkan false

    println("\n=== TEST DATA CLASS ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    println(data1)
    println("Sama? ${data1 == data2}") // Akan menghasilkan true

    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println("Destructured: $userName berumur $userAge")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = Success("Data berhasil ditarik!")

    // Ini akan ERROR karena tidak exhaustive
    /*
    val uiMessage = when (response) {
        is Success -> "Tampilkan: ${response.data}"
        is Error -> "Munculkan alert: ${response.message}"
    }
    */

    val uiMessage = when (response) {
        is Success -> "Tampilkan: ${response.data}"
        is Error -> "Munculkan alert: ${response.message}"
        is Loading -> "Tampilkan Spinner"
    }
    println(uiMessage)


    println("\n=== RPG SIMULATION ===")
    GameManager.startGame()
    GameManager.startGame() // Test Singleton

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")
    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata Awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")
}