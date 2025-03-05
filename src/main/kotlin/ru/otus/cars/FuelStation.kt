package ru.otus.cars

class FuelStation {
    fun carRefuel(car: Car, liters: Int){
        val tankMouth = car.tankMouth
        try {
            if (tankMouth is TankMouth.PetrolMouth){
                (tankMouth as TankMouth.PetrolMouth).fuelPetrol(liters)
            } else {
                (tankMouth as TankMouth.LpgMouth).fuelLpg(liters)
            }
        } catch (e: Exception){
            println(e.toString())
        }
    }

    fun carsRefuel(cars: List<Car>){
        cars.forEach({ it.tank.getContents() })
        cars.forEach({ carRefuel(it, 50) })
        cars.forEach({ it.tank.getContents() })
    }
}