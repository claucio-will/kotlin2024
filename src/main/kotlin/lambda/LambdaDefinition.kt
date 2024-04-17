package lambda

fun main() {

    //Chamando a função do modo normal
    val r1 = sum(10, 20)
    println(r1)

    //Armazenando o valor da função dentro de uma variável
    val f1 = fun(a: Int, b: Int) = a + b

    //Usando o metodo invoke para chamar a função
    val r2 = f1.invoke(10, 5)
    println(r2)

    //Chamando a função f1 direto sem usar o invoke que é o modo mais comum
    val f3 = f1(10, 5)
    println(f3)

    val f2 = { a: Int, b: Int -> a + b }
    f2(10, 5)

}

fun sum(a: Int, b: Int) = a + b
