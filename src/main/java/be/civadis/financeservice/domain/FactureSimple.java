package be.civadis.financeservice.domain;

import java.util.Date;

/**
 * Created by fca on 22-02-17.
 */
public class FactureSimple {

    private Long idInfo;
    private Long numeroArticle;
    private String commentaires;
    private String codeAttente;
    private Date dateDebut;
    private Date dateFin;
    private Long redevableId;
    private Adresse adresse;
    private Long reglementId;
    private Long centreEmetteurId;
    private Double montantHtva;
    private Double montantTva;
    private Double tauxTva;
    private Double montantTvac;

    public Long getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Long idInfo) {
        this.idInfo = idInfo;
    }

    public Long getNumeroArticle() {
        return numeroArticle;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getCodeAttente() {
        return codeAttente;
    }

    public void setCodeAttente(String codeAttente) {
        this.codeAttente = codeAttente;
    }

    public void setNumeroArticle(Long numeroArticle) {
        this.numeroArticle = numeroArticle;
    }

    public Long getRedevableId() {
        return redevableId;
    }

    public void setRedevableId(Long redevableId) {
        this.redevableId = redevableId;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Long getReglementId() {
        return reglementId;
    }

    public void setReglementId(Long reglementId) {
        this.reglementId = reglementId;
    }

    public Long getCentreEmetteurId() {
        return centreEmetteurId;
    }

    public void setCentreEmetteurId(Long centreEmetteurId) {
        this.centreEmetteurId = centreEmetteurId;
    }

    public Double getMontantTvac() {
        return montantTvac;
    }

    public void setMontantTvac(Double montantTvac) {
        this.montantTvac = montantTvac;
    }

    public String getCommentaires() {
        return commentaires;
    }

    public void setCommentaires(String commentaires) {
        this.commentaires = commentaires;
    }

    public Double getMontantHtva() {
        return montantHtva;
    }

    public void setMontantHtva(Double montantHtva) {
        this.montantHtva = montantHtva;
    }

    public Double getMontantTva() {
        return montantTva;
    }

    public void setMontantTva(Double montantTva) {
        this.montantTva = montantTva;
    }

    public Double getTauxTva() {
        return tauxTva;
    }

    public void setTauxTva(Double tauxTva) {
        this.tauxTva = tauxTva;
    }
}
