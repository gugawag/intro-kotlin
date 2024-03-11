package br.ifpb.pdm.praticas

class Atividade(val titulo: String, val descricao: String?, val data: Data?){
    override fun toString(): String {
        return "Atividade = $titulo || Descrição = $descricao || Data = $data"
    }
}
class Data(val dia: Int?, val mes: String?  ){
    override fun toString(): String {
        return "$dia/$mes"
    }
}

fun cadastrarAtividade(repositorio: MutableList<Atividade>){

    print("Digite o título da atividade: ")
    val titulo = readln()

    print("Digite a descrição da atividade: ")
    val descricao = readln()

    print("Digite o dia da atividade: ")
    val dia = readlnOrNull()?.toInt()

    print("Digite o mes da atividade: ")
    val mes = readln()
    val data = Data(dia, mes)

    repositorio.add(Atividade(titulo,descricao,data))
    println("\nCadastrado com sucesso!\n")
}

fun listar(repositorio: MutableList<Atividade>){
    for (atividade in repositorio){
        println(atividade)
    }
}

// fun listarTituloEMes(repositorio: MutableList<Atividade>){}

// fun listarAtividadeSemData(repositorio: MutableList<Atividade>)

fun qtdAtividades(repositorio: MutableList<Atividade>){
   val qtdAtividades = repositorio.size
    println("Número de atividade(s): $qtdAtividades")
}

fun main(){
    val repositorioAtividades = mutableListOf<Atividade>()
    repositorioAtividades.add(Atividade("Fazer Compras","Café, açúcar, arroz", Data(14, "Março")))
    repositorioAtividades.add(Atividade("Prova de BD2",null, Data(23, null)))
    repositorioAtividades.add(Atividade("Organizar documentos para solicitar férias","Café, açúcar, arroz", null))

    //repositorioAtividades.add(Atividade(null,"Organizar seminário"))

    var opcao = 0
    while (opcao != 6) {
        println("1 - Listar atividades")
        println("2 - Listar quantidade de Atividades")
        println("3 - Cadastrar Atividade")
        //println("4 - Listar por título e mês")
        //println("5 - Lista atividades sem data")
        println("6 - Sair")
        print("Digite a opção: ")
        opcao = readlnOrNull()?.toInt() ?: 8

        when (opcao) {
            1 -> listar(repositorioAtividades)
            2 -> qtdAtividades(repositorioAtividades)
            3 -> cadastrarAtividade(repositorioAtividades)
            //4 -> listarTituloEMes(repositorioAtividades)
            //5 -> listarAtividadeSemData(repositorio: MutableList<Atividade>)
        }
    }
}
