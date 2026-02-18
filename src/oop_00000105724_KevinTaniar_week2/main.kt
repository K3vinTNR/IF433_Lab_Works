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
    print("Judul Buku: ")
    val title = scanner.nextLine()

    print("Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Lama Pinjam: ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) duration = 1

    val loan = Loan(title, borrower, duration)

    println("Total Denda: Rp ${loan.calculateFine()}")

    print("Nama Hero: ")
    val heroName = scanner.nextLine()

    print("Base Damage: ")
    val dmg = scanner.nextInt()
    scanner.nextLine()

    val hero = Hero(heroName, dmg)
    var enemyHp = 100

    while (hero.isAlive() && enemyHp > 0) {

        println("1. Serang")
        println("2. Kabur")
        print("Pilih: ")
        val action = scanner.nextInt()
        scanner.nextLine()

        if (action == 1) {
            hero.attack("Enemy")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0

            println("HP Enemy: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                hero.takeDamage(enemyDamage)
                println("HP Hero: ${hero.hp}")
            }
        } else {
            println("Kamu kabur!")
            break
        }
    }

    if (hero.isAlive() && enemyHp == 0) {
        println("Hero menang!")
    } else if (!hero.isAlive()) {
        println("Enemy menang!")
    }


}