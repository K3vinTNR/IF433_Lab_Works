package oop_00000105724_kevintaniar_week5.Lab

class MathHelper {
    // Overloading: Nama fungsi sama, parameter berbeda
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}