package Collections.functions

fun flatMap() {
    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)                    // 3
    val mapBag = cart.map { it }                                // 4
    val flatMapBag = cart.flatMap { it }                        // 5s

    println("cart = $cart")
    println("mapBag = $mapBag")
    println("flatMapBag = $flatMapBag")
}
