import javax.swing.JOptionPane;

public class GerarBoletim implements OpcaoSelecionada {
    @Override
    public void executar(Armazenamento arm){
        Object aluno_selecionado = arm.ListagemAlunos();
        Aluno aluno = arm.getAlunos().get(aluno_selecionado.toString());
        try {
            Boletim b = new Boletim(aluno);    
        }catch(java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Aluno não possui disciplinas matriculadas", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }
}
