package JetBrainsAcademy.TypesAndDataStructures

fun swap(a: Int, b: Int): String {
    var _a = a;
    var _b = b;

    var _c = _a
    _a = _b
    _b = _c

    return "$_a $_b"
}
