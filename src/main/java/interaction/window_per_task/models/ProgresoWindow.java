package interaction.window_per_task.models;

import javax.swing.*;

public class ProgresoWindow {

    public ProgresoWindow() {
        JFrame frame = new JFrame("Progreso");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Seguimiento del Proceso ");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
