package lambda

fun main() {

    val n = { a: Int -> a % 2  == 0 }
    val f2: (Int) -> Boolean = { a -> a % 2  == 0 }

    n(11)
}