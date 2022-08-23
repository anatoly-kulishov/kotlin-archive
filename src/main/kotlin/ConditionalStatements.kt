fun conditionalStatements() {
    var word: String? = null;
    var isHasCar: Boolean = true;
    word = "Hello"

    if (word == null || !isHasCar) {
        println("Variable \$word equal value to null");
    } else if (word == "Hello" && isHasCar) {
        println("$word, World!")
    } else {
        println("Variable \$word not equal value to null");
    }

    var res = if(word != null) 1 else 0;
    println(res);

    val num = 1999;
    when (num) {
        1 -> println("Num equal to 1")
        50 -> println("Num equal to 50")
        100 -> println("Num equal to 100")
        else -> println("Not expected value of variable $num")
    }

    val whenResul = when(num) {
        null -> "Empty";
        1999 -> "1999 y.o";
        2000 -> "2000 y.o";
        else -> println("Not expected value of variable $num")
    }
    println(whenResul);
}
