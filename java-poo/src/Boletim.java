import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.*;
import java.awt.GridLayout;
public class Boletim extends JFrame{
    public Boletim(Aluno p){
        setTitle("Boletim");
        setSize(800,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        JLabel title = new JLabel("Boletim de "+p.getNome());
        title.setFont(new Font("Arial", Font.BOLD, 35));
        getContentPane().add(title, BorderLayout.NORTH); 
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        JPanel panel = new JPanel(new GridLayout(1, 2));
        for (int i = 0; i < p.getDici().size(); i++) { 
            JLabel d1 = new JLabel(i+"). "+p.getDici().get(i).getNomeDisciplina());
            Float nota = Float.parseFloat(p.getDici().get(i).getNota());
            String TextoNota;
            if(nota < 7){
                TextoNota = p.getDici().get(i).getNota()+" (Reprovado) ";
            }  
            else{
                TextoNota = p.getDici().get(i).getNota()+" (Aprovado) ";
            }
            JLabel d2 = new JLabel(TextoNota);
            d1.setFont(new Font("Times New Roman", Font.BOLD, 30));
            d2.setFont(new Font("Times New Roman", Font.ITALIC, 25));
            panel.add(d1); 
            panel.add(d2); 
            getContentPane().add(panel); 
        }
        
        getContentPane().add(panel, BorderLayout.CENTER);
        
        setVisible(true);
    }   
}
