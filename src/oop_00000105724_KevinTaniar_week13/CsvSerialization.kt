package oop_00000105724_KevinTaniar_week13

import java.io.File

data class Student(val nim: String, val name: String, val gpa: Double)

fun List<Student>.toCsvString(): String {
    val sb = StringBuilder()
    sb.append("NIM,Nama,IPK\n") // Header CSV
    for (student in this) {
        sb.append("${student.nim},${student.name},${student.gpa}\n")
    }
    return sb.toString()
}