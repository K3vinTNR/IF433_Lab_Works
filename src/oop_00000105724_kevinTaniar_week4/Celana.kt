package oop_00000105724_kevinTaniar_week4

class Celana:Pakaian() {
    private var stock:Int =20;
    public fun update_stock(){
        super.harga = stock * 100;
        println("Stock $stock celana terupdate, harga ${super.harga}");
    }
}