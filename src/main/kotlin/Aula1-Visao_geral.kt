package br.ifpb.pdm

fun main() {
    print("Digite seu nome:")
    var nome = readlnOrNull()
    print("Digite sua idade:")
    val idade = readlnOrNull()

    println("Olá $nome. Você é ${tipoMaiorIdade(idade)}")

    val carro1 = Carro("Marea", "123")
    carro1.chassi = "345"
    println(carro1.chassi)

    val carros = listOf(Carro("Marea", "123"), Carro("Fusca", "456"))
    for (carro in carros) {
        println(carro)
    }
}

fun tipoMaiorIdade(idade: String?) =
    if (idade!!.toInt() >= 18) "Maior idade" else "Menor idade"

data class Carro(val tipo: String, var chassi: String)
