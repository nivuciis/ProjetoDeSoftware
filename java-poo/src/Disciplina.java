import javax.swing.JOptionPane;

public class Disciplina {
    private String nomedisciplina;
    private Professor profe;
    private String nota;


    public String getNomeDisciplina(){return this.nomedisciplina;}
    public String getNota(){return this.nota;}
    public String getNomeprofessor(){return this.profe.getNome();}

    public void setNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:");
    }
    public void resetNomeDisciplina(){
        this.nomedisciplina = JOptionPane.showInputDialog("Nome da disciplina:",getNomeDisciplina());
    }

    public void setNota() {
        try {
           double newNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da disciplina:"));
           if (newNota < 0 || newNota > 10) {
              throw new IllegalArgumentException("Nota fora do intervalo permitido");
           } else {
              this.nota = Double.toString(newNota);
           }
        } catch (NumberFormatException e) {
           System.out.println("Erro: o valor digitado não é um número válido.");
        } catch (IllegalArgumentException e) {
           System.out.println("Erro: " + e.getMessage());
        }
     }
    public void resetNota(){
        this.nota = JOptionPane.showInputDialog("Digite a nota da disciplina:",getNota());
    }

    public void setProfessor(Armazenamento arm){
        Object opt_professor = arm.ListagemProfessores();
        Professor prof = arm.getProfessor().get(opt_professor);
        this.profe = prof;
    }
}