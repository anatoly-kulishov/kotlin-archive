package IF_Expression

fun isPositiveInt() {
    println("isPositiveInt(num)")

    val num = readln().toInt()
    if (num > 0) println("YES") else println("NO")
}
