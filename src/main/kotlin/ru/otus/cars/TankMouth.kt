package ru.otus.cars

sealed class TankMouth {

    abstract fun open()
    abstract fun close()

    class LpgMouth(val tank: Tank): TankMouth(){
        fun fuelLpg(liters: Int){
            open()
            tank.receiveFuel(liters)
            close()
        }

        override fun open() {
            println("Горловина бака открыта")
        }

        override fun close() {
            println("Горловина бака закрыта")
        }
    }

    class PetrolMouth(val tank: Tank): TankMouth() {
        fun fuelPetrol(liters: Int){
            open()
            tank.receiveFuel(liters)
            close()
        }

        override fun open() {
            println("Горловина баллона открыта")
        }

        override fun close() {
            println("Горловина баллона закрыта")
        }
    }
}