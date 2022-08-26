package JetBrainsAcademy.TypesAndDataStructures

fun integersInAction() {
    val input = readln().toInt()
    val a = input / 10 / 10 % 10
    val b = input / 10 % 10
    val c = input % 10
    println(a + b + c)

    val squirrels = readln().toInt()
    val nuts = readln().toInt()
    val extra_nuts = nuts % squirrels
    print(extra_nuts)
}
