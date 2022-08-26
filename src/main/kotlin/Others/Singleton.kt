package Others

class Singleton {
    companion object {
        var count = 0;
    }

    init {
        count++;
        println("Создано объектов: $count");
    }
}
