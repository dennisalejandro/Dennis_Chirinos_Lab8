/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.util.ArrayList;
import javax.swing.JTree;
import javax.swing.tree.*;

/**
 *
 * @author denni
 */
public class Thr_Tree implements Runnable {

    JTree Jtree;
    ArrayList<Paciente> listPacientes;
    ArrayList listDoctores;

    public Thr_Tree(JTree Jtree, ArrayList listPacientes, ArrayList listDoctores) {
        this.Jtree = Jtree;
        this.listPacientes = listPacientes;
        this.listDoctores = listDoctores;
    }

    @Override
    public void run() {
        while (true) {
            //DefaultMutableTreeNode root = new DefaultMutableTreeNode("Informacion: ");
            //DefaultTreeModel model = new DefaultTreeModel(root);
            //Jtree.setModel(model);
        }
    }

}
