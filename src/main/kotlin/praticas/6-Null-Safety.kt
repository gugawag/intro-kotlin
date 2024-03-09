package br.ifpb.pdm.praticas

class Atividade(val titulo: String, val descricao: String?){
    override fun toString(): String {
        return "Atividade = $titulo || Descrição = $descricao"
    }
}

fun listar(repositorio: MutableList<Atividade>){
    for (atividade in repositorio){
        println(atividade)
    }
}

fun qtdAtividades(repositorio: MutableList<Atividade>){
   val qtdAtividades = repositorio.size
    println("Número de atividade(s): $qtdAtividades")
}

fun main(){
    val repositorioAtividades = mutableListOf<Atividade>()
    repositorioAtividades.add(Atividade("Fazer Compras","Café, açúcar, arroz"))
    repositorioAtividades.add(Atividade("Prova de BD2",null))
    repositorioAtividades.add(Atividade("Organizar documentos para solicitar férias","Café, açúcar, arroz"))

    //repositorioAtividades.add(Atividade(null,"Organizar seminário"))

    listar(repositorioAtividades)
    qtdAtividades(repositorioAtividades)

}
