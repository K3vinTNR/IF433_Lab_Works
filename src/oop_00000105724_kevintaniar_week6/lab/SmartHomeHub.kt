package oop_00000105724_kevintaniar_week6.lab

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) { // Smart Casting [cite: 403]
                device.turnOff()
            }
        }
    }
}