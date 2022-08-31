package ControlFlow

class ControlFlow {
    init {
        equalityChecks()
        repeatingBlocks()
        maximumElementDivisibleBy4()
        repeatByValue()
    }
}

fun equalityChecks() {
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")

    println(authors == writers)   // 1
    println(authors === writers)  // 2
}

fun repeatingBlocks() {
    val n = readln().toInt()
    var perfectComponents = 0
    var largerComponents = 0
    var rejections = 0

    repeat(n) {
        when (readln().toInt()) {
            1 -> largerComponents++
            -1 -> rejections++
            0 -> perfectComponents++
        }
    }

    println("$perfectComponents $largerComponents $rejections")
}

fun maximumElementDivisibleBy4() {
    val n = readln().toInt()
    var maxSequence = 0

    repeat(n) {
        val num = readln().toInt()

        if(num % 4 == 0 && num > maxSequence) {
            maxSequence = num
        }
    }

    println(maxSequence)
}

fun repeatByValue() {
    val n = readln().toInt()

    repeat(n) {
        print(n)
    }
}
