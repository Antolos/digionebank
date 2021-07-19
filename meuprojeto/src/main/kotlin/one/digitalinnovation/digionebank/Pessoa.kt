package one.digitalinnovation.digionebank

abstract class Pessoa (
    val nome:String,
    val cpf: String
)


// classe open exemplo
//open class Pessoa (
//    open val nome:String,
//    open val cpf: String
//)
// limpando o codigo para versao final
// var nome: String = "Jether"
//
// var cpf: String = "123.456.789.12"
// private set
//
// constructor()
//
// fun pessoaInfo() = "$nome e $cpf"
//
//
// //inner  class Endereco{                                // Não será usado inner class
// //    var rua: String = "Rua teste"
// //}
// }
//
// fun main() {
// val jether = Pessoa()
//
//
// println(jether.pessoaInfo())
//
//
// //jether.cpf = "4567" private set não permite alteração fora da classe porém permite o get
// //println(jether.cpf)
// //print(jether.Endereco().rua)// Não será usado inner class