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
        print("masukan Jurusan: ")
        val major = scanner.nextLine()

        val s1 = student(name,nim, major)
        println("status: Pendaftaran Selesai")
    }
}