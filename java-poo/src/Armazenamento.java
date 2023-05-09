import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class Armazenamento {
    public Map<String, Aluno> Alunos = new HashMap<>();
    public Map<String, Professor> Professores = new HashMap<>();
    public Map<String, Aluno> getAlunos(){ return this.Alunos; }
    public Map<String, Professor> getProfessor(){return this.Professores; }
    Object ListagemAlunos(){
        Object[] al = new String[100];
        int i = 0; 
        for(String name : this.Alunos.keySet())
        {
            al[i] = name;
            i++;   
        }
        Object opt_alunos = JOptionPane.showInputDialog(null,"Escolha um aluno","Alunos", JOptionPane.INFORMATION_MESSAGE, null, al, al[0]);
        return opt_alunos;
    }
    Object ListagemProfessores(){
        Object[] prof = new String[100];
        int i = 0; 
        for(String name : this.Professores.keySet())
        {
            prof[i] = name;
            i++;   
        }
        Object opt_prof = JOptionPane.showInputDialog(null,"Escolha um Professor","Professores", JOptionPane.INFORMATION_MESSAGE, null, prof, prof[0]);
        return opt_prof;
    }
    void trocarChave(Map map, String chaveAntiga, String novaChave) {
        if (!map.containsKey(chaveAntiga)) {
            System.out.println("A chave antiga não existe no Map.");
            return;
        }
        map.put(novaChave, map.remove(chaveAntiga));
    }
    Object alunoXprofessor(String n){
        Object[] options = {"Alunos","Professores"};
        Object op = JOptionPane.showInputDialog(null,n,"Aluno x Professor", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return op;
    }
    
    
}
