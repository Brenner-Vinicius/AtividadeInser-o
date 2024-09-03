import java.time.LocalDate;

public class Main {

    public static void main(String args[]) {

        /*
         * Oi, pessoa! Deixei alguns comentários no main com sugestões de modificações no projeto.
         * Gostaria que vocês realizassem as modificações até a próxima aula. <3
         *
         */

        //Instância de tarefa simples utilizando a classe abstrata
        Tarefa a1 = new TarefaSimples("Tarefa 1", Tarefa.Prioridade.baixa);
        System.out.println(a1.toString());
        a1.executar("Andrey");
        a1.setPrioridade(Tarefa.Prioridade.media);
        System.out.println(a1.toString());
        a1.finalizar();


        //Instância de tarefa simples utilizando a interface
        Executavel a2 = new TarefaSimples("Tarefa 2", Tarefa.Prioridade.alta);
        System.out.println(a2.toString());
        //Por que a linha comentada abaixo gera um erro? Neste caso, o que você faria se mudar a prioridade fosse importante para seu problema?
        //RESPOSTA: DEVERIA CRIAR UM METODO EM INTERFACE ONDE ALTERARIA A PRIORIDADE DA MESMA.
        //DEVE SER FEITO A IMPLEMENTAÇÃO DO METODO EM "TAREFACOMPRAZO" E EM "TAREFASIMPLES".
        //FIZ UM METODO EM EXECUTAVEL PARA USAR COMO EXEMPLO.
        a2.alterarPrioridade(Tarefa.Prioridade.media);
        System.out.println("PRIORIDADE DA TAREFA ALTERADA");
        System.out.println(a2.toString());
        a2.finalizar();


        //Instância de tarefaComPrazo
        Executavel a3 = new TarefaComPrazo("Tarefa 3", Tarefa.Prioridade.media, LocalDate.of(2024, 11, 11));
        System.out.println(a3.toString());
        //Modifique o código para mostrar o prazo em casos de objetos de TarefaComprazo
        a3.executar();
        System.out.println(a3.toString());
        //Modificar o código para mostrar se a tarefa está dentro do prazo ou atrasada
        a3.finalizar();
        System.out.println();
        //Modificar o código para mostrar se a tarefa foi finazlizado no prazo ou atrasda

        Projeto p1 = new Projeto("Projeto OO", LocalDate.of(2024, 9, 10), LocalDate.of(2024,11,30));
        p1.addTarefas(a1);
        p1.addTarefas(a2);
        p1.addTarefas(a3);

        System.out.println(p1.toString());
    }

}
