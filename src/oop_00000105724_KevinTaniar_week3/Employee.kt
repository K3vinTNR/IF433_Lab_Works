package oop_00000105724_KevinTaniar_week3

class Employee(val name: String) {
    // Properti dengan Custom Setter dan Backing Field
    var salary: Int = 0
        set(value) {
            if (value < 0) {
                println("ERROR: Gaji tidak boleh negatif! Di-set ke 0.")
                field = 0
            } else {
                field = value
            }
        }

    // Properti Private (Encapsulation)
    private var performanceRating: Int = 3

    // Computed Property (Custom Getter)
    val tax: Double
        get() = salary * 0.1

    fun increasePerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating: $performanceRating")
    }

    fun printStatus() {
        println("Karyawan: $name, Gaji: $salary, Rating: $performanceRating, Pajak: $tax")
    }
}