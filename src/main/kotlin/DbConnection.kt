interface IDbProvider {
    fun openConnection(): Unit
    fun closeConnection(): Unit
}
