import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class QuizCardBuilder {
    private JTextArea question;
    private JTextArea answer;
    private ArrayList<QuizCard> cardList;
    private JFrame frame;

    public void go(){
        frame = new JFrame("Quiz Card Builder");
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        Font bigFont = new Font("sansserif",Font.BOLD,24);
        question = new JTextArea(6,20);
        question.setWrapStyleWord(true);
        question.setFont(bigFont);

        JScrollPane qScrolller = new JScrollPane(question);
        qScrolller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScrolller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        answer = new JTextArea(6,20);
        answer.setLineWrap(true);
        answer.setWrapStyleWord(true);
        answer.setFont(bigFont);


        JScrollPane aScrollPane = new JScrollPane(answer);
        aScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        aScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JButton nextButton = new JButton("Next Card");
        cardList = new ArrayList<QuizCard>();

        JLabel qLabel = new JLabel("Question");
        JLabel aLabel = new JLabel("Answer");

        mainPanel.add(qLabel);
        mainPanel.add(qScrolller);
        mainPanel.add(aLabel);  // Primeiro adiciona o label
        mainPanel.add(aScrollPane);  // Depois adiciona o campo de texto com JScrollPane
        mainPanel.add(nextButton);

        nextButton.addActionListener(new NextCardListener());
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("file.txt");
        JMenuItem newMenuItem = new JMenuItem("New");

        JMenuItem saveMenuItem = new JMenuItem("Save");
        newMenuItem.addActionListener(new NewMenuListener());

        saveMenuItem.addActionListener(new SaveMenuListener());
        fileMenu.add(newMenuItem);
        fileMenu.add(saveMenuItem);
        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
        frame.setSize(500,600);
        frame.setVisible(true);







    }

    private class NextCardListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardList.add(card);
            clearCard();
        }
    }
    private class SaveMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            QuizCard card = new QuizCard(question.getText(),answer.getText());
            cardList.add(card);

            JFileChooser fileSve = new JFileChooser();
            fileSve.showSaveDialog(frame);
            saveFile(fileSve.getSelectedFile());
        }

    }
    private class NewMenuListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            cardList.clear();
            clearCard();

        }
    }


    private void clearCard(){
        question.setText("");
        answer.setText("");
        question.requestFocus();
    }
    public void saveFile (File file){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (QuizCard card:cardList){
                writer.write(card.getQuestion()+"/");
                writer.write(card.getAnswer()+"\n");
            }
            writer.close();
        }catch (Exception e){
            System.out.println("Coudnt write the cardList out");
            e.printStackTrace();
        }
    }


}
