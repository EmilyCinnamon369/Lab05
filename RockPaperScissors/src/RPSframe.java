import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RPSframe extends JFrame {

    public RPSframe() {

        setTitle("Rock, Paper, Scissors!");
        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // fonts
        Font fonty_mcfonterson = new Font("Times New Roman", Font.BOLD, 56);
        Font fonty_jr = new Font("Times New Roman", Font.PLAIN, 18);
        Font fonty_III = new Font("Times New Roman", Font.PLAIN, 14);

        // images
        ImageIcon rock = new ImageIcon("src\\rock.png");
        ImageIcon paper = new ImageIcon("src\\paper.png");
        ImageIcon scissors = new ImageIcon("src\\scissors.png");

        // Title Label
        JLabel jabel = new JLabel("Rock, Paper, Scissors!", JLabel.CENTER);
        jabel.setBounds(40, 0, 600, 200);
        jabel.setFont(fonty_mcfonterson);

        // Text Area and Scroll Pane for current roll
        JTextArea jerria = new JTextArea();
        jerria.setFont(fonty_III);
        JScrollPane jane = new JScrollPane(jerria);
        jane.setBounds(135, 175, 400, 200);

        //text in text area, player count, computer count
        final int[] pc = {0};
        final int[] cc = {0};

        // Rock Button
        JButton rock_butt = new JButton(rock);
        rock_butt.setBounds(50, 415, 100, 100);
        rock_butt.setFont(fonty_jr);
        rock_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 0 is rock, 1 is paper, 2 is scissors
                int x = (int) (Math.random()*3);

                if (x == 0){
                    jerria.append("Rock vs. Rock!\nTie!                                                                           "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 1){
                    cc[0] += 1;
                    jerria.append("Paper covers Rock!\nComputer Wins!                                                         "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 2){
                    pc[0] += 1;
                    jerria.append("Rock crushes Scissors!\nPlayer Wins!                                                              "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }



            }
        });

        // Paper Button
        JButton paper_butt = new JButton(paper);
        paper_butt.setBounds(200, 415, 100, 100);
        paper_butt.setFont(fonty_jr);
        paper_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 0 is rock, 1 is paper, 2 is scissors
                int x = (int) (Math.random()*3);

                if (x == 1){
                    jerria.append("Paper vs. Paper!\nTie!                                                                           "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 2){
                    cc[0] += 1;
                    jerria.append("Scissors cut Paper!\nComputer Wins!                                                         "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 0){
                    pc[0] += 1;
                    jerria.append("Paper covers Rock!\nPlayer Wins!                                                              "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

            }
        });

        // Scissors Button
        JButton scissors_butt = new JButton(scissors);
        scissors_butt.setBounds(350, 415, 100, 100);
        scissors_butt.setFont(fonty_jr);
        scissors_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // 0 is rock, 1 is paper, 2 is scissors
                int x = (int) (Math.random()*3);

                if (x == 2){
                    jerria.append("Scissors vs. Scissors!\nTie!                                                                           "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 0){
                    cc[0] += 1;
                    jerria.append("Rock crushes Scissors!\nComputer Wins!                                                         "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

                if (x == 1){
                    pc[0] += 1;
                    jerria.append("Scissors cut Paper!\nPlayer Wins!                                                              "+"W/L: "+ pc[0] +" | "+ cc[0]+"\n\n");
                }

            }
        });

        JButton quit_butt = new JButton("Quit");
        quit_butt.setBounds(500, 415, 100, 100);
        quit_butt.setFont(fonty_jr);
        quit_butt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(jabel);
        add(jane);
        add(rock_butt);
        add(paper_butt);
        add(scissors_butt);
        add(quit_butt);

        setVisible(true);

    }}
