package list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descriçao) {
        List<Tarefa> tarefaspararemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descriçao)) {
                tarefaspararemover.add(t);
            }
        }
        tarefaList.removeAll(tarefaspararemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }
}
