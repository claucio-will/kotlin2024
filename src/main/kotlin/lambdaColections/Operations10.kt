package lambdaColections

fun main() {

    val existsAge = Person
        .data()
       //.any{it.age == 10} // Verfica se tem alguém com a idade passada, e retorna true ou false
       //.all { it.age == 10 } // só retorna true se todos da coleção tive a a idade igual a 10
        .none{it.age == 10} //verifica se tem alguem com a idade 10, se tiver ele vai retornar false
    println(existsAge)
}