public interface Executavel {

    public abstract void executar();

    public abstract void finalizar();

    void alterarPrioridade(Tarefa.Prioridade prioridade);
}