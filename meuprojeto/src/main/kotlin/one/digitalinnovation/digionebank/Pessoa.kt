package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"
    var cpf: String = "123.456.789.12"
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)
}