package OOP.Providers

import OOP.User.User


fun MyProviders() {
    val mainProvider = MainProvider("12345");
    val dbProvider = DbProvider();

    val user1 = User("Anatoly", "Kulishov", 23);
    val user2 = User();

    mainProvider.printInfo(user1); // Anatoly Kulishov 1999
    mainProvider.printInfo(user2); // Name Surname 2022

    dbProvider.openConnection(); // DB Connected
    dbProvider.closeConnection(); // DB Closed
}
