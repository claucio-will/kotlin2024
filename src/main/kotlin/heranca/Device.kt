package heranca

abstract class Device{
    var isOn = false

    abstract fun on()
    abstract fun off()
}

class Tv() : Device() {
    override fun on() {
        println("Telephone on")
        isOn = true
    }

    override fun off() {
        println("Telephone on")
        isOn = false
    }

}

class Telephone : Device() {
    override fun on() {
        println("Telephone on")
    }

    override fun off() {
        println("Telephone off")
    }
}

fun main() {

    val t = Telephone()
    t.on()
}