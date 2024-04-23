package lambdaColections

fun main() {

//    val age = Person
//        .data()
//        .find { it.name == "Claucio" }
//        ?.age
//        ?: 0
//    println(age)


    val age = Person
        .data()
        .first { it.name == "Claucio" } // firts lança excessão e o find não
        .age

    println(age)
}