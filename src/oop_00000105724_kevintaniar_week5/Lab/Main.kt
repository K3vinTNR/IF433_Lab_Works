package oop_00000105724_kevintaniar_week5.Lab

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    // Polymorphic Collection: List yang berisi tipe Parent, tapi isinya objek Anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        // Pemanggilan Runtime Polymorphism
        pegawai.bekerja()

        // Smart Casting dengan is dan when
        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar() // Smart cast! Tidak perlu manual casting (as)
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println()
    }
    println("=== TESTING MATHHELPER (OVERLOADING) ===")
    val math = MathHelper()
    // Memanggil metode yang tepat berdasarkan argumen (sisi: Int) [cite: 193, 199]
    println("Luas Persegi (sisi 5): ${math.hitungLuas(5)}")
    // Memanggil metode (panjang: Int, lebar: Int) [cite: 194, 199]
    println("Luas Persegi Panjang (10x5): ${math.hitungLuas(10, 5)}")
    // Memanggil metode (jariJari: Double) [cite: 195, 199]
    println("Luas Lingkaran (r 7.0): ${math.hitungLuas(7.0)}")
}