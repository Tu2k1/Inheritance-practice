
fun main() {
    
    val squareCabin = SquareCabin(10)
    val roundHut = RoundHut(2)
    val roundTower = RoundTower(3)
    
    with(squareCabin){
        println("SquareCabin")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}\n")
        
    }
    with(roundHut){
        println("Round Hut")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}\n")
    }
    with(roundTower){
        println("Round Tower")
        println("===================")
        println("building material is $buildingMaterial")
        println("capacity is $capacity")
        println("has room? ${hasRoom()}\n")
    }
}

abstract class Dwelling(private var residents: Int){
    
    abstract val buildingMaterial: String
    abstract val capacity: Int
    
    fun hasRoom(): Boolean{
        return (capacity >= residents)
    }
}

class SquareCabin(residents: Int): Dwelling(residents){
    
    override val buildingMaterial = "Wood"
    override val capacity = 6
}


open class RoundHut(residents: Int): Dwelling(residents){
    
    override val buildingMaterial = "Straw"
    override val capacity = 3
}

class RoundTower(residents: Int): RoundHut(residents){
    
    override val buildingMaterial = "Stone"
    override val capacity = 4
}






