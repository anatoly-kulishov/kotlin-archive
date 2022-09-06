package Collections.packages

class ListCollection {
    init {
        addSystemUser(4)
         println("Size: ${getSysSudoers().size}") // 4
    }
}

private val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)
private val sudoers: List<Int> = systemUsers

fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {
    return sudoers
}
