import javax.swing.JOptionPane;

public class RemoverDisciplinas implements OpcaoSelecionada{
    @Override
    public void executar(Armazenamento arm){
        Object aluno_selecionado = arm.ListagemAlunos();
        Aluno aluno = arm.getAlunos().get(aluno_selecionado);
        Object disciplina_escolhida = aluno.ListagemDici(aluno.getDici());
        for (int i = 0; i < aluno.getDici().size(); i++) {
            Disciplina disci = aluno.getDici().get(i);
            String nomeDisciplina = disci.getNomeDisciplina();
            if(disciplina_escolhida.toString() == nomeDisciplina){
                aluno.getDici().remove(i);
            }
        }
        JOptionPane.showMessageDialog(null, "Remoção da disciplina realizada com sucesso !");
    }
}
