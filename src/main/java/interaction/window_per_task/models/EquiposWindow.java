package interaction.window_per_task.models;

import javax.swing.*;

public class EquiposWindow {

    public EquiposWindow() {
        JFrame frame = new JFrame("Equipos");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Gestión de Equipos");
        frame.getContentPane().add(label);
        frame.setVisible(true);
    }
}
