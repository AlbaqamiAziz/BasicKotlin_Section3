fun main() {

    val countryCapitals = mutableMapOf("" to "")
    countryCapitals.remove("")

    while (countryCapitals.size < 3){
        print("Enter the country : ")
        val country = readLine().toString()
        print("Enter the capital of the country : ")
        countryCapitals[country] = readLine().toString()
    }

    for (counrty in countryCapitals){
        println("${counrty.value} is the capital of the ${counrty.key}")
    }
}