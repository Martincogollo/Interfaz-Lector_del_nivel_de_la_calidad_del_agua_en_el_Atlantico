/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Martin
 */
public class ObjectoGeografico { 
    /// atributos
    private String nombreCuerpoAgua;
    private int ID;
    private String muncipio;
    private String TipoAgua;
    private String TipoCuerpoAgua;
   
    /// construtores 

    public ObjectoGeografico() {
    }

    public ObjectoGeografico(String nombreCuerpoAgua, int ID, String muncipio, String TipoAgua, String TipoCuerpoAgua) {
        this.nombreCuerpoAgua = nombreCuerpoAgua;
        this.ID = ID;
        this.muncipio = muncipio;
        this.TipoAgua = TipoAgua;
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }

    
    
    
    // get and set

    public String getNombreCuerpoAgua() {
        return nombreCuerpoAgua;
    }

    public void setNombreCuerpoAgua(String nombreCuerpoAgua) {
        this.nombreCuerpoAgua = nombreCuerpoAgua;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMuncipio() {
        return muncipio;
    }

    public void setMuncipio(String muncipio) {
        this.muncipio = muncipio;
    }

    public String getTipoAgua() {
        return TipoAgua;
    }

    public void setTipoAgua(String TipoAgua) {
        this.TipoAgua = TipoAgua;
    }

    public String getTipoCuerpoAgua() {
        return TipoCuerpoAgua;
    }

    public void setTipoCuerpoAgua(String TipoCuerpoAgua) {
        this.TipoCuerpoAgua = TipoCuerpoAgua;
    }
    
    
    
}
    


