*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinic
 */
public class Aluno{

    public String nome;
    public String nMatricula;
    public int faltas;
    public double notas;
    public String[] disciplinas;
    public String cpf;
    public String Ldisciplinas;
    public Aluno()
    {
        this.nome ;
        this.nMatricula;
        this.disciplinas;
        this.faltas = 0;
        this.notas = 0;
        this.cpf;
    }
    public Aluno InserirAluno(String nome, String nMatricula,String[] disciplinas,String cpf)
    {
        a.this.nome = nome;
        a.this.nMatricula = nMatricula;
        a.this.disciplinas = disciplinas;
        a.this.cpf = cpf;
    }
    public String MostrarInfo(Aluno a)
    {
        for(int i=0; i< a.this.disciplinas.length;i++)
        {
            a.this.Ldisciplinas += a.this.disciplinas[i] + "\n";
        }
        return "Nome: " + a.this.nome +
                "\nNúmero de Matricula: "+ a.this.nMatricula +
                "\nNotas: " + a.this.notas +
                "\nFaltas: "+ a.this.faltas +
                "\nCPF: " + a.this.cpf + 
                "\nDisciplinas matriculadas: " + a.this.Ldisciplinas ;                  
                
    }
    public Aluno AddFalta(Aluno a)
    {
        a.this.faltas += 1;
    }
    public Aluno AddNotas(Aluno a, double nota)
    {
        a.this.notas += nota;
    }
    
}
