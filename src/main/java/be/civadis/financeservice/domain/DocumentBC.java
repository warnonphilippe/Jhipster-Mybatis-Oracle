package be.civadis.financeservice.domain;

/**
 *
 * Classe Java permettant de contenir
 * un document attache a un bon de commande
 *
 * User: fca
 * Date: 26/06/14
 * Time: 12:17
 * To change this template use File | Settings | File Templates.
 */
public class DocumentBC {

    private Long bonCommandeIdInfo;
    private byte[] document;
    private String typeDocument;
    private String nomDocument;
    private Long idDocument;
    private String codeRetour;


    public Long getBonCommandeIdInfo() {
        return bonCommandeIdInfo;
    }

    public void setBonCommandeIdInfo(Long bonCommandeIdInfo) {
        this.bonCommandeIdInfo = bonCommandeIdInfo;
    }

    public String getCodeRetour() {
        return codeRetour;
    }

    public void setCodeRetour(String codeRetour) {
        this.codeRetour = codeRetour;
    }

    public byte[] getDocument() {
        return document;
    }

    public void setDocument(byte[] document) {
        this.document = document;
    }

    public Long getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(Long idDocument) {
        this.idDocument = idDocument;
    }

    public String getNomDocument() {
        return nomDocument;
    }

    public void setNomDocument(String nomDocument) {
        this.nomDocument = nomDocument;
    }

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }
}
