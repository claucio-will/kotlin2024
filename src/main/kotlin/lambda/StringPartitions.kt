package lambda

fun main() {
    val s = "aFFDFssffrv"

    val partitions = s.partition {
        it.isUpperCase()
    }
    println(partitions.first)
    println(partitions.second)
}