package ListaDeTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    public List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    
    public void addTarefa(String descricao){
        this.tarefaList.add(new Tarefa(descricao));
        System.out.println(descricao);
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa i : tarefaList){
            if (i.description.equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(i);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public void totalTarefas(){
        System.out.println(tarefaList.size());
    }

    public void descricaoTarefas(){
        for (Tarefa i : tarefaList){
            System.out.println(i.description);
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.addTarefa("tarefa1");
        listaTarefa.totalTarefas();
        listaTarefa.addTarefa("tarefa2");
        listaTarefa.addTarefa("tarefa2");
        listaTarefa.totalTarefas();
        
        listaTarefa.removerTarefa("tarefa2");
        listaTarefa.totalTarefas();
        listaTarefa.addTarefa("tarefa4");
        listaTarefa.addTarefa("tarefa5");
        listaTarefa.descricaoTarefas();
    }
}
