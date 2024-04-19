package colecao

fun main() {

    val array = Array(5) { "" }
    array[0] = "A"
    array[2] = "B"

    array.forEach {
        print(it)
    }
    println()

    val array2 = arrayOf("A", "B", "C")
    print(array2.contentToString())

   val array3 = intArrayOf(1,2,3)
   println(array3.contentToString())
}