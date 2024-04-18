package lambda

import kotlin.random.Random
import kotlin.random.nextInt

fun main() {

  val g1 = newGerenator(0,10)
    repeat(10){
        print("${g1()} ")
    }

}

fun newGerenator(min: Int, max: Int) : () -> Int {
    //return {(min..max).random()}
    return {Random.nextInt(min..max)}
}