package OOP.SpecialClasses.EnumClass

enum class ControlKeysEnum(private val key: Int) {
    UP(1),
    DOWN(2),
    LEFT(3),
    RIGHT(4),
    STOP(0);

    fun get(): Int {
        return this.key
    }
}
