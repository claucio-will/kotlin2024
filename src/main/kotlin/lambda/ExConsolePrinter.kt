package lambda

fun main() {

    console { "Hi!" }
}

fun console(producer: () -> Any){
    println("*********")
    println(producer())
    println("*********")
}