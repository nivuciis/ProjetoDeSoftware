import javax.swing.JOptionPane;
public class RemoverPessoa implements OpcaoSelecionada{
    @Override
    public void executar(Armazenamento arm){
        Object op = arm.alunoXprofessor("Remover :");
        if(op == "Alunos"){
            Object aluno_removido = arm.ListagemAlunos();
            arm.getAlunos().remove(aluno_removido.toString());
            JOptionPane.showMessageDialog(null, "Aluno Removido com sucesso.");
        }else if(op == "Professores"){
            Object professor_removido = arm.ListagemProfessores();
            arm.getProfessor().remove(professor_removido.toString());
            JOptionPane.showMessageDialog(null, "Professor Removido com sucesso.");
        }
    }
}
