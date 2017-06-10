/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.pkg2_lab_8_dennischirinos;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 *
 * @author denni
 */
public class Generador<Generic> {

    public Generic generic;
    int Num_Atributes;
    String SpinnerName;
    int NumSpinners = 0;
    int NumTextFields = 0;
    String DoubleTextFieldName;
    String StrTextFieldName;
    Field[] SuperDeclaredFields;
    Field[] DeclaredFields;

    /**
     * public class Generador, una clase que ayuda a crear codigo rapido y
     * sencillo para crear hasta esta version: Crear codigo que pida Atributos,
     * ambos con JOptionPane y JavaSwing. Crear modelos para JTable.
     */
    public Generador(Generic generic) {
        this.generic = generic;
        this.Num_Atributes = this.generic.getClass().getDeclaredFields().length;
        this.SuperDeclaredFields = this.generic.getClass().getSuperclass().getDeclaredFields();
        this.DeclaredFields = this.generic.getClass().getDeclaredFields();
    }

    /**
     * Devuelve el Nombre, Nombre Simple, la clase padre, numero de atributos,
     * numero de atributos de la superclase, y una lista de Atributos y su tipo
     * para la clase generica puesta en el constructor. para propositos de
     * debug.
     */
    public String Mostrar() {
        Generic c = this.generic;
        String Ret = "";
        System.out.println(c.getClass().getName());
        Ret += c.getClass().getName() + "\n";
        System.out.println(c.getClass().getSimpleName());
        Ret += c.getClass().getSimpleName() + "\n";
        System.out.println("Numero de Metodos: " + c.getClass().getMethods().length);
        Ret += "Numero de Metodos: " + c.getClass().getMethods().length;
        System.out.println("Is extended by: " + c.getClass().getSuperclass().getSimpleName());
        Ret += "Is extended by: " + c.getClass().getSuperclass().getSimpleName() + "\n";
        System.out.println("Numero de atributos: " + c.getClass().getDeclaredFields().length);
        Ret += "Numero de atributos: " + c.getClass().getDeclaredFields().length + "\n";
        System.out.println("Numero de atributos (Superclase) : " + c.getClass().getSuperclass().getDeclaredFields().length);
        Ret += "Numero de atributos (Superclase) : " + c.getClass().getSuperclass().getDeclaredFields().length + "\n";
        Field[] declaredFields = c.getClass().getDeclaredFields();
        Field[] SuperDeclaredFields = this.SuperDeclaredFields;
        for (int i = 0; i < SuperDeclaredFields.length; i++) {
            System.out.println(SuperDeclaredFields[i].getType().getSimpleName() + " " + SuperDeclaredFields[i].getName() + ";");
            Ret += SuperDeclaredFields[i].getType().getSimpleName() + " " + SuperDeclaredFields[i].getName() + ";";
        }
        for (int i = 0; i < declaredFields.length; i++) {
            System.out.println(declaredFields[i].getType().getSimpleName() + " " + declaredFields[i].getName() + ";");
            Ret += declaredFields[i].getType().getSimpleName() + " " + declaredFields[i].getName() + ";";
        }
        return Ret;
    }

