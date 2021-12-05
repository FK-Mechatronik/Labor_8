import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class TaschenrechnerView {
    private JTextField anzeige;
    private JButton siebenButton;
    private JButton achtButton;
    private JButton neunButton;
    private JButton vierButton;
    private JButton fuenfButton;
    private JButton sechsButton;
    private JButton dreiButton;
    private JButton zweiButton;
    private JButton einsButton;
    private JButton nullButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton gleichButton;
    private JPanel mainPanel;
    private JButton clearButton;
    private JButton punktButton;
    private JButton teilenButton;
    private JButton multButton;

    public TaschenrechnerView() {
        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="0";
                anzeigeAendern(buttonNummer);
            }
        });
        einsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="1";
                anzeigeAendern(buttonNummer);
            }
        });

        zweiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="2";
                anzeigeAendern(buttonNummer);
            }
        });

        dreiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="3";
                anzeigeAendern(buttonNummer);
            }
        });

        vierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="4";
                anzeigeAendern(buttonNummer);
            }
        });

        fuenfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="5";
                anzeigeAendern(buttonNummer);
            }
        });

        sechsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="6";
                anzeigeAendern(buttonNummer);
            }
        });

        siebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="7";
                anzeigeAendern(buttonNummer);
            }
        });

        achtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="8";
                anzeigeAendern(buttonNummer);
            }
        });

        neunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer="9";
                anzeigeAendern(buttonNummer);
            }
        });

        TaschenrechnerModel model = new TaschenrechnerModel();


        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setOperator("+");
                setzenErsterOperant(model);
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setOperator("-");
                setzenErsterOperant(model);
            }
        });

        gleichButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setZweiterOperant(Double.parseDouble(anzeige.getText()));
                anzeige.setText(String.valueOf(model.getErgebnis()));
                model.zurücksetzen();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeige.setText("0");
                model.setOperator(null);
            }
        });
        punktButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNummer=".";
                anzeigeAendern(buttonNummer);
            }
        });
        multButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setOperator("*");
                setzenErsterOperant(model);
            }
        });
        teilenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setOperator("/");
                setzenErsterOperant(model);
            }
        });


    }

    private void setzenErsterOperant(TaschenrechnerModel model) {
        model.setErsterOperant(Double.parseDouble(anzeige.getText()));
        anzeige.setText(null);
    }


    private void anzeigeAendern(String buttonNummer) {
        if(anzeige.getText().equals("0")){
            anzeige.setText(buttonNummer);
        }else{
            anzeige.setText(anzeige.getText()+ buttonNummer);
        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
