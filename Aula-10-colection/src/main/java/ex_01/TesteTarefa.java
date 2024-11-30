package ex_01;

import java.util.ArrayList;
import java.util.List;

public class TesteTarefa {
    public static void main(String[] args) {
        List<Tarefa> listaDeTarefas = new ArrayList<>();

        Tarefa tarefa1 = new Tarefa("Estudar Java");
        Tarefa tarefa2 = new Tarefa("Estudar Spring");

        listaDeTarefas.add(tarefa1);
        listaDeTarefas.add(tarefa2);

        for (Tarefa tarefa : listaDeTarefas) {
            System.out.println(tarefa.getTitle());
        }
    }
}
