package OOP.EnumExample

import OOP.Enum.Animals
import OOP.Student.Student

class EnumExample {
   init {
       val sergey = Student("Sergey", "Kulishov", 5);
       sergey.printAllInfo();

       val animal = Animals.BEAR;
       when(animal) {
           Animals.CAT -> println(Animals.CAT.toLowerCase());
           Animals.DOG -> println(Animals.DOG.toLowerCase());
           Animals.BEAR -> println(Animals.BEAR.toLowerCase());
           Animals.LION -> println(Animals.LION.toLowerCase());
           else -> println("Что-то неизвестное!")
       }
   }
}
