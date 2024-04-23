package lambdaColections

fun main() {

    Person
        .data()
        //Diz oque voce quer agrupar, no caso está pegando a primeira letra
        // e o retorno desse metodo será um  Map<Char, List<Person>>
        // char porque está porque estamos pegando a primeira letra do nome
        // quando for imprimir, vai pegar todos que tem a mesma inicial e colocar dentro de uma linhas
        // assim B => [Person(name=Beatriz, age=30), Person(name=Barbara, age=44)]
        .groupBy ({ it.name[0] }, {it.name})
        .forEach { (t, u) -> println("$t => $u") }

}