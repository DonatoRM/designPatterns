package interaction.window_per_task;

import interaction.window_per_task.models.*;

import javax.swing.*;

public class GestionProyectosApp {
    public GestionProyectosApp() {
        JFrame frame = new JFrame("Gestión Proyectos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Tareas");
        JMenuItem proyectosItem = new JMenuItem("Proyectos");
        proyectosItem.addActionListener(_ -> new ProyectoWindow());
        JMenuItem tareasItem = new JMenuItem("Tareas");
        tareasItem.addActionListener(_ -> new TareasWindow());
        JMenuItem equiposItem = new JMenuItem("Equipos");
        equiposItem.addActionListener(_ -> new EquiposWindow());
        JMenuItem progresoItem = new JMenuItem("Progreso");
        progresoItem.addActionListener(_ -> new ProgresoWindow());
        menu.add(proyectosItem);
        menu.add(tareasItem);
        menu.add(equiposItem);
        menu.add(progresoItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    public static void main() {
        new GestionProyectosApp();
    }
}
