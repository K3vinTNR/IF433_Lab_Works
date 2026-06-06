package oop_00000105527_michaelchristophersalim.week14

// 1. Kelas Utama untuk Manajemen KHS Mahasiswa
class khs_mahasiswa {
    fun hitung_tugas(quiz: Double, tugasHarian: Double): Double {
        return (quiz * 0.3) + (tugasHarian * 0.7)
    }

    // Menerima parameter berupa interface 'kurikulum_Kampus'
    fun hitung_na(tugasMhs: Double, utsMhs: Double, uasMhs: Double, jenisKur: kurikulum_Kampus): Double {
        return jenisKur.bobot_nilai(utsMhs, uasMhs, tugasMhs)
    }
}

// 2. Interface dan Implementasi Kurikulum (Berdiri Sendiri di Luar Kelas)
interface kurikulum_Kampus {
    fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double
}

class kur_merdeka: kurikulum_Kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.3) + (uas * 0.4) + (tugas * 0.3)
    }
}

class kur_2013: kurikulum_Kampus {
    override fun bobot_nilai(uts: Double, uas: Double, tugas: Double): Double {
        return (uts * 0.2) + (uas * 0.3) + (tugas * 0.5)
    }
}

// 3. Kelas untuk Simulasi Database KHS
class khs_db {
    fun simpan_nilai(nim: String, nama: String, na: Double): String {
        return "nilai $nim $nama dengan nilai na $na berhasil simpan"
    }

    fun load_nilai(nim: String): String {
        return "Load nilai si $nim berhasil"
    }
}

class manager_hitung_nilai {
    fun hitung_nilai_mahasiswa(utsSiswa: Double, uasSiswa: Double, quizSiswa: Double, tugasSiswa: Double): Double {
        val khsMhs = khs_mahasiswa()
        val tugasMhs = khsMhs.hitung_tugas(quizSiswa, tugasSiswa)
        val naMhs = khsMhs.hitung_na(tugasMhs, utsSiswa, uasSiswa, kur_merdeka())
        return naMhs
    }
}

class db_mahasiswa_khs() {
    fun save_data_khs(nimMhs: String, namaMhs: String, naMhs1: Double): String{
        val khsDb = khs_db()
        val statusSimpan1 = khsDb.simpan_nilai("105527", "Luffy", naMhs1)
        return statusSimpan1
    }
}

// 4. Fungsi Main / Runner
fun main() {
    val mngHItungNIlai = manager_hitung_nilai()
    val naMhs: Double = mngHItungNIlai.hitung_nilai_mahasiswa(80.56, 90.30, 70.50, 60.20)

    val dbMhs = db_mahasiswa_khs()
    val result = dbMhs.save_data_khs("111", "Luffy", naMhs)

    println(result)
}