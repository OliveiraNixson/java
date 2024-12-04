import javax.swing.*;
import java.awt.*;


public class Gui {

    private JLabel labelHora;

    public Gui(){
        //Configuração da janela principal
        JFrame frame = new JFrame("Relogio Digital");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //adição dos componentes

        JPanel painel = new JPanel();
        painel.setBackground(Color.BLACK);
        painel.setLayout(new BorderLayout());

        //Configuração dos labels
        labelHora = new JLabel("",SwingConstants.CENTER);
        labelHora.setFont(new Font("Arial",Font.BOLD,50));
        labelHora.setForeground(Color.GREEN);

        painel.add(labelHora,BorderLayout.CENTER);

        frame.add(painel);

        frame.setVisible(true);

        updateHour();

    }
    public void updateHour(){
        new Timer(1000, e->{
            //obter hora atual
            String horaAtual = RelogioDigital.takeHour();
            labelHora.setText(horaAtual);
        }).start();
}
}
