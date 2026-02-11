package oop_00000105724_KevinTaniar_week2

class Jagoan {
    var nama: String ="unknowed"
    var hp: Int =100;

    init {
        println("Halo Saya constructor");
        nama = "udin";
        hp= 120;
    }

    constructor (darahhero:Int =200) {
        println("ini constructor kedua")
        this.hp = darahhero;
    }

    fun jalan (){
        println("Hero $nama jalan kaki ke pasar");

    }
    fun serang () {
        println("Hero serang dengan life: $hp");
    }
}

fun main () {
    val hero = Jagoan();
    println("Darah Hero : ${hero.hp}");
    hero.jalan()
    hero.serang()
    println("Nama si hero:"+hero.nama);
}