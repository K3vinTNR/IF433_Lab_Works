package oop_00000105724_kevinTaniar_week4

open class Employee(val name: String, val baseSalary: Int) {

    open fun work() {
        println("$name sedang bekerja.")
    }

    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()  // 10% dari gaji dasar
    }
}