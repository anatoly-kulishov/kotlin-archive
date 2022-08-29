package DataTypes.StringExample

import kotlin.String

class StringExample {
    init {
        var str: String = "string";
        var char: Char = 'c';
        var autoTypeString = "just string without type";

        val arr = arrayListOf<Char>('h', 'e', 'l', 'l', 'o')
        reverseString(arr)

        repeatStr("seasons") // 7 repetitions of the word seasons: seasonsseasonsseasonsseasonsseasonsseasonsseasons

        printSharps()
    }
}

fun reverseString(s: ArrayList<Char>): ArrayList<Char> {
    var a_pointer = 0
    var b_pointer = s.size - 1

    while (a_pointer <= b_pointer) {
        val temp = s[a_pointer]
        s[a_pointer] = s[b_pointer]
        s[b_pointer] = temp

        a_pointer++;
        b_pointer--;
    }

    return s
}

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

