/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author denni
 */
public class Paciente extends Persona implements Serializable{

    ArrayList<String> listEnfermedades;
    ArrayList<Evaluacion> listEvaluacion = new ArrayList();
    Date Entrada;
    Date Alta;
    String Sangre;
    String Causa;
    ArrayList<String> listAlergias;
    ArrayList<Organo> listOrganos;

    public Paciente(Date Entrada, Date Alta, String Sangre, String Causa, String Nombre, int Edad, int ID, double Altura, double Peso, String Sexo) {
        super(Nombre, Edad, ID, Altura, Peso, Sexo);
        this.Entrada = Entrada;
        this.Alta = Alta;
        this.Sangre = Sangre;
        this.Causa = Causa;
    }

    public Paciente(ArrayList Enfermedades, Date Entrada, Date Alta, String Sangre, String Causa, ArrayList<String> listAlergias, ArrayList<Organo> listOrganos, String Nombre, int Edad, int ID, double Altura, double Peso, String Sexo) {
        super(Nombre, Edad, ID, Altura, Peso, Sexo);
        this.listEnfermedades = Enfermedades;
        this.Entrada = Entrada;
        this.Alta = Alta;
        this.Sangre = Sangre;
        this.Causa = Causa;
        this.listAlergias = listAlergias;
        this.listOrganos = listOrganos;
    }

    public ArrayList<String> getListEnfermedades() {
        return listEnfermedades;
    }

    public void setListEnfermedades(ArrayList<String> listEnfermedades) {
        this.listEnfermedades = listEnfermedades;
    }

    public Date getEntrada() {
        return Entrada;
    }

    public void setEntrada(Date Entrada) {
        this.Entrada = Entrada;
    }

    public Date getAlta() {
        return Alta;
    }

    public void setAlta(Date Alta) {
        this.Alta = Alta;
    }

    public String getSangre() {
        return Sangre;
    }

    public void setSangre(String Sangre) {
        this.Sangre = Sangre;
    }

    public String getCausa() {
        return Causa;
    }

    public void setCausa(String Causa) {
        this.Causa = Causa;
    }

    public ArrayList<String> getListAlergias() {
        return listAlergias;
    }

    public void setListAlergias(ArrayList<String> listAlergias) {
        this.listAlergias = listAlergias;
    }

    public ArrayList<Organo> getListOrganos() {
        return listOrganos;
    }

    public void setListOrganos(ArrayList<Organo> listOrganos) {
        this.listOrganos = listOrganos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    @Override
    public String toString() {
        return this.Nombre;
    }

}
