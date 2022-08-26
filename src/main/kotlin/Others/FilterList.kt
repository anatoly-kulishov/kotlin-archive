package Others

fun filterList(list: List<String>, filter: (String) -> Boolean) {
    list.forEach { el ->
        if (filter(el)) {
            println(el)
        }
    }
}
