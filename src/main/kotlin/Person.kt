open class Person(var firstname: String, var lastname: String) {
    open fun printAllInfo() {
        println("Firstname: $firstname")
        println("Lastname: $lastname")
    }
}
