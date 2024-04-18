package lambda

fun main() {

    require(10 < 0){
        "Essa mensagem aparece no construtor da excessão .IllegalArgumentException "
    }
}