    /**
     * Crea un codigo de un metodo que pide con JOptionPane todos los atributos
     * de la clase y dicho metodo devuelve la clase generica
     */
    public void Crear() {
        String ret = "";
        String NombreClase = this.generic.getClass().getSimpleName();
        ret += "public static " + NombreClase + " Crear" + NombreClase + "(int Serie) {\n";
        System.out.println("public static " + NombreClase + " Crear" + NombreClase + "(int Serie) {");
        int NumVariables = this.generic.getClass().getSuperclass().getDeclaredFields().length;
        int NumVariables2 = this.generic.getClass().getDeclaredFields().length;
        Field[] SuperDeclaredFields = this.generic.getClass().getSuperclass().getDeclaredFields();
        Field[] DeclaredFields = this.generic.getClass().getDeclaredFields();
        for (int i = 0; i < NumVariables; i++) {
            boolean notParseable = true;
            String Tipo = SuperDeclaredFields[i].getType().getSimpleName();
            String Dato = SuperDeclaredFields[i].getName();
            switch (Tipo) {
                case "int":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("Integer.parseInt(JOptionPane.showInputDialog(");
                    break;
                case "double":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("Double.parseDouble(JOptionPane.showInputDialog(");
                    break;
                case "String":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("(JOptionPane.showInputDialog(");
                    break;
                case "boolean":
                    notParseable = false;
                    System.out.print("int op = ");
                    System.out.println("JOptionPane.showConfirmDialog(null, \"" + Dato + "?\");");
                    System.out.println(Tipo + " " + Dato + " = " + "(op==0);");
                    break;
                case "Date":
                    notParseable = false;
                    System.out.println(Tipo + " " + Dato + " = new Date();");
                    break;
                default:
                    notParseable = false;
                    break;
            }
            // char 34 es ( " ), tuve que usar char porque no se como poner comillas en los souts...
            if (notParseable) {
                System.out.print((char) 34);
                System.out.print(Dato + ": ");
                System.out.print((char) 34);
                System.out.println("));");
            }
        }
        for (int i = 0; i < NumVariables2; i++) {
            boolean notParseable = true;
            String Tipo = DeclaredFields[i].getType().getSimpleName();
            String Dato = DeclaredFields[i].getName();
            switch (Tipo) {
                case "int":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("Integer.parseInt(JOptionPane.showInputDialog(");
                    break;
                case "double":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("Double.parseDouble(JOptionPane.showInputDialog(");
                    break;
                case "String":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.print("(JOptionPane.showInputDialog(");
                    break;
                case "boolean":
                    notParseable = false;
                    System.out.print("int op = ");
                    System.out.println("JOptionPane.showConfirmDialog(null, \"" + Dato + "?\");");
                    System.out.println(Tipo + " " + Dato + " = " + "(op==0);");
                    break;
                case "Date":
                    notParseable = false;
                    System.out.println(Tipo + " " + Dato + " = new Date();");
                    break;
                default:
                    notParseable = false;
                    break;
            }
            // char 34 es ( " ), tuve que usar char porque no se como poner comillas en los souts...
            if (notParseable) {
                System.out.print((char) 34);
                System.out.print(Dato + ": ");
                System.out.print((char) 34);
                System.out.println("));");
            }
        }

        System.out.print(NombreClase + " c = new " + NombreClase + "(");
        /*
            -------------OJO----------------------
            Aqui no pude hacer que tirara los valores que queria en el orden que es, si alguien quiere Arreglarlo, digame.
            En la parte que es:                    
                                                
                    NombreClase c = new NombreClase();
            
            Poner Ctrl+Space y enter en medio de los parentesis y Netbeans Automaticamente hace el que tiene mas sentido
            --------------------------------------
         */
 /*System.out.print("Serie, ");
            for (int i = 0;i<NumVariables;i++) {
                System.out.print(Variables.get(i)+", ");
            }*/
        System.out.println(");");
        System.out.println("return c;");
        System.out.println("}");
        System.out.println("");
    }

    /**
     * Crea un codigo de un metodo que pide con Java Swing prestablecido todos
     * los atributos de la clase y dicho metodo devuelve la clase generica. para
     * los int se pide con spinner. para string y double se pide con TextField.
     * para Date se crea un new Date y para boolean se crea con
     * JoptionPane.showConfirmDialog. El nombre de los swing se puede cambiar
     * con los setters.
     */
    public void CrearGrafico() {
        String ret = "";
        String NombreClase = this.generic.getClass().getSimpleName();
        ret += "public " + NombreClase + " Crear" + NombreClase + "(int Serie) {\n";
        System.out.println("public static " + NombreClase + " Crear" + NombreClase + "(int Serie) {");
        Field[] declaredFields = this.DeclaredFields;
        int NumVariables = this.DeclaredFields.length;
        for (int i = 0; i < NumVariables; i++) {
            boolean notParseable = false;
            String Tipo = declaredFields[i].getType().getSimpleName();
            String Dato = declaredFields[i].getName();
            switch (Tipo) {
                case "int":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println("(int) " + this.SpinnerName + this.NumSpinners + ".getValue();");
                    NumSpinners++;
                    break;
                case "double":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println("Double.parseDouble(" + this.getDoubleTextFieldName() + ".getText()" + ")");
                    break;
                case "String":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println(this.StrTextFieldName + ".getText();");
                    break;
                case "boolean":
                    notParseable = false;
                    System.out.print("int op = ");
                    System.out.println("JOptionPane.showConfirmDialog(null, \"" + Dato + "?\");");
                    System.out.println(Tipo + " " + Dato + " = " + "(op==0);");
                    break;
                case "Date":
                    notParseable = false;
                    System.out.println(Tipo + " " + Dato + " = new Date();");
                    break;
                default:
                    notParseable = false;
                    break;
            }
            // char 34 es ( " ), tuve que usar char porque no se como poner comillas en los souts...
            if (notParseable) {
                System.out.print((char) 34);
                System.out.print(Dato + ": ");
                System.out.print((char) 34);
                System.out.println("));");
            }
        }
        NumVariables = this.SuperDeclaredFields.length;
        for (int i = 0; i < NumVariables; i++) {
            boolean notParseable = false;
            String Tipo = this.SuperDeclaredFields[i].getType().getSimpleName();
            String Dato = this.SuperDeclaredFields[i].getName();
            switch (Tipo) {
                case "int":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println("(int) " + this.SpinnerName + this.NumSpinners + ".getValue();");
                    NumSpinners++;
                    break;
                case "double":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println("Double.parseDouble(" + this.getDoubleTextFieldName() + ".getText()" + ");");
                    break;
                case "String":
                    System.out.print(Tipo + " " + Dato + " = ");
                    System.out.println(this.StrTextFieldName + ".getText();");
                    break;
                case "boolean":
                    notParseable = false;
                    System.out.print("int op = ");
                    System.out.println("JOptionPane.showConfirmDialog(null, \"" + Dato + "?\");");
                    System.out.println(Tipo + " " + Dato + " = " + "(op==0);");
                    break;
                case "Date":
                    notParseable = false;
                    System.out.println(Tipo + " " + Dato + " = new Date();");
                    break;
                default:
                    notParseable = false;
                    break;
            }
            // char 34 es ( " ), tuve que usar char porque no se como poner comillas en los souts...
            if (notParseable) {
                System.out.print((char) 34);
                System.out.print(Dato + ": ");
                System.out.print((char) 34);
                System.out.println("));");
            }
        }

        System.out.print(NombreClase + " c = new " + NombreClase + "(");
        /*
            -------------OJO----------------------
            Aqui no pude hacer que tirara los valores que queria en el orden que es, si alguien quiere Arreglarlo, digame.
            En la parte que es:                    
                                                
                    NombreClase c = new NombreClase();
            
            Poner Ctrl+Space y enter en medio de los parentesis y Netbeans Automaticamente hace el que tiene mas sentido
            --------------------------------------
         */
        System.out.println(");");
        System.out.println("return c;");
        System.out.println("}");
        System.out.println("");
    }

