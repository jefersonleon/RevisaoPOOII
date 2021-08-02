package br.ulbra.model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class Times {

    public ArrayList<String> times = new ArrayList();

    public void adicionar(String time) {
        times.add(time);
        JOptionPane.showMessageDialog(null, "O time " + time
                + " foi adicionado com sucesso!!");
    }

    public String listarTimes() {
        //30 iguais e 7 espaços vazios no  inicio
        String rel = "       Relação de Times\n ==============================\n";
        if (!times.isEmpty()) {
            for (int i = 0; i < times.size(); i++) {
                rel += (i + 1) + " - " + times.get(i) + "\n";
            }
        } else {
            rel = "Relação de Times vazia!!";
        }
        return rel;
    }

    public void eliminar() {
        if (!times.isEmpty()) {
            if (JOptionPane.showConfirmDialog(null, "Os dados serão eliminados de "
                    + "forma permanente, tem certeza que deseja fazer isso??",
                    "Eliminar Base <cuidado>",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                times.clear();
                JOptionPane.showMessageDialog(null, "Os dados foram todos eliminados!");
            } else {
                JOptionPane.showMessageDialog(null, "Ação Cancelada com sucesso!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "A base se encontra vazia...");
        }
    }

    public String pesquisar(String time) {
        return null;
    }

}
