package lambdaColections

fun main() {
    val names = Person
        .data()
        .joinToString("-"){it.name}// pega os elementos da lista e separa por - ao inves de ,
    println(names)
}