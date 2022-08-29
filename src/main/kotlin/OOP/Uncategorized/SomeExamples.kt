package OOP.someExamples

import OOP.Db.Db
import OOP.Db.printInfo
import OOP.Singleton.Singleton
import OOP.filterList.filterList


fun SomeExamples() {
     val ex1 = Singleton()
     val ex2 = Singleton()
     val ex3 = Singleton()

     val db = Db.MongoDb(1, "mongo")
     val db2 = Db.PostgresSQL(2, "postgres", true)

     val dbClearCopy = db.copy();
     val dbNotClearCopy = db.copy(conn = "DataTypes/String");

     if(db == dbNotClearCopy) {
         println("identical")
     } else {
         println("not identical")
     }

     if(db is Db.MongoDb) {
         db.printInfo();
     }

    val list = listOf("Java", "C", "JavaScript", "C++", "C#", "Objective-C");
    filterList(list) {
        it.startsWith('C') || it.endsWith('C')
    }
}
