package oop_00000105724_kevinTaniar_week4

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() TIDAK di-override, jadi pakai bawaan Parent (10%)
}