/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_p2_victorromero;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author IFRST
 */
public class ProgressBar extends Thread {

    private JProgressBar ProgressBar;
    private Deportes deporte;

    public ProgressBar() {
    }

    public ProgressBar(JProgressBar ProgressBar, Deportes deporte) {
        this.ProgressBar = ProgressBar;
        this.deporte = deporte;
    }

    public JProgressBar getPb() {
        return ProgressBar;
    }

    public void setPb(JProgressBar pb) {
        this.ProgressBar = pb;
    }

    public Deportes getDeporte() {
        return deporte;
    }

    public void setDeporte(Deportes deporte) {
        this.deporte = deporte;
    }

    public void run() {
        ProgressBar.setMaximum(deporte.getTorneos().size() * 7);
        ProgressBar.setValue(0);
        while (ProgressBar.getValue() != ProgressBar.getMaximum()) {
            ProgressBar.setValue(ProgressBar.getValue() + 1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ProgressBar.class.getName()).log(Level.SEVERE, null, ex);
        }
        ProgressBar.setValue(0);
        JOptionPane.showMessageDialog(null, "Descarga Completadaaa!");
    }

    @Override
    public String toString() {
        return ProgressBar.toString();
    }

}
