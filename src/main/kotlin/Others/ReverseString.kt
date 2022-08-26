package Others

fun reverseString(s: ArrayList<Char>): ArrayList<Char> {
    var a_pointer = 0
    var b_pointer = s.size - 1

    while (a_pointer <= b_pointer) {
        val temp = s[a_pointer]
        s[a_pointer] = s[b_pointer]
        s[b_pointer] = temp

        a_pointer++;
        b_pointer--;
    }

    return s
}
