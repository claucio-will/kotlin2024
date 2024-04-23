package colecao

fun main() {

    //Mantém a ordem de inserção
    val s1 = setOf(1,2,3,4,4)
    val s2 = mutableSetOf("A","B","C")

    //Não mantém a ordem de inserção
    val s3 = hashSetOf("1A","5B","10C")

    s3.forEach { println(it) }
    s1.forEach { println(it) }
}