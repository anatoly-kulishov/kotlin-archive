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

    timeDifference()
}

//1 hr = 60 min = 3600 sec

const val POINT_OF_TIME = 60;
fun timeDifference() {
    val firstMomentsHours = 1
    val firstMomentsMinutes = 2
    val firstMomentsSeconds = 30

    val secondMomentsHours = 1
    val secondMomentsMinutes = 3
    val secondMomentsSeconds = 20

    val diffHours = (secondMomentsHours - firstMomentsHours) * POINT_OF_TIME * POINT_OF_TIME
    val diffMinutes = (secondMomentsMinutes - firstMomentsMinutes) * POINT_OF_TIME
    val diffSeconds = secondMomentsSeconds - firstMomentsSeconds

    println(diffHours + diffMinutes + diffSeconds)
}
