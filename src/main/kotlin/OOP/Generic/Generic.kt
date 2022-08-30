package OOP.Generic

import OOP.Generic.GenericClasses.MutableStack

class Generic {
    init {
        val stack1 = MutableStack<String>("First", "Second", "Third")
        println(stack1)

        val stack2 = mutableStackOf<Double>(0.62, 3.14, 2.7)
        println(stack2)
    }
}
