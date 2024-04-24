package extentions

fun String.hide(): String{
    return "".padEnd(length,  '*')
}