package lambdaColections

fun main() {

    Person
        .data()
        .filter { it.age >= 18 }
        .forEach { println(it) }

}