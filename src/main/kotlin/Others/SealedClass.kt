package Others

sealed class Db {
    data class MySQL(val id: Int, val conn: String) : Db()
    data class MongoDb(val id: Int, val conn: String) : Db()
    data class PostgresSQL(val id: Int, val conn: String, val isDone: Boolean) : Db()
    object Help : Db() {
        val conn = "Connection done"
    }
}

private val Db.MongoDb.info: String
    get() = "MongoDb has id: $id and connection: $conn"

fun Db.MongoDb.printInfo() {
    println(info)
}
