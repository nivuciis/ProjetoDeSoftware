

public class MostrarInformacoes implements OpcaoSelecionada{
    @Override
    public void executar(Armazenamento arm){
        Object op = arm.alunoXprofessor("Mostrar informações de: ");
        if(op == "Alunos"){
            Object alunoSelecionado = arm.ListagemAlunos();
            if(alunoSelecionado == null){return;}
            Aluno aluno = arm.getAlunos().get(alunoSelecionado.toString());
            aluno.MostrarInfo();
        }else if(op== "Professores"){
            Object professorSelecionado = arm.ListagemProfessores();
            if(professorSelecionado == null){return;}
            Professor prof = arm.getProfessor().get(professorSelecionado.toString());
            prof.MostrarInfo();
        }
    }
}
