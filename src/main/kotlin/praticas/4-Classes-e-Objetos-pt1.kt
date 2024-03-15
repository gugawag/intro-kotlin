
// Questão 1
class Produto {
    var nome: String
    var preco: Double

    // Implemente os construtores conforme especificado na questão
}

fun main() {
    // Crie instâncias das diferentes classes Produto utilizando os seus construtores e imprima os detalhes de cada produto.
}

// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    // Utilize os modificadores de visibilidade para definir os atributos nome e idade conforme especificado na questão

    // Crie um método público na classe Cliente chamado mostrarIdade() conforme especificado na questão
}

fun main() {
    // Crie uma instância de Cliente e chame o método mostrarIdade() para verificar seu funcionamento.
}

// Questão 3
abstract class Personagem {
    // Crie um método abstrato atacar() conforme especificado na questão
}

class Guerreiro : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Guerreiro
    }
}

class Mago : Personagem() {
    override fun atacar() {
        // Implemente o método atacar() de acordo com as características do Mago
    }
}

fun main() {
    // Crie instâncias de Guerreiro e Mago e chame o método atacar() de cada um para verificar se estão realizando os ataques corretamente de acordo com suas respectivas classes.
}

// Questão 4
interface FormaGeometrica {
    // Declare um método abstrato calcularArea() conforme especificado na questão
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Retangulo conforme especificado na questão
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        // Implemente o método calcularArea() para o Circulo conforme especificado na questão
    }
}

fun main() {
    // Crie instâncias dessas duas classes e chame o método calcularArea() em cada uma delas para verificar o resultado.
}

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
    private var saldo: Double = 0.0

    // Implemente um getter personalizado para a propriedade nomeTitular conforme especificado na questão

    // Implemente override do setter para o atributo saldo conforme especificado na questão
}

fun main() {
    // Crie uma instância de ContaBancaria. Altere o nome do titular para uma string que inicie com letra minúscula e mude o saldo para um valor negativo. Imprima os valores para verificar se as regras dos getters e setters estão sendo aplicadas corretamente.
}
