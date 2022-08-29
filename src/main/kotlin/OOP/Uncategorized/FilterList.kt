package OOP.filterList

fun filterList(list: List<kotlin.String>, filter: (String) -> Boolean) {
    list.forEach { el ->
        if (filter(el)) {
            println(el)
        }
    }
}
