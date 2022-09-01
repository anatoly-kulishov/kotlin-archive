package OOP.SpecialClasses.EnumClass

class EnumClass {
    init {
        val red = ColorEnum.RED
        println(red)                                // RED
        println(red.containsRed())                  // true
        println(ColorEnum.BLUE.containsRed())       // false
        println(ColorEnum.YELLOW.containsRed())     // true
        println(ColorEnum.GREEN.containsRed())      // false
    }
}
