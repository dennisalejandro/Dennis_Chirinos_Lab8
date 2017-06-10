/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author denni
 */
public class Thr_List implements Runnable {

    JList Jlist1;
    ArrayList<Organo> listOrg;

    public Thr_List(JList Jlist1, ArrayList<Organo> listOrg) {
        this.Jlist1 = Jlist1;
        this.listOrg = listOrg;
    }

    

    @Override
    public void run() {
        while (true) {
            DefaultListModel model1 = new DefaultListModel();
            for (int i = 0; i < listOrg.size(); i++) {
                model1.addElement(listOrg.get(i));
            }
            Jlist1.setModel(model1);
        }
    }

}
