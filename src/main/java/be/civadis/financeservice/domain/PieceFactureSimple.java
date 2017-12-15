package be.civadis.financeservice.domain;

/**
 * Created by fca on 07-04-17.
 */
public class PieceFactureSimple {

    private Long idInfo;
    private String mimeType;
    private String filename;
    private byte[] contenu;
    private boolean aImprimer;

    public Long getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Long idInfo) {
        this.idInfo = idInfo;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getContenu() {
        return contenu;
    }

    public void setContenu(byte[] contenu) {
        this.contenu = contenu;
    }

    public boolean isaImprimer() {
        return aImprimer;
    }

    public void setaImprimer(boolean aImprimer) {
        this.aImprimer = aImprimer;
    }
}
