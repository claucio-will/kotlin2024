package lambda

fun main() {

    val s = "dlfjfdjfkfdjf34343434fsddsds3ree43233"
    val s1 = s.filter {
        it.isDigit()
    }
    //println(s1)


    val s3 = s1.filterIndexed{ i,c ->
        val digit = c.isDigit()
        if (digit){
            println("Found digit '$c' in possition '$i'")
        }
        digit
    }
    println(s3)
}