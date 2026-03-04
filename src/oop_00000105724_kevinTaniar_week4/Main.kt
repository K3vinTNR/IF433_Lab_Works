package oop_00000105724_kevinTaniar_week4

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk() // Memanggil method yang sudah di-override
    myCar.accelerate() // Memanggil gabungan method Parent dan Child

    println("\n--- Testing ElectricCar ---")
    val myTesla = ElectricCar(brand = "Tesla", numberOfDoors = 4, batteryCapacity = 85)
    myTesla.accelerate()  // Method yang sudah final
    myTesla.honk()        // Mewarisi dari Car
    myTesla.openTrunk()   // Mewarisi dari Car
}