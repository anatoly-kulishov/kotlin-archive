package OOP.SpecialClasses.EnumClass

class EnumClass {
    init {
        val red = ColorEnum.RED
        println(red)                                // RED
        println(red.containsRed())                  // true
        println(ColorEnum.BLUE.containsRed())       // false
        println(ColorEnum.YELLOW.containsRed())     // true
        println(ColorEnum.GREEN.containsRed())      // false

        val res = when (readln().toInt()) {
            ControlKeysEnum.UP.get() -> "move up"
            ControlKeysEnum.DOWN.get() -> "move down"
            ControlKeysEnum.LEFT.get() -> "move left"
            ControlKeysEnum.RIGHT.get() -> "move right"
            ControlKeysEnum.STOP.get() -> "do not move"
            else -> "error!"
        }
        println(res)
    }
}
