package lambdaColections

data class Person(val name: String, val age: Int) {

    companion object {
        fun data() : List<Person> {
            return listOf(
                Person("Claucio", 10),
                Person("Beatriz", 30),
                Person("Julia", 25),
                Person("Luiza", 32),
                Person("Melissa", 19),
                Person("Barbara", 44),
                Person("Laura", 49),
            )
        }
    }
}