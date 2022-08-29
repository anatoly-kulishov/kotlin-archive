package DataTypes.NumbersExample

class NumbersExample {
    init {
        var integer: Int = 2;
        var short: Short = 12345;
        var long: Long = 1234567890123456789;

        val PI: Float = 3.14f;
        var float: Float = PI;
        var double: Double = 3.141592653589793;

        multiply(5, 5)
        cuttingTheFraction(3.14)
        integersInAction()
        swap(6, 9)
    }
}

fun multiply(a: Int, b: Int): Int {
    return a * b;
}

fun cuttingTheFraction(singNum: Double): Long {
    return singNum.toLong();
}

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

fun swap(a: Int, b: Int): String {
    var _a = a;
    var _b = b;

    val _c = _a
    _a = _b
    _b = _c

    return "$_a $_b"
}

