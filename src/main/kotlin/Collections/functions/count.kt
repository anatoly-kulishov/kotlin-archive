package Collections.functions

fun count() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)            // 1
    val totalCount = numbers.count()                     // 2
    val evenCount = numbers.count { it % 2 == 0 }        // 3

    println("numbers = $numbers")
    println("totalCount = $totalCount")
    println("evenCount = $evenCount")
}
