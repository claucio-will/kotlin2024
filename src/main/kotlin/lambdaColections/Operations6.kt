package lambdaColections

fun main() {

    val count = Person
        .data()
        .filter { it.name.startsWith('b', true) }
        .sumOf { it.age }

    println(count)
}