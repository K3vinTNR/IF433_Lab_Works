package oop_00000105724_kevintaniar_week6.lab

class SmartCCTV(override val id: String, override val name: String) : SmartDevice, Switchable, Recordable {
    override fun turnOn() {
        println("CCTV $name menyala.")
        startRecord() // Dipanggil otomatis saat turnOn [cite: 396]
    }

    override fun turnOff() {
        println("CCTV $name mati.")
    }

    override fun startRecord() {
        println("CCTV $name mulai merekam...")
    }
}