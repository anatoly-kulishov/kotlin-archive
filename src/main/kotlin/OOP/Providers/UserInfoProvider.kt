package OOP.Providers

import OOP.User.User

interface IUserInfoProvider {
    val password: String;
    fun printInfo(user: User)
}

