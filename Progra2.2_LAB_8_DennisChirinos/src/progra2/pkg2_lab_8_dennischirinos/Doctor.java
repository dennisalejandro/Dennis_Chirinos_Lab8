/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author denni
 */
public class Doctor extends Persona {

    int Años;
    Date Entrada;
    Date Salida;
    ArrayList<String> Dias;
    ArrayList<Paciente> listPaciente;

    public Doctor(int Años, Date Entrada, Date Salida, ArrayList<String> Dias, ArrayList<Paciente> listPaciente, String Nombre, int Edad, int ID, double Altura, double Peso, String Sexo) {
        super(Nombre, Edad, ID, Altura, Peso, Sexo);
        this.Años = Años;
        this.Entrada = Entrada;
        this.Salida = Salida;
        this.Dias = Dias;
        this.listPaciente = listPaciente;
    }

}
