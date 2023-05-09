
import javax.swing.JOptionPane;
public class AdicionarPessoa implements OpcaoSelecionada{
    @Override
    public void executar(Armazenamento arm){
        Object op = arm.alunoXprofessor("Tipo de Pessoa para adicionar:");
        if(op == "Alunos"){
            Aluno novoAluno = new Aluno();
            novoAluno.setNome();
            novoAluno.setCPF();
            novoAluno.setMatricula();
            novoAluno.setEmail();
            novoAluno.setCurso();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
            arm.Alunos.put(novoAluno.getNome(), novoAluno);
        }else if(op == "Professores"){
            Professor prof = new Professor();
            prof.setNome();
            prof.setCPF();
            prof.setEmail();
            prof.setFormacaoAcademica();
            prof.setSalario();
            JOptionPane.showMessageDialog(null, "Professor cadastrado com sucesso.");
            arm.Professores.put(prof.getNome(), prof);
        }        
    }
}
