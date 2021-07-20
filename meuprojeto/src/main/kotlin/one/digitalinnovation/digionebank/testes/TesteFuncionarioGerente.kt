package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente( "Maria do Carmo", "12345678912", 5000.0)

    ImprimeRelatorioFuncionario.imprime(maria)
}
