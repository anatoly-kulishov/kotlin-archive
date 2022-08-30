package OOP.Generic

import OOP.Generic.GenericClasses.MutableStack

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)
