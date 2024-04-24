package extentions

fun main() {

    val l = listOf(1,2,3,4,5,6,7)
    println( l.sumEvenNumbers())
}

fun List<Int>.sumEvenNumbers(): Int{
    return this.filter { it % 2 == 0 }.sum()
}