package lambdaColections

fun main() {

    Person
        .data()
        .map { it.name }
        .forEach { println(it) }
}