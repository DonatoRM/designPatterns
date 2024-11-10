package interaction.window_per_task.models;

import javax.swing.*;

public class TareasWindow {

    public TareasWindow() {
        JFrame frame = new JFrame("Tareas");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Gestión de Tareas");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
