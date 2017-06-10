/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author denni
 */
public class Evaluacion extends Thread implements Serializable{

    int Inicio;
    int Vida;
    JProgressBar JPB;

    public Evaluacion(int Inicio, int Vida /*,JProgressBar JPB*/) {
        this.Inicio = 0;
        this.Vida = Vida;
        //this.JPB = JPB;
    }

    

    @Override

    public void run() {
        System.out.println("thr start");
        System.out.println(Inicio);
        System.out.println(Vida);
        while (Inicio < Vida) {
            Inicio+= 1;
            //JPB.setMaximum(Vida);
            //JPB.setValue(Inicio);
            System.out.println(Inicio + ":" + Vida);
        }
        System.out.println("thr finish");
    }
}
