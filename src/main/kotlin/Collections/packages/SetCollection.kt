package Collections.packages

class SetCollection {
    init {
        val aNewIssue: String = "uniqueDescr4"
        val anIssueAlreadyIn: String = "uniqueDescr2"

         println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}") // Issue uniqueDescr4 registered correctly.
         println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}") // Issue uniqueDescr2 marked as duplicate and rejected
    }
}

val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3")

fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc)
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}
