package Others

fun repeatStr(str: String) {
    print("${str.length} repetitions of the word $str: ")
    repeat(str.length) {
        print(str)
    }
}

fun printSharps() {
    for (i in 1..6) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}
