package outros

class Rectagle(width: Int, heigth: Int) {

    var width: Int = width
        private set(value) {
            if (value >=0){
                field = value
            }
        }
    var heigth: Int = heigth
        private set

    val surface get() = width * heigth
}

fun main() {

    val r = Rectagle(10,3)
    println(r.surface)




}