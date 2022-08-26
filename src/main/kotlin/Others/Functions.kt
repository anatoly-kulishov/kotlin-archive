package Others

fun multiply(a: Int, b: Int): Int {
    return a * b;
}

fun voidFunc(): Unit = println("Others.voidFunc()");

fun printNames(vararg names: String) {
    names.forEachIndexed { i, el ->
        if(i != names.size - 1) {
            print("$el, ")
        } else {
            print("$el.")
        }
    }
    println("");
}
