package exceptions

fun main() {
    val result = division(0,10)
    println(result)
}

fun division(x: Int, y: Int): Int {
    return try {
        x / y
    }catch (_: ArithmeticException){
        0
    }
}