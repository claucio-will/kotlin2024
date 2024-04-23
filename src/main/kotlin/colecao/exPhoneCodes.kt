package colecao

fun main() {

    val codesMap = mapOf(
        55 to "Brazil",
        351 to "Portugal",
        54 to "Argentina",
        1 to "United States"
    ).values.toSortedSet(Comparator.reverseOrder()).toMutableList()

    println(codesMap)



}