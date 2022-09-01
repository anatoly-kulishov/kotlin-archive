package OOP

import OOP.Generic.Generic
import OOP.Providers.MyProviders
import OOP.Inheritance.Inheritance
import OOP.someExamples.SomeExamples

import OOP.SpecialClasses.DataClass.DataClass
import OOP.SpecialClasses.EnumClass.EnumClass
import OOP.SpecialClasses.SealedClass.SealedClass

class OOP {
    init {
        MyProviders()
        SomeExamples()
        Generic()
        Inheritance()

        // SpecialClasses
        DataClass()
        EnumClass()
        SealedClass()
    }
}
