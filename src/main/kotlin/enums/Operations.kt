package enums

fun main() {
    println(Operations.PLUS.apply(10, 20))
    println(Operations.MINE.apply(20, 10))
}

enum class Operations {
    PLUS {
        override fun apply(n1: Int, n2: Int) = n1 + n2
    },
    MINE {
        override fun apply(n1: Int, n2: Int) = n1 - n2
    };

    abstract fun apply(n1: Int, n2: Int): Int
}