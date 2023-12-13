
package Sofware_EnvioMensajesAguaCarabayll.Controler;

/**
 *
 * @author Elvis
 */
public class Ubicacion {
    private String distrito;
    private String lote;
    private String manzana;
    private String etapa;
    
public Ubicacion(String distrito,String lote,String manzana,String etapa){
    this.distrito=distrito;
    this.lote=lote;
    this.manzana=manzana;
    this.etapa=etapa;
}

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getManzana() {
        return manzana;
    }

    public void setManzana(String manzana) {
        this.manzana = manzana;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

}
