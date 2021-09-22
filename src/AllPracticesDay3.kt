import kotlin.random.Random
fun main(){
    val seats = mapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seats[2])  // --> Jim
    println(seats[0])  // --> null

    println(seats.getOrDefault(0, "My Default Name"))  //
    println(seats.containsKey(1))  // --> true
    println(seats.containsValue("Bob")) // --> false

    val seatsMutable = mutableMapOf(1 to "Sara", 2 to "Jim", 3 to "Jane")
    println(seatsMutable[2])  // --> Jim
    println(seatsMutable[0])  // --> null
    seatsMutable[0] = "Fred"
    println(seatsMutable[0])  // --> Fred
    println(seatsMutable)

    seatsMutable.keys.remove(1)

    // OOP in Kotlin

    Person("Tom").introduction()  // --> Hi, my name is Tom
    Person("Sara").introduction()  // --> Hi, my name is Sara

    class Car{
        var color = ""
        init {
            val colors = listOf("Red", "Blue", "Green", "Yellow")
            color = colors[Random.nextInt(colors.size)]  // --> colors.size is 4 in this case
        }
    }
    val myCar = Car()
    println(myCar.color)  // --> This will print the random color assigned to our car
    myCar.color = "Silver"
    println(myCar.color)  // --> Silver

    ///-------------

    abstract class Vehicle{
        var color = "Blue"
        abstract fun doors()
    }
    class FamilyCar: Vehicle(){
        override fun doors() {
            println("This car has 4 doors")
        }
    }
    class SportsCar: Vehicle(){
        override fun doors() {
            println("This car has 2 doors")
        }
    }
    FamilyCar().doors()  // --> This car has 4 doors
    println("The family car is ${FamilyCar().color}.")  // --> The family car is Blue.
    val mySportsCar = SportsCar()
    mySportsCar.doors()  // --> This car has 2 doors
    mySportsCar.color = "Red"
    println("The color of my sports car is ${mySportsCar.color}.")  // --> The color of my sports car is Red.
}