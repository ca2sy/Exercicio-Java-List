package ComandosBasicos;
import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas{
   private List<Tarefa> tarefaLista;


   public ListaDeTarefas (){
    this.tarefaLista = new ArrayList<>();

   }

   public void adicionarTarefa(String descricao){
     tarefaLista.add(new Tarefa(descricao));
   }

   public void removerTarefa(String descricao){
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for(Tarefa t : tarefaLista){
        if (t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
        }
    }
    tarefaLista.removeAll(tarefasParaRemover);
   }


   public int obterNumeroDeTarefas(){
    return tarefaLista.size();
   }

   public void obterDescricoesTarefas(){
    System.out.println(tarefaLista);
   }
}