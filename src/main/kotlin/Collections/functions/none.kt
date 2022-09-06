package Collections.functions

fun none() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
    val allEven = numbers.none { it % 2 == 1 }           // 2
    val allLess6 = numbers.none { it > 6 }               // 3

    println("numbers = $numbers")
    println("allEven = $allEven")
    println("allLess6 = $allLess6")
}
