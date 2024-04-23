package colecao

fun main() {
    val s = sortedSetOf(1,3,8,6,2,0,4,9,5,7)
    println(s.reversed())

    val dogs = setOf(
        //Comparator.comparing { d: Dog -> d.name }.reversed(),
        Dog("D1"),
        Dog("D2"),
        Dog("D2"),
        Dog("D3"),
        Dog("D4"),
    )
    println(dogs)
}