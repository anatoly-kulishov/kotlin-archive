package OOP.Providers

class DbProvider: IDbProvider {
    override fun openConnection(): Unit {
        println("DB Connected")
    }

    override fun closeConnection(): Unit {
        println("DB Closed")
    }
}
