package lambda

fun main() {

    val f1 = transformAndConvert("$","|",100, {v -> v * v})
    println(f1)
}

fun transformAndConvert(prefix: String, suffix: String, value: Int, t: (Int) -> Int): String{
   val transformed = t(value)
    return "$prefix$transformed$suffix"
}