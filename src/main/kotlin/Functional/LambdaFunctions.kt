package Functional

class LambdaFunctions {
    init {
        val upperCase1: (String) -> String = { str: String -> str.uppercase() } // 1

        val upperCase2: (String) -> String = { str -> str.uppercase() }         // 2

        val upperCase3 = { str: String -> str.uppercase() }                     // 3

        val upperCase5: (String) -> String = { it.uppercase() }                 // 5

        val upperCase6: (String) -> String = String::uppercase                  // 6

        println(upperCase1("hello"))
        println(upperCase2("hello"))
        println(upperCase3("hello"))
        println(upperCase5("hello"))
        println(upperCase6("hello"))
    }
}