package oop_00000105724_KevinTaniar_week3

class Employee (val name: String) {
    var salary: Int = 0
        set(value) {
            println("Mencoba set gaji ke: $value")
            // PERINGATAN: KODE DI BAWAH INI SALAH & BERBAHAYA!
            this.salary = value
        }
}