public class AdicionarDisciplinas implements OpcaoSelecionada {
    @Override
    public void executar(Armazenamento arm){
        Object aluno_selecionado = arm.ListagemAlunos();
        Aluno aluno = arm.getAlunos().get(aluno_selecionado);
        aluno.setDici(arm);
    }
}
