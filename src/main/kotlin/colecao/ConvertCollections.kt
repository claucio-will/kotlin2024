package colecao

fun main() {

    val l1: List<String> = listOf("A","B","C")
    //Transformando a lista em mutavél
    val l2: MutableList<String> = l1.toMutableList()

    //Transformando a lista em um set apenas de leitura
    val s1: Set<String> = l1.toSet()

    //Transformando a lista em mutableList
    val s2: MutableList<String> = s1.toMutableList()
}