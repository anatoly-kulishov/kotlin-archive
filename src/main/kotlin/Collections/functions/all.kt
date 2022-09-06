package Collections.functions

fun all() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
    val allEven = numbers.all { it % 2 == 0 }            // 2
    val allLess6 = numbers.all { it < 6 }                // 3

    println("numbers = $numbers")
    println("allEven = $allEven")
    println("allLess6 = $allLess6")
}
