package JetBrainsAcademy

class JetBrainsAcademy {
    init {
        cinemaRoomManager()
    }
}

fun cinemaRoomManager() {
    println("Cinema:")
    println("  1 2 3 4 5 6 7 8")
    for (i in 1..7) {
        println("$i S S S S S S S S")
    }
}
