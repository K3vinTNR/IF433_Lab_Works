package oop_00000105724_KevinTaniar_week14

interface SmartDeviceOperations {
    fun recordVideo()
    fun adjustTemperature()
}
interface CameraDevice {
    fun recordVideo()
}

interface ThermostatDevice {
    fun adjustTemperature()
}
class HikVisionCamera : CameraDevice {
    override fun recordVideo() { println("Recording 1080p security footage.") }
}

class NestThermostat : ThermostatDevice {
    override fun adjustTemperature() { println("Setting room temperature to 24°C.") }
}