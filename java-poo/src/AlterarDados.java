
import javax.swing.JOptionPane;

public class AlterarDados implements OpcaoSelecionada{
    @Override    
    public void executar(Armazenamento arm){
        Object op = arm.alunoXprofessor("Alterar dados de:");
        if(op == "Alunos"){
            Object alunoSelecionado = arm.ListagemAlunos();
            Aluno aluno = arm.getAlunos().get(alunoSelecionado.toString());
            Object[] info = {"Nome","Matricula","CPF","Curso","Email","Disciplina"};
            Object infoOption = JOptionPane.showInputDialog(null,"Alterar Dados de:","Opções para aluno", JOptionPane.INFORMATION_MESSAGE, null, info, info[0]);
            if(infoOption == "Nome"){
                String nomeAntigo = aluno.getNome();
                aluno.resetNome();
                arm.trocarChave(arm.getAlunos(),nomeAntigo, aluno.getNome());
            }
            else if(infoOption == "Matricula"){aluno.resetMatricula();}
            else if(infoOption == "CPF"){aluno.resetCPF();}
            else if(infoOption == "Curso"){aluno.resetCurso();}
            else if(infoOption == "Email"){aluno.resetEmail();}
            else if(infoOption == "Disciplina"){aluno.setDici(arm);}
            JOptionPane.showMessageDialog(null, "Dados do aluno atualizados com sucesso !");
        }else if(op== "Professores"){
            Object professorSelecionado = arm.ListagemProfessores();
            Professor prof = arm.getProfessor().get(professorSelecionado);
            Object[] info = {"Nome","CPF","Email","Salario","Formação"};
            Object infoOption = JOptionPane.showInputDialog(null,"Alterar Dados de:","Opções para Professor", JOptionPane.INFORMATION_MESSAGE, null, info, info[0]);
            if(infoOption == "Nome"){
                String nomeAntigo = prof.getNome();
                prof.resetNome();
                arm.trocarChave(arm.getProfessor(),nomeAntigo, prof.getNome());
            }
            else if(infoOption == "Salario"){prof.resetSalario();}
            else if(infoOption == "CPF"){prof.resetCPF();}
            else if(infoOption == "Formação"){prof.resetFormacaoAcademica();}
            else if(infoOption == "Email"){prof.resetEmail();}
            JOptionPane.showMessageDialog(null, "Dados do professor atualizados com sucesso !");
        }
    }
}
