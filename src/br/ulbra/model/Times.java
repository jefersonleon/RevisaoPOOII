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
        times.add(time.toUpperCase());
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

    public boolean retornarVazio() {
        return times.isEmpty();
    }

    public int pesquisar(String nome) {
        boolean achou = false;
        int i, ind;
        ind = -1;
        i = 0;
        while (i < times.size() && !(achou)) {
            if (times.get(i).equals(nome.toUpperCase())) {
                achou = true;
                ind = i;
            }
            i++;
        }

        return ind;
    }

    public void excluir(int i) {
     
        times.remove(i);
    }
    public void editar(int i, String novoNome){
        times.set(i, novoNome);
    }
}
