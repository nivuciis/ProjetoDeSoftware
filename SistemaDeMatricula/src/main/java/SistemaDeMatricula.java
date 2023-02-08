/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author vinic
*/
import java.util.Scanner;
import java.util.ArrayList;
        
public class SistemaDeMatricula {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        System.out.println("Seja bem vindo ao Sistema de matricula !");
        System.out.println("Opções:"
                + "\n 1.Matricular um aluno no sistema"
                + "\n 2.Mostrar informações")
                + "\n 3.Adicionar Falta")
                + "\n 4.Atribuir nota");
        Aluno al = new Aluno();
        Scanner opt = new Scanner(System.in);
        int options = opt.nextInt();
        switch(options)
        {
            case 1:
                Scanner matricula = new Scanner(System.in);
                System.out.println("Digite o nome do aluno");
                String nome = matricula.nextLine();
                nomes.add(nome);
                System.out.println("Digite o numero de matricula");
                int mat = matricula.nextInt(); matricula.nextLine();
                System.out.println("Digite as disciplinas matriculadas");
                String[] disciplinas = new String[7];
                for(int i = 0;i<7;i++)
                {
                    disciplinas[i] = matricula.nextLine();
                }
                System.out.println("Digite o CPF");
                String cpf = matricula.nextLine();
                al.InserirAluno(nome,mat,disciplinas, cpf);
                System.out.println();
                
            
            case 2:
                for(int i=0; i < nomes.size(); i++)
                {
                    System.out.println(i+")"+nomes.get(i));
                }
                
        }
    }
}
