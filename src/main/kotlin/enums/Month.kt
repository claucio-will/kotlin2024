package enums

fun main() {
    val month = Month.MARCH
    println(month.next())

   println( month.getTotalDays())


}

enum class Month(val numberOfMonth: Int) {
    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JUNY(7);

    fun getTotalDays(): Int {
        return when (this) {
            JANUARY, MARCH, MAY, JUNY -> 31
            FEBRUARY -> 28
            else -> 30
        }
    }

    fun next(): Month {
        return entries
            .find { it.numberOfMonth == numberOfMonth + 1 }
            ?: JANUARY
    }
}

