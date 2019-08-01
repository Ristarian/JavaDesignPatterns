package Application;

import controller.Controller;
import model.Model;
import view.View;

import javax.swing.*;

public class Application {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

            }
        });
    }

    public static void runApp (){

        Model model = new Model();

        View view = new View(model);

        Controller controller = new Controller(view, model);

    }
}
