package Loops.iterators

class Animal(val name: String)

class Zoo(private val animals: List<Animal>) {
    operator fun iterator(): Iterator<Animal> {             // 1
        return animals.iterator()                           // 2
    }
}

fun iterators() {
    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                   // 3
        println("Watch out, it's a ${animal.name}")
    }
}
