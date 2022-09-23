import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.Calendar

fun main() {
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    val today = LocalDate.now()
    println("The current date is ${today.format(formatter)}")

    val startDay = LocalDate.of(2000, 1, 20) //on January 6, 2000, the new moon happened around 12:24 PM

    //the full moon happens ~14 days after the new moon, so this is January 20, 2000 to keep track of that

    var fullMoonNumber = (startDay.toEpochDay()).toDouble() //converts starting day into a double

    val fullMoonDays = 29.53058770576
    while (fullMoonNumber <= today.toEpochDay())
    {
        fullMoonNumber += fullMoonDays
    }

    val fullMoon = LocalDate.ofEpochDay(fullMoonNumber.toLong()) //converts double back into date

    println("The next full moon will be around ${fullMoon.format(formatter)}")

}