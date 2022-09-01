package OOP.SpecialClasses.DataClass

class DataClass {
   init {
       val user = User("Anatoly", 1)
       println(user)                                          // User(name=Anatoly, id=1)

       val secondUser = User("Sergey", 1)
       val thirdUser = User("Pavel", 2)

       println("user == secondUser: ${user == secondUser}")   // true
       println("user == thirdUser: ${user == thirdUser}")     // false

       // hashCode() function
       println(user.hashCode())                               // -952717691
       println(secondUser.hashCode())                         // -646610874
       println(thirdUser.hashCode())                          // -1911437930

       // copy() function
       println(user.copy())                                   // User(name=Anatoly, id=1)
       println(user === user.copy())                          // false

       println(user.copy("Anton"))                      // User(name=Anton, id=1)
       println(user.copy(id = 3))                             // User(name=Anatoly, id=3)

       println("name = ${user.component1()}")                 // Anatoly
       println("id = ${user.component2()}")                   // 1
   }
}
