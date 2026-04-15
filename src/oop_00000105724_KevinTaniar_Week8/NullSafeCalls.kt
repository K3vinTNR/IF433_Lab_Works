package oop_00000105724_KevinTaniar_Week8

class Alamat(val nomor:String, val kota:String)
class Mahasiswa(val nama:String, val addr: Alamat?)

fun main(){
    val alm = Alamat("47", "Tanggerang")
    val mhs = Mahasiswa("Kevin", alm)

    println("Hai ${mhs.nama} kamu tinggal di ${mhs.addr?.kota}");

    val defKota =mhs.addr?.let{
        alamatDefault->" ${mhs.addr.kota } nomor ${mhs.addr.nomor}"
    }?:"Tidak tau tinggal dimana"
     println("hai ${mhs.nama} kamu tinggal di ${defKota}")
}