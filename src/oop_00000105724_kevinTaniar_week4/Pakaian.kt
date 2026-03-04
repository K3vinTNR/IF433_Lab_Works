package oop_00000105724_kevinTaniar_week4

open class Pakaian {
    private var merk: String ="";
    protected var harga: Int =0;

    init {
        this.merk="Uniqlo";
        println("Merk is $merk");
    }

    public fun jumlah_penjualan(){
        println("Pakaian Terjual");
    }
}