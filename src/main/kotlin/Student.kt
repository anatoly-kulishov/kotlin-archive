class Student(firstname: String, lastname: String, var course: Int) : Person(firstname, lastname) {
    override fun printAllInfo() {
        super.printAllInfo()
        println("Course: $course");
    }
}
