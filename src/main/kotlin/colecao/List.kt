package colecao

fun main() {

    val l1 = listOf(1,2,3,4)
    val l2: List<Int> = emptyList()
    val l3 = mutableListOf(1,2,3)
    val l4 = listOfNotNull(1,2,3,null)

    l3.add(3, 4)

    l3.forEach { println(it) }
}