
package pe.edu.upeu.examenmefl2;

import pe.edu.upeu.examenmefl2.gui.ControllerGame;
import pe.edu.upeu.examenmefl2.gui.Inicio;
import pe.edu.upeu.examenmefl2.gui.ModelGame;

public class ExamenMEFL2 {

    public static void main(String[] args) {
        ModelGame model = new ModelGame();
        Inicio view = new Inicio();
        ControllerGame controlador = new ControllerGame(view, model);
        view.setLocationRelativeTo(null);
        view.setVisible(true);
    }
}
