import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args){
        Armazenamento arm = new Armazenamento();
        Object[] options = {"Adicionar Pessoa","Remover Pessoa","Alterar Dados", "Mostrar Informações", "Gerar boletim", "Adicionar Disciplinas", "Remover Disciplinas"};
        while(true){ 
            Object op = JOptionPane.showInputDialog(null,"Escolha uma opção:","Opções", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            //Dessa forma o programa roda a opção selecionada em tempo de execução:
            Map<Object, OpcaoSelecionada> opcoes = new HashMap<>();
            opcoes.put("Adicionar Pessoa", new AdicionarPessoa()); 
            opcoes.put("Remover Pessoa", new RemoverPessoa());
            opcoes.put("Alterar Dados", new AlterarDados());
            opcoes.put("Mostrar Informações", new MostrarInformacoes());
            opcoes.put("Gerar boletim", new GerarBoletim());
            opcoes.put("Adicionar Disciplinas", new AdicionarDisciplinas());
            opcoes.put("Remover Disciplinas", new RemoverDisciplinas());
            OpcaoSelecionada opcao = opcoes.get(op);
            if(opcao != null){
                opcao.executar(arm);
            }
            if(op == null)
            {
                break;
            }
            }
        }  
}


