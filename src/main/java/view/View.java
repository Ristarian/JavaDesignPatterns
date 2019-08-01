package view;

import model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {

    private Model model;
    private JButton helloButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");

        this.model = model;

        helloButton = new JButton("Click me!");

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.anchor = GridBagConstraints.CENTER;
        gc.gridheight = 0;
        gc.gridwidth = 0;
        gc.weightx = 1;
        gc.weighty = 1;
        gc.fill = GridBagConstraints.NONE;

        add(helloButton, gc);

        helloButton.addActionListener(this);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton) e.getSource();

        if (source == helloButton) {
            System.out.println("Hello there!");
        } else {
            System.out.println("Some other button.");
        }
    }
}
