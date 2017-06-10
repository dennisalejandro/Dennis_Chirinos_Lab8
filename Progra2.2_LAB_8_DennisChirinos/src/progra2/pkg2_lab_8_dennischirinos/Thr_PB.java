/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author denni
 */
public class Thr_PB implements Runnable {

    JProgressBar JPB;
    Evaluacion p;
    int a;
    int b;

    public Thr_PB(JProgressBar JPB, Evaluacion p) {
        this.JPB = JPB;
    }

    @Override
    public void run() {
        while (true) {
            int Vida = p.Vida;
            int Inicio = p.Inicio;
            JPB.setMaximum(Vida);
            JPB.setValue(Inicio);
        }
    }

}
