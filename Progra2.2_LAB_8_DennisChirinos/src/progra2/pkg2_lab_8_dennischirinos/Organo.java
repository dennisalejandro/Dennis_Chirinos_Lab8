/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author denni
 */
public class Organo implements Serializable{

    Color color;
    String Nombre;
    int NVL_Efectividad;
    int NVL_Potenciado;
    int NVL_prueba;
    static int Estomago = 52580;
    static int Hígado = 69864;
    static int Cerebro = 600000;
    static int Páncreas = 984236;
    static int Corazón = 21546;
    static int Pulmones = 589213;
    static int Riñones = 753266;

    public Organo(Color color, String Nombre, int NVL_Efectividad, int NVL_Potenciado, int NVL_prueba) {
        this.color = color;
        this.Nombre = Nombre;
        this.NVL_Efectividad = NVL_Efectividad;
        this.NVL_Potenciado = NVL_Potenciado;
        this.NVL_prueba = NVL_prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNVL_Efectividad() {
        return NVL_Efectividad;
    }

    public void setNVL_Efectividad(int NVL_Efectividad) {
        this.NVL_Efectividad = NVL_Efectividad;
    }

    public int getNVL_Potenciado() {
        return NVL_Potenciado;
    }

    public void setNVL_Potenciado(int NVL_Potenciado) {
        this.NVL_Potenciado = NVL_Potenciado;
    }

    public int getNVL_prueba() {
        return NVL_prueba;
    }

    public void setNVL_prueba(int NVL_prueba) {
        this.NVL_prueba = NVL_prueba;
    }

    public static int getEstomago() {
        return Estomago;
    }

    public static void setEstomago(int Estomago) {
        Organo.Estomago = Estomago;
    }

    public static int getHígado() {
        return Hígado;
    }

    public static void setHígado(int Hígado) {
        Organo.Hígado = Hígado;
    }

    public static int getCerebro() {
        return Cerebro;
    }

    public static void setCerebro(int Cerebro) {
        Organo.Cerebro = Cerebro;
    }

    public static int getPáncreas() {
        return Páncreas;
    }

    public static void setPáncreas(int Páncreas) {
        Organo.Páncreas = Páncreas;
    }

    public static int getCorazón() {
        return Corazón;
    }

    public static void setCorazón(int Corazón) {
        Organo.Corazón = Corazón;
    }

    public static int getPulmones() {
        return Pulmones;
    }

    public static void setPulmones(int Pulmones) {
        Organo.Pulmones = Pulmones;
    }

    public static int getRiñones() {
        return Riñones;
    }

    public static void setRiñones(int Riñones) {
        Organo.Riñones = Riñones;
    }

    @Override
    public String toString() {
        return this.Nombre + ": " + this.NVL_Efectividad + ", " + this.NVL_Potenciado + ", " + this.NVL_prueba;
    }

}
