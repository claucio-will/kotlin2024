package lambdaColections

fun main() {

    Person
        .data()
        // Usando o associateBy, ele pega a propriedade que queremos  como
        //key e o objeto automaticamente já será o value
        .associateBy { it.name }
        .forEach { (k, v) -> println("$k => $v") }
}