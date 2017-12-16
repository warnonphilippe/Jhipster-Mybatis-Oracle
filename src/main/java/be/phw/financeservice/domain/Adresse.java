package be.phw.financeservice.domain;

/**
 * Created by fca on 22-02-17.
 */
public class Adresse {

    private Long adrIdInfo;
    private Long adrIdInfoRue;
    private Integer adrNumero;
    private String adrIndice;
    private String adrBoite;
    private String adrComplement;
    private String adrTypeAdresse;

    public Long getAdrIdInfo() {
        return adrIdInfo;
    }

    public void setAdrIdInfo(Long adrIdInfo) {
        this.adrIdInfo = adrIdInfo;
    }

    public Long getAdrIdInfoRue() {
        return adrIdInfoRue;
    }

    public void setAdrIdInfoRue(Long adrIdInfoRue) {
        this.adrIdInfoRue = adrIdInfoRue;
    }

    public Integer getAdrNumero() {
        return adrNumero;
    }

    public void setAdrNumero(Integer adrNumero) {
        this.adrNumero = adrNumero;
    }

    public String getAdrIndice() {
        return adrIndice;
    }

    public void setAdrIndice(String adrIndice) {
        this.adrIndice = adrIndice;
    }

    public String getAdrBoite() {
        return adrBoite;
    }

    public void setAdrBoite(String adrBoite) {
        this.adrBoite = adrBoite;
    }

    public String getAdrComplement() {
        return adrComplement;
    }

    public void setAdrComplement(String adrComplement) {
        this.adrComplement = adrComplement;
    }

    public String getAdrTypeAdresse() {
        return adrTypeAdresse;
    }

    public void setAdrTypeAdresse(String adrTypeAdresse) {
        this.adrTypeAdresse = adrTypeAdresse;
    }
}
