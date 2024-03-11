package br.ifpb.pdm.praticas

class Atividade(val titulo: String, val descricao: String?, val data: Data?){
    override fun toString(): String {
        return "Atividade = $titulo || Descrição = $descricao"
    }
}
class Data(val dia: Int?, val mes: String?  )

fun listar(repositorio: MutableList<Atividade>){
    for (atividade in repositorio){
        println(atividade)
    }
}

// fun listarTituloEMes(repositorio: MutableList<Atividade>){}

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

    listar(repositorioAtividades)
    qtdAtividades(repositorioAtividades)
    //listarTituloEMes(repositorioAtividades)

}
