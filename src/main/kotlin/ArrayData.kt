fun arrData() {
     val items: Array<Int> = arrayOf(1, 2, 3, 4, 5)

     println(items[0]); // 1
     println(items.size); // 5
     items[3] = 0
     println(items[3]); // 0

     for(el in items) {
      println(el)
     }

     items.forEach { el ->
      println(el)
     }

     items.forEachIndexed { i, el ->
      println("$el with index $i")
     }

     val list = listOf(1, 2, 3, 4, 5);
     println(list.lastIndexOf(5)) // index = 4

     val user: Map<String, Any> = mapOf("name" to "Anatoly", "age" to 23, "isHasCar" to true);
     println(user) // {name=Anatoly, age=23, isHasCar=true}
     user.forEach {key, value -> println("$key -> $value") }

     val itemsList = mutableListOf(0)
     for(i in 1..5) {
         itemsList.add(i)
     }
     println(itemsList); // [0, 1, 2, 3, 4, 5]
     itemsList.removeAt(0);
     println(itemsList); // [1, 2, 3, 4, 5]

    val userMutable = mutableMapOf("name" to "Anatoly", "age" to 23, "isHasCar" to true);
    userMutable["height"] = 180;
    println(userMutable) // {name=Anatoly, age=23, isHasCar=true, height=1
}
