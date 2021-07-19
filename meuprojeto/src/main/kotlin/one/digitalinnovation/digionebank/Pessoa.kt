package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.456.789.12"
    private set




    //inner  class Endereco{                                // Não será usado inner class
    //    var rua: String = "Rua teste"
    //}
}

fun main() {
    val jether = Pessoa()


    println(jether)
    println(jether.nome)
    println(jether.cpf)

    //jether.cpf = "4567" private set não permite alteração fora da classe porém permite o get
    //print(jether.Endereco().rua)// Não será usado inner class
}