import JetBrainsAcademy.TypesAndDataStructures.cinemaRoomManager
import JetBrainsAcademy.TypesAndDataStructures.cuttingTheFraction
import JetBrainsAcademy.TypesAndDataStructures.integersInAction
import JetBrainsAcademy.TypesAndDataStructures.swap
import Others.*
import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    dataTypes()
    conditionalStatements()
    multiply(5, 5); // 25
    voidFunc()
    arrData ()
    repeatStr("seasons"); // 7 repetitions of the word seasons: seasonsseasonsseasonsseasonsseasonsseasonsseasons
    val names = arrayOf("Bob", "John", "Alex")
    printNames(*names) // Bob John Alex
    loops()
    oop()
    oop2()
    oop3()
    swap(3, 5); // 5 3
    cinemaRoomManager();
    cuttingTheFraction(readln().toDouble());
    val arr = arrayListOf<Char>('h', 'e', 'l', 'l', 'o')
    reverseString(arr)
    integersInAction()
}
