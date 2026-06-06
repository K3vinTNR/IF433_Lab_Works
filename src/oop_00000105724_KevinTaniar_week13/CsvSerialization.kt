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

fun parseCsvToStudents(csvLines: List<String>): List<Student> {
    val students = mutableListOf<Student>()
    // Lewati baris pertama karena merupakan header tabel
    for (i in 1 until csvLines.size) {
        val line = csvLines[i]
        if (line.isBlank()) continue
        val tokens = line.split(",")
        if (tokens.size == 3) {
            val nim = tokens[0].trim()
            val name = tokens[1].trim()
            val gpa = tokens[2].trim().toDouble()
            students.add(Student(nim, name, gpa))
        }
    }
    return students
}