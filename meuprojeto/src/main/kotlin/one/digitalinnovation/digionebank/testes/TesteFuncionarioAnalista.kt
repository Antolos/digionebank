package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista( "João Pedro", "12345678912", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
