package br.ifpb.pdm.praticas

// Classe para representar uma conta bancária
data class ContaBancaria(val numeroConta: String, var nomeTitular: String, var saldo: Double)

// Gerenciador de Contas Bancárias
class GerenciadorContas {
    private val contas = mutableListOf<ContaBancaria>()

    // Adicionar uma nova conta
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun adicionarConta(conta: ContaBancaria) {
        // Implemente aqui a lógica para adicionar uma conta ao sistema
    }

    // Remover uma conta pelo número da conta
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun removerConta(numeroConta: String) {
        /* Implemente aqui a lógica para remover uma conta pelo número */
    }

    // Listar todas as contas
    // Kotlin permite usar List e MutableList para armazenar coleções mutáveis.
    fun listarContas() {
        // Implemente aqui a lógica para listar todas as contas
    }

    // Verificar se uma conta existe pelo número da conta
    // Kotlin permite usar Set para verificar a existência de elementos de forma eficiente.
    fun contaExiste(numeroConta: String): Boolean {
        // Implemente aqui a lógica para verificar se uma conta existe
        return false // Remova esta linha após implementar a lógica correta
    }

    // Filtrar contas com saldo positivo
    // Kotlin permite usar funções de ordem superior, como filter, para filtrar coleções.
    fun filtrarContasComSaldoPositivo(): List<ContaBancaria> {
        // Implemente aqui a lógica para filtrar as contas com saldo positivo
        return emptyList() // Remova esta linha após implementar a lógica correta
    }

    // Verificar se alguma conta possui saldo negativo
    // Kotlin permite usar funções de ordem superior, como any, para verificar elementos de uma coleção.
    fun algumaContaComSaldoNegativo(): Boolean {
        // Implemente aqui a lógica para verificar se alguma conta possui saldo negativo
        return false // Remova esta linha após implementar a lógica correta
    }

    // Calcular o saldo total de todas as contas
    // Kotlin permite usar funções de ordem superior, como reduce, para reduzir uma coleção a um único valor.
    fun calcularSaldoTotal(): Double {
        // Implemente aqui a lógica para calcular o saldo total de todas as contas
        return 0.0 // Remova esta linha após implementar a lógica correta
    }
}

fun main() {
    // Criar um objeto gerenciador de contas
    val gerenciador = GerenciadorContas()

    // Adicionar algumas contas
    gerenciador.adicionarConta(ContaBancaria("123456", "Fulano", 1500.0))
    gerenciador.adicionarConta(ContaBancaria("789012", "Ciclano", -500.0))
    gerenciador.adicionarConta(ContaBancaria("345678", "Beltrano", 1000.0))

    // Filtrar contas com saldo positivo
    val contasComSaldoPositivo = gerenciador.filtrarContasComSaldoPositivo()
    println("Contas com saldo positivo:")
    contasComSaldoPositivo.forEach { println(it) }

    // Verificar se alguma conta possui saldo negativo
    val algumaContaNegativa = gerenciador.algumaContaComSaldoNegativo()
    println("Alguma conta possui saldo negativo? $algumaContaNegativa")

    // Calcular o saldo total de todas as contas
    val saldoTotal = gerenciador.calcularSaldoTotal()
    println("Saldo total de todas as contas: $saldoTotal")
}