package oop_00000105724_KevinTaniar.week1

fun main () {
    var name = "Kevin Taniar"
    var score =80;

    println("Name :$name,Nilai : $score")

    val grade = when (score) {
        in 90 ..100 ->"A"
        in 80 ..89 ->"B"
        in 70 ..79 ->"C"
        else ->"D"
    }
    println("Grade Kamu : "+grade)
    println("Status : ${calculateStatus(score)}")
}

fun calculateStatus(score: Int) = if(score > 75)"lulus" else "Tidak lulus"