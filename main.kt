
import kotlin.math.PI
fun main() {
    
    val squareCabin = SquareCabin(10,50.0)
    val roundHut = RoundHut(3,23.0)
    val roundTower = RoundTower(3,10,23.0)
    
    with(squareCabin){
        println("SquareCabin")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}")
        checkRooms()
        println("floor area = ${floorArea()}\n")
        
    }
    with(roundHut){
        println("Round Hut")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}")
        checkRooms()
        println("floor area = ${floorArea()}\n")
       
    }
    with(roundTower){
        println("Round Tower")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}")
        checkRooms()
        println("floor area = ${floorArea()}\n")
        
    }
}

abstract class Dwelling(private var residents: Int){
    
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean{
        return (capacity >= residents)
    }
    fun checkRooms(){
        if(capacity >= residents){
            residents++
            println("You got a room!")
        }
        else
        	println("Sorry there is no room left")
    }
    abstract fun floorArea(): Double
    
}

class SquareCabin(residents: Int,val length: Double): Dwelling(residents){
    
    override val buildingMaterial = "Wood"
    override val capacity = 6
    override fun floorArea(): Double{
        return length * length
    }
}


open class RoundHut(residents: Int,val radius : Double): Dwelling(residents){
    
    override val buildingMaterial = "Straw"
    override val capacity = 3
    
    override fun floorArea(): Double{
        return PI * radius * radius
    }
}

class RoundTower(residents: Int,val floors: Int = 2,radius: Double): RoundHut(residents,radius){
    
    override val buildingMaterial = "Stone"
    override val capacity = 4 * floors
    
    override fun floorArea():Double{
        return super.floorArea() * floors
    }
}
