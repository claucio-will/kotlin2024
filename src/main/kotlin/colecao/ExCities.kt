package colecao

fun main() {

    val cities = listOf("Londres", "Paris","Lisboa","Londres","Roma","Roma", "Berlim", "Madri","Lisboa")
    val toSet = cities.toSet()
    println("Cidades visitadas => ${toSet.size}")
}