package JetBrainsAcademy

class JetBrainsAcademy {
    init {
        val obj = Cinema(7, 8)
        obj.getUserInput()
        obj.setUpBoard()
    }
}

class Cinema(var rows:Int, var seats:Int) {
    var list2 = MutableList(rows) { MutableList(seats) { 'S' } }

    fun getUserInput(){
        println("Enter the number of rows:")
        val rows = readln().toInt()

        println("Enter the number of seats in each row:")
        val seats = readln().toInt()

        var value = 0

        if (rows * seats <= 60)
            value = (rows * seats  * 10)
        else{
            if (rows % 2 == 0){
                value = (rows * seats / 2 * 10) + (rows * seats / 2 * 8)
            } else {
                value = ((rows - 1) * seats / 2 * 10) + ((rows - 1) * seats / 2 * 8) + (seats * 8)
            }
        }

        println("Total income:")
        println("$$value")
    }

    fun setUpBoard(){
        drawGameBoard()
    }

    fun drawGameBoard() {
        print("Cinema:")
        println()
        print(" ")
        print(" ")
        for (i in 1..seats){
            if (i > 9) {
                var a = i.toString().substring(1,2)
                print(a)
            } else {
                print("$i ")
            }
        }
        println()

        var cnt = 1
        for (i in list2) {
            print("${cnt}")
            cnt++

            for (j in i){
                print(" $j")
            }
            println("")
        }
    }
}
