package Others

enum class Animals {
    DOG, CAT, BEAR, LION;

    fun toLowerCase() = name.lowercase().replaceFirstChar(Char::titlecase)
}
