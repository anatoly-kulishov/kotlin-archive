package OOP.Providers

interface IDbProvider {
    fun openConnection(): Unit
    fun closeConnection(): Unit
}
