package lambdaColections

fun main() {

    Person
        .data()
        .map { it.name }
        .filter { it.startsWith('B', true) }
        .forEach { println(it) }

    val count = Person
        .data()
        .count{it.name.startsWith('B', true)}
    println(count)
}