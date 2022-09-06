package Collections.functions

fun partition() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)                 // 1
    val evenOdd = numbers.partition { it % 2 == 0 }           // 2
    val (positives, negatives) = numbers.partition { it > 0 } // 3

    println("numbers = $numbers")
    println("evenOdd = $evenOdd")
    println("positives = $positives")
    println("negatives = $negatives")
}

