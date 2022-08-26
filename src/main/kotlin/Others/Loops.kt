package Others

fun loops() {
    whileLoop();
    doWhileLoop();
    forLoop(1, 10, 2); // 1 3 5 7 9
    forLoopStr(); // a b c d
}

fun whileLoop() {
    var i = 5;
    while (i > 0) {
        println(i)
        i--;
    }
}

// first do{} will always be executed()
fun doWhileLoop() {
    var i = 5;
    do {
        println(i)
        i--;
    } while (i > 0)
}

fun forLoop(startPoint: Int, endPointInt: Int, step: Int) {
    for(i in startPoint..endPointInt step step) {
        print("$i ")
    }
}

fun forLoopStr() {
    for(i in 'a'..'d') {
        print("$i ")
    }
}
