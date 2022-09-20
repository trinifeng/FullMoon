import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.Calendar

fun main() {
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    println("The current date is ${today.format(formatter)}")

    val startDay = LocalDate.of(2000, 1, 20) //on January 6, 2000, the new moon happened around 12:24 PM
    var fullMoon = startDay

    val fullMoonDays = 29.53
    while (fullMoon.isBefore(today))
    {
        fullMoon = fullMoon.plusDays(fullMoonDays.toLong())
    }

    println("The next full moon will be around ${fullMoon.format(formatter)}")

}