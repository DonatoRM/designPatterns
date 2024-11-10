package interaction.window_per_task.models;

import javax.swing.*;

public class ProyectoWindow {

    public ProyectoWindow() {
        JFrame frame = new JFrame("Proyectos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Gestión de Proyectos");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
