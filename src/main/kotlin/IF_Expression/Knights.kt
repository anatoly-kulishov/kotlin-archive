package JetBrainsAcademy.TypesAndDataStructures

import java.lang.Math.abs

fun knights() {
    println("knights(x_y, z_a)")

    val (x, y) = readln().split(' ')
    val (z, a) = readln().split(' ')

    val x1 = x.toInt()
    val y1 = y.toInt()
    val x2 = z.toInt()
    val y2 = a.toInt()

    if (abs(x1 - x2) - abs(y1 - y2) == 1 || abs(y1 - y2) - abs(x1 - x2) == 1) println("YES") else println("NO")
}
