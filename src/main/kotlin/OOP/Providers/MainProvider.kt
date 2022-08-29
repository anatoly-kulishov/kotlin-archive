package OOP.Providers

import OOP.User.User

class MainProvider(override val password: String) : IUserInfoProvider {
    override fun printInfo(user: User) {
        println("${user.firstname} ${user.lastname} ${user.calcDateOfBirth()}")
    }

}
