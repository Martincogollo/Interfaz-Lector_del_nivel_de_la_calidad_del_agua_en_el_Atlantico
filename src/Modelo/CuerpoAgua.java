/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Martin
 */
public class CuerpoAgua extends ObjectoGeografico {
    private static  float Contador;
    private Double clasIRCA;

    public static float getContador() {
        return Contador;
    }

    public static void setContador(float Contador) {
        CuerpoAgua.Contador = Contador;
    }
    
    /// construstor 

    public CuerpoAgua( ) {
    }

    public CuerpoAgua(String nombreCuerpoAgua, int ID, String muncipio, String TipoAgua, String TipoCuerpoAgua, Double clasIRCA) {
        super(nombreCuerpoAgua, ID, muncipio, TipoAgua, TipoCuerpoAgua);
        this.clasIRCA=clasIRCA;
    }

   
    
    
    /// metodo
    public String nivelIRCA(){
    String nivel="NA";
        ///System.out.println(clasIRCA);
    if ( clasIRCA > 80 && clasIRCA <= 100){
      nivel = "INVIABLE SANITARIAMENTE";    
    } 
    else if (clasIRCA > 35 && clasIRCA <= 80) {
      nivel = "ALTO";
    } 
    else if (clasIRCA > 14 && clasIRCA <= 35) {
      nivel= "MEDIO";
      Contador++;
    } 
    else if (clasIRCA > 5 && clasIRCA <= 14) {
      nivel = "BAJO";
      Contador++;
    } 
    else if (clasIRCA > 0 && clasIRCA <= 5) {
      nivel= "SIN RIESGO";
      Contador++;
    }
     return nivel;
     }
    
    /// get and set 

    public Double getClasIRCA() {
        return clasIRCA;
    }

    public void setClasIRCA(Double clasIRCA) {
        this.clasIRCA = clasIRCA;
    }

   

   
    
    
}
