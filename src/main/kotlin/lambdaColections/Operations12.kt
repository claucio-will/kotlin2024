package lambdaColections

fun main() {

    Person
        .data()
        .associate { it.name to it.age } // criou um map atraves de uma lista, criou o name com key e o age como value
        .forEach{(n,a) -> println("$n => $a") }



}