    /**
     * Crea un codigo para hacer un modelo de JTable, NO es un metodo, sino que
     * se pone en uno, ejemplo: un metodo click, se pone el nombre de la lista a
     * usar, y el nombre de la tabla que va usar el modelo.
     */
    public void ListModelCreator(String NombreLista, String NombreTabla) {
        ArrayList<String> Atributos = new ArrayList();
        System.out.println("");
        System.out.println("DefaultTableModel model = new DefaultTableModel();");
        int NumVariables = this.Num_Atributes;
        String Lista = NombreLista;
        for (int i = 0; i < NumVariables; i++) {
            String Dato = this.DeclaredFields[i].getName();
            Atributos.add(Dato);
            System.out.println("model.addColumn(\""
                    + Dato + "\");");
        }
        System.out.println("if (" + Lista + ".size() >= 0) {");
        System.out.println("Object[] o = new Object[model.getColumnCount()];");
        System.out.println("for (int i = 0; i < " + Lista + ".size(); i++) {");
        for (int i = 0; i <= NumVariables; i++) {
            try {
                System.out.println("o[" + i + "] = " + Lista + ".get(i).get" + Atributos.get(i) + "();");
            } catch (Exception e) {
            }

        }
        System.out.println("model.addRow(o);");
        System.out.println("}");
        System.out.println("}");
        String Tabla = NombreTabla;
        System.out.println(Tabla + ".setModel(model);");
    }

    /**
     * settea el nombre de los spinners, para el CrearGrafico, para los spinners
     * va a escribir asi: Spinner0, Spinner1, Spinner2, etc...
     */
    public void SetSpinnerName(String SpinnerName) {
        System.out.println("Algo");
        this.SpinnerName = SpinnerName;
    }

    public int getNum_Atributes() {
        return Num_Atributes;
    }

    public void setNum_Atributes(int Num_Atributes) {
        this.Num_Atributes = Num_Atributes;
    }

    public int getNumSpinners() {
        return NumSpinners;
    }

    public void setNumSpinners(int NumSpinners) {
        this.NumSpinners = NumSpinners;
    }

    public int getNumTextFields() {
        return NumTextFields;
    }

    public void setNumTextFields(int NumTextFields) {
        this.NumTextFields = NumTextFields;
    }

    public String getDoubleTextFieldName() {
        return DoubleTextFieldName;
    }

    public void setDoubleTextFieldName(String DoubleTextFieldName) {
        this.DoubleTextFieldName = DoubleTextFieldName;
    }

    public String getStrTextFieldName() {
        return StrTextFieldName;
    }

    /**
     * settea el nombre de los TextField, para el CrearGrafico, para los
     * TextField va a escribir asi: TextField0, TextField1, TextField2, etc...
     */
    public void setStrTextFieldName(String StrTextFieldName) {
        this.StrTextFieldName = StrTextFieldName;
    }

    public Generic getObject() {
        return generic;
    }

    public void setObject(Generic generic) {
        this.generic = generic;
    }

    public String getSpinnerName() {
        return SpinnerName;
    }

    public void setSpinnerName(String SpinnerName) {
        this.SpinnerName = SpinnerName;
    }

    public Field[] getSuperDeclaredFields() {
        return SuperDeclaredFields;
    }

    public void setSuperDeclaredFields(Field[] SuperDeclaredFields) {
        this.SuperDeclaredFields = SuperDeclaredFields;
    }

    /**
     * @deprecated
     *
     */
    public Field[] getDeclaredFields() {
        return DeclaredFields;
    }

    public void setDeclaredFields(Field[] DeclaredFields) {
        this.DeclaredFields = DeclaredFields;
    }

}
