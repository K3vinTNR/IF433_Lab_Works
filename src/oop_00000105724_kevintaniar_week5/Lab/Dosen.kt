package oop_00000105724_kevintaniar_week5.Lab

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di-override karena fungsi bekerja() bersifat abstract di Parent
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS.")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}