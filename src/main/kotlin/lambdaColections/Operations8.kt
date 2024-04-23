package lambdaColections

fun main() {

    val maxName = Person
        .data()
        .map { it.name }
        .maxBy { it.length }
    // .maxBy { it.length } retorna o nome
    // .maxOf { it.length } retorna a quantida de letras
   // println(maxName)

    val minAge = Person
        .data()
        .minOf { it.age }
    // .minBy { it.age } retorna o objeto completo com base na idade minima
    // .minOf { it.age } retorna apenas o valor minimo e não o objeto completo
    println(minAge)
}