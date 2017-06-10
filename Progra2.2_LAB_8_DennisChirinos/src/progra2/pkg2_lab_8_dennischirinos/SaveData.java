/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class SaveData {

    File Archivo = new File("./Data.txt");

    public void Save(ArrayList<Paciente> listP) {
        try {
            FileOutputStream fos = new FileOutputStream(Archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(listP);
            oos.flush();
            oos.close();
        } catch (Exception e) {
        }
    }
    public ArrayList<Paciente> LoadBinario() {
        ArrayList<Paciente> list = new ArrayList();
        try {
            FileInputStream fis = new FileInputStream(Archivo);
            ObjectInputStream OIS = new ObjectInputStream(fis);
            list = (ArrayList<Paciente>) OIS.readObject();
            OIS.close();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
