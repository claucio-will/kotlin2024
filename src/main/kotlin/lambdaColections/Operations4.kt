package lambdaColections

fun main() {

    Person
        .data()
        .map { it.name }
        .shuffled() // embalhara elementos e retorna uma nova lista
        .take(3) // quantidade de elementos que quero pegar a apartir do resultado acima
        .forEach { println(it) }

    Person
        .data()
        .map { it.name }
        .random() // pega apenas um elemento
        .forEach { println(it) }
}