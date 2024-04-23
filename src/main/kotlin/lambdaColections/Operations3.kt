package lambdaColections

fun main() {

    Person
        .data()
        .map { it.age }
        .distinct() // não mantem idades duplicadas
        .sorted()  // deixar em ordem crescente
        .forEach { println(it) }
}