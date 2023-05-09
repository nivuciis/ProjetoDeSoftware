import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Aluno extends Pessoa{

    private int matricula;
    public ArrayList<Disciplina> disciplinas;
    private String curso;


    public int getMatricula(){return this.matricula;}
    public String getCurso(){return this.curso;}
    
    public String getEmail(){return this.email;}
    public ArrayList<Disciplina> getDici(){return this.disciplinas;}
    
    
    public void setMatricula(){
        Integer numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("Numero de matricula do aluno");
            if (input == null) {
                this.matricula = 0;
                break;
            }
            try {
                numero = Integer.parseInt(input);
                this.matricula = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
    }
    public void resetMatricula(){
        Integer numero = null;
        while (numero == null) {
            String input = JOptionPane.showInputDialog("Numero de matricula do aluno",getMatricula());
            if (input == null) {
                this.matricula = getMatricula();
                break;
            }
            try {
                numero = Integer.parseInt(input);
                this.matricula = numero;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número inteiro válido.");
            }
        }
    }

    public void setCurso(){this.curso = JOptionPane.showInputDialog(null,"Curso");}
    public void resetCurso(){this.curso = JOptionPane.showInputDialog(null,"Curso",getCurso());}

    
    public void setDici(Armazenamento arm){

        Object[] options = {1,2,3,4,5,6};
        Object op = JOptionPane.showInputDialog(null,"Escolha quantas disciplinas deseja cadastrar:","Opções",JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if(op==null){return;}
        else{
            int opint = op.hashCode();
            if(this.disciplinas != null){
                for(int i=0;i<opint;i++)
                {
                    if(this.disciplinas.size() >= 6)
                    {
                        JOptionPane.showMessageDialog(null,"O número máximo de disciplinas já foi alcançado !");
                        break;
                    }
                    Disciplina disciplina= new Disciplina();
                    
                    disciplina.setProfessor(arm);
                    try {
                        disciplina.getNomeprofessor();
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Não há professores matriculados !", "Aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    disciplina.setNomeDisciplina();
                    disciplina.setNota();
                    this.disciplinas.add(disciplina);
                    JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso.");
                }
            }
            else{
                ArrayList<Disciplina> discip = new ArrayList<Disciplina>();
                for(int i=0;i<opint;i++)
                {
                    Disciplina disciplina= new Disciplina();
                    disciplina.setProfessor(arm);
                    try {
                        disciplina.getNomeprofessor();
                    } catch (NullPointerException e) {
                        JOptionPane.showMessageDialog(null, "Não há professores matriculados !", "Aviso", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                    disciplina.setNomeDisciplina();
                    disciplina.setNota();
                    discip.add(disciplina);
                }
                this.disciplinas = discip;
                JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso.");
            }
        }
    }
    Object ListagemDici(ArrayList<Disciplina> listDici)
    {
        if(listDici!=null){
            if(listDici.size()==0){
                JOptionPane.showMessageDialog(null, "Ainda não existem Disciplinas cadastradas ! \nAcesse a opção ADICIONAR DISCIPLINA para cadastrar", "Aviso", JOptionPane.WARNING_MESSAGE);
                return null;
            }
            Object[] d = new String[9];
            for(int i = 0; i < listDici.size(); i++)
            {
            d[i]  = listDici.get(i).getNomeDisciplina(); 
            } 
            Object opt_dici = JOptionPane.showInputDialog(null, "Escolha uma das disciplinas abaixo", "Disciplinas", JOptionPane.INFORMATION_MESSAGE, null, d, d[0]);
            return opt_dici;
        }else{
            JOptionPane.showMessageDialog(null, "Ainda não existem Disciplinas vinculadas a este aluno", "Aviso", JOptionPane.WARNING_MESSAGE);
            return 0;
        }
    }
    Object ListagemAlunos(ArrayList<Aluno> listAlun)
    {
        if(listAlun.size()==0){
            JOptionPane.showMessageDialog(null, "Ainda não existe Alunos Cadastrados, acesse a opção MATRICULAR ALUNO para Cadastrar.");
            return null;
        }
        Object[] al = new String[100] ;
        for(int i = 0; i < listAlun.size(); i++)
        {
            al[i] = listAlun.get(i).nome;
        }
        Object opt_alunos = JOptionPane.showInputDialog(null,"Escolha um aluno","Alunos", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_alunos;
    }

    @Override
    public void MostrarInfo()
    {
        JOptionPane.showMessageDialog(null,"Nome: " + this.nome + 
                "\nCPF: " + this.cpf +
                "\nMatricula: " + this.matricula +
                "\nEmail: " + this.email +
                "\nCurso: " + this.curso);
        
        if(this.disciplinas == null)
        {
            JOptionPane.showMessageDialog(null, "Aluno não possui disciplinas matriculadas\nEscolha a opção 'Matricular disciplinas' para cadastrar\n disciplinas para o aluno selecionado", "Aviso", JOptionPane.WARNING_MESSAGE);
            return ;
        }
        else{
            for(int i=0;i<this.disciplinas.size();i++){
                int aux=i+1;
                JOptionPane.showMessageDialog(null,"Disciplina "+aux+": "+this.disciplinas.get(i).getNomeDisciplina() +
                "\nNome do Professor: " + this.disciplinas.get(i).getNomeprofessor() +
                "\nNota: " + this.disciplinas.get(i).getNota());
        }
    }
    }
}



