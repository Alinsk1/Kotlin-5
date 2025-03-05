package ru.otus.cars

class Tank() {

    lateinit var mouth: TankMouth

    private var currentFuelLevel: Int = 0

    fun getContents(): Int{
        return currentFuelLevel
    }
    fun receiveFuel(liters: Int){
        currentFuelLevel += liters
    }
}