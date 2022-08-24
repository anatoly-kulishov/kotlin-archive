import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

public class User(
    internal var firstname: String = "Name",
    internal var lastname: String = "Surname",
    private var age: Int = 0
) {
    private val currentTime = LocalDateTime.now()
    private val formatterTimeForYears = DateTimeFormatter.ofPattern("yyyy")
    private val currentYear: String = currentTime.format(formatterTimeForYears)
    // set(value) {}
    // get() {
    //     println("Current year: $field");
    //     return field
    // }

    // #1 init variables
    // private var firstname: String = _firstname
    // private var lastname: String = _lastname

    // #2 init vars
    // init {
    //     firstname = _firstname
    //     lastname = _lastname
    // }

    // #1 set default values for vars
    // constructor(): this("Name", "Surname")

    internal fun calcDateOfBirth(): Number {
        return Integer.parseInt(currentYear) - age;
    }

    // internal fun printUser(): Unit {
    //     println("$firstname $lastname ${calcDateOfBirth()}")
    // }
}
