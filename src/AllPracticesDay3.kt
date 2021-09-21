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

}