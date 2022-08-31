package IF_Expression

fun conditionalStatements() {
    var word: String? = null;
    val isHasCar: Boolean = true;
    word = "Hello"

    if (word == null || !isHasCar) {
        println("Variable \$word equal value to null");
    } else if (word == "Hello" && isHasCar) {
        println("$word, World!")
    } else {
        println("Variable \$word not equal value to null");
    }

    val res = if (word != null) 1 else 0;
    println(res);

    val whenResult = cases (1999)
    println("whenResult: $whenResult");
}

fun cases(num: Int): Any {
     val res = when (num) {
        null -> "Empty";
        1999 -> "1999 y.o";
        2000 -> "2000 y.o";
        else -> println("Not expected value of variable $num")
    }
    return res;
}
