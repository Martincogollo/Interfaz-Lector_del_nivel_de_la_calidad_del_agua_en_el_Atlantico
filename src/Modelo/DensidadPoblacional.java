
package Modelo;


public class DensidadPoblacional extends ObjectoGeografico {
    ///atributos
    private int Nhabitantes; 
    /// construtor

    public DensidadPoblacional() {
    }
    

    public DensidadPoblacional(int Nhabitantes) {
        this.Nhabitantes = Nhabitantes;
    }

    public DensidadPoblacional(int Nhabitantes, String nombreCuerpoAgua, int ID, String muncipio, String TipoAgua, String TipoCuerpoAgua) {
        super(nombreCuerpoAgua, ID, muncipio, TipoAgua, TipoCuerpoAgua);
        this.Nhabitantes = Nhabitantes;
    }
    
    /// metodo
    public int Afeccion(){
    int afeccion;
    if ( Nhabitantes < 10000 ){
      afeccion = 0;    
    } 
    else if (Nhabitantes>=10000 && Nhabitantes <=50000) {
      afeccion = 1;
    } 
    else{
        afeccion =2;
    }

     return afeccion;
     }
     /// get and set
    public int getNhabitantes() {
        return Nhabitantes;
    }

    public void setNhabitantes(int Nhabitantes) {
        this.Nhabitantes = Nhabitantes;
    }
   
}
