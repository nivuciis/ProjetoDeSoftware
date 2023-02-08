/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author vinic
*/
import java.util.Scanner;
        
public class SistemaDeMatricula {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao Ganesha !");
        System.out.println("Opções:"
                + "\n 1.Matricular um aluno no sistema"
                + "\n 2.Excluir um aluno do sistema");
        Scanner opt = new Scanner(System.in);
        int options = opt.nextInt();
        switch(options)
        {
            case 1:
                Scanner matricula = new Scanner(System.in);
                System.out.println("Digite o nome do aluno");
                String nome = matricula.nextLine();
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
                Aluno x = new Aluno(nome,mat,disciplinas, cpf);
                System.out.println();
                System.out.println(x.MostrarInfo());
        }
    }
}
