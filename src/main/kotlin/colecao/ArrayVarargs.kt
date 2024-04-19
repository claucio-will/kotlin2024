package colecao

fun main() {

    val list = intArrayOf(10,20,1,6,5)
    println(sum(*list))

}

fun sum(vararg values: Int) : Int{
    var sum = 0
    values.forEach {
        sum += it
    }
    return sum
}