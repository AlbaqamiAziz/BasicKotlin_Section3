//Create an abstract class Animal with attributes name and age and abstract function talk == Done
//Create a class Dog that inherits Animal and barks ('Name: Woof') == Done
//Create a class Cat that inherits Animal and meows ('Name: Meow') == Done
//Create a list of five dogs and a list of five cats with random ages == Done
import kotlin.random.Random

fun main(){
    abstract class Animal(name: String, age: Int){
        abstract fun talk()
    }

    class Dog(val name: String, val age: Int): Animal(name,age){
       override fun talk(){
           println("$name : Woof")
       }
    }

    class Cat(val name: String, val age: Int): Animal(name,age){
        override fun talk(){
            println("$name : Meow")
        }
    }

    val ages = mutableListOf<Int>()
    for (i in 0..10){
        ages.add(Random.nextInt(1,16))
    }

    val dogs = listOf<Dog>(
        Dog("firstDog",ages[Random.nextInt(ages.size)]),
        Dog("secDog",ages[Random.nextInt(ages.size)]),
        Dog("goodDog",ages[Random.nextInt(ages.size)]),
        Dog("badDog",ages[Random.nextInt(ages.size)]),
        Dog("funnyDog",ages[Random.nextInt(ages.size)])
    )

    val cats = listOf<Cat>(
        Cat("firstCat",ages[Random.nextInt(ages.size)]),
        Cat("BigCat",ages[Random.nextInt(ages.size)]),
        Cat("goodCay",ages[Random.nextInt(ages.size)]),
        Cat("badCat",ages[Random.nextInt(ages.size)]),
        Cat("funnyCat",ages[Random.nextInt(ages.size)])
    )

    //Use a loop to iterate through the list of cats and make each cat meow,
    // also use a nested loop to make each dog bark if they are older than the meowing cat

    for (cat in cats){
        cat.talk()
        for (dog in dogs){
            if (dog.age > cat.age){
                dog.talk()
            }
        }
    }




}