import kotlin.random.Random

//Create a Country class with two attributes (name, capital) == Done
//Create a function that prints the country and its capital == Done
//Create ten countries and place them inside of a list == Done
//
//Randomly select three countries and quiz the user to see if they know the capitals == Done
//If the user guesses incorrectly call the capital function to show the answer == Done
//Give the user a final score out of 3 at the end of the game == Done
//Start a new game if they want to play again
fun main(){
     class Country(val name: String, val capital: String) {
         fun info(){
             println("The capital of ${this.name} is the city of ${this.capital}")
         }
    }

    val countries = listOf<Country>(
        Country("Saudi Arabia","Riyadh"),
        Country("Romania","Bucharest"),
        Country("Spain","Barcelona"),
        Country("United Arab Emirates","Abu Dhabi"),
        Country("Japan","Tokyo"),
        Country("Ireland","Dublin"),
        Country("Greece","Athens"),
        Country("Finland","Helsinki"),
        Country("Estonia","Tallinn"),
        Country("Egypt","Cairo"),
    )

    do{
        println("Guess the capitals of the following three countries ..")
        var score = 0
        //Bonus:
        //Can you find a way to always ask 3 unique questions? (Never repeating the same country in a single game)
        var randomNumbers = mutableListOf<Int>()
        var attempts=0

        while(attempts < 3){
            val ranomNum = Random.nextInt(10)
            if (randomNumbers.contains(ranomNum)){
             continue
            }
            print("What is the capital city of ${countries[ranomNum].name} ? ")
            if (readLine().toString() == countries[ranomNum].capital){
                score++
            }else {
                countries[ranomNum].info()
            }
            attempts++
            randomNumbers.add(ranomNum)
        }
        println("Your score $score out of 3 ..")
        print("Do you want to play again ? (Y/N) : ")
        val ans = readLine().toString()
    } while(ans == "Y" || ans == "y")

}