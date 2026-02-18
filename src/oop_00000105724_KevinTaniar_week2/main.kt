package oop_00000105724_KevinTaniar_week2

import java.util.Scanner
fun main (){
    val scanner = Scanner(System.`in`)
    println("----Aplikasi PMB UMN----");

    print("Masukan Nama: ")
    val name = scanner.nextLine()

    print("Masukan Nim (Wajib 5 karakter) :")
    val nim = scanner.next()

    scanner.nextLine()

    if (nim.length != 5){
        println("Error: Pendaftaran dibatalkan. NIM harus 5 karakter!");
    }else{
        print("Pilih Jalur (1. Reguler, 2. Umum):")
        val type = scanner.nextInt()
        scanner.nextLine()
        if (type == 1) {
            print("masukan Jurusan: ")
            val major = scanner.nextLine()
            val s1 = student(name, nim, major)
            println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
        } else if (type == 2) {
            val s2 = student(name, nim)
            println("Terdafar di: ${s2.major} dengan GPA awal ${s2.gpa}")
        }else{
            println("Pilihan ngawur, pendaftaran batal!")
        }
    }
}