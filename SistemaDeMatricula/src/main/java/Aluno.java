/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinic
 */
public class Aluno{

    public String nome;
    public int nMatricula;
    public int faltas;
    public double notas;
    public String[] disciplinas;
    public String cpf;
    public String Ldisciplinas;
    public Aluno(String nome, int nMatricula, String[] disciplinas, String cpf)
    {
        this.nome = nome;
        this.nMatricula = nMatricula;
        this.disciplinas = disciplinas;
        this.faltas = 0;
        this.notas = 0;
        this.cpf = cpf;
    }
    public String MostrarInfo()
    {
        for(int i=0; i< this.disciplinas.length;i++)
        {
            this.Ldisciplinas += this.disciplinas[i] + "\n";
        }
        return "Nome: " + this.nome +
                "\nNúmero de Matricula: "+ this.nMatricula +
                "\nNotas: " + this.notas +
                "\nFaltas: "+ this.faltas +
                "\nCPF: " + this.cpf + 
                "\nDisciplinas matriculadas: " + this.Ldisciplinas ; 
                
                
                             
                
    }
    
}
