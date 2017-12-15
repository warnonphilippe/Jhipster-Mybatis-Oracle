package be.civadis.financeservice.domain;

import be.civadis.financeservice.utils.CustomJsonDateDeserializer;
import be.civadis.financeservice.utils.CustomJsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;


/**
 * Created with IntelliJ IDEA.
 * User: fca
 * Date: 26/06/14
 * Time: 11:57
 * To change this template use File | Settings | File Templates.
 */
public class InfoTiers {

    private Long idInfo;
    private String numNiss;
    private String numBCE;
    private String nom;
    private String prenom;
    private Date dtNaiss;
    private String typTiers;
    private String codCivil;
    private String email;
    private String numTelephone;
    private String nomRue;
    private String numRue;
    private String boite;
    private String codPostal;
    private String localite;
    private String pays;
    private Long code_pays;
    private String nomRue2;
    private String numRue2;
    private String boite2;
    private String codPostal2;
    private String localite2;
    private String pays2;
    private Long code_pays2;
    private String comment;
    private String codeRetour;
    private String etatCession;
    private Long idInfoTiersRemp;
    private Date datePivot;

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("idInfo : " + idInfo);
        str.append("; nom : " + nom);
        str.append("; prenom : " + prenom);
        str.append("; codCivil : " + codCivil);
        str.append("; etatCession : " + etatCession);
        str.append("; datePivot : " + datePivot);
        return str.toString();
    }

    public Long getIdInfo() {
        return idInfo;
    }

    public void setIdInfo(Long idInfo) {
        this.idInfo = idInfo;
    }

    public String getNumNiss() {
        return numNiss;
    }

    public void setNumNiss(String numNiss) {
        this.numNiss = numNiss;
    }

    public String getNumBCE() {
        return numBCE;
    }

    public void setNumBCE(String numBCE) {
        this.numBCE = numBCE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTypTiers() {
        return typTiers;
    }

    public void setTypTiers(String typTiers) {
        this.typTiers = typTiers;
    }

    public String getCodCivil() {
        return codCivil;
    }

    public void setCodCivil(String codCivil) {
        this.codCivil = codCivil;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public String getNumRue() {
        return numRue;
    }

    public void setNumRue(String numRue) {
        this.numRue = numRue;
    }

    public String getBoite() {
        return boite;
    }

    public void setBoite(String boite) {
        this.boite = boite;
    }

    public String getCodPostal() {
        return codPostal;
    }

    public void setCodPostal(String codPostal) {
        this.codPostal = codPostal;
    }

    public String getLocalite() {
        return localite;
    }

    public void setLocalite(String localite) {
        this.localite = localite;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public Long getCode_pays() {
        return code_pays;
    }

    public void setCode_pays(Long code_pays) {
        this.code_pays = code_pays;
    }

    public String getNomRue2() {
        return nomRue2;
    }

    public void setNomRue2(String nomRue2) {
        this.nomRue2 = nomRue2;
    }

    public String getNumRue2() {
        return numRue2;
    }

    public void setNumRue2(String numRue2) {
        this.numRue2 = numRue2;
    }

    public String getBoite2() {
        return boite2;
    }

    public void setBoite2(String boite2) {
        this.boite2 = boite2;
    }

    public String getCodPostal2() {
        return codPostal2;
    }

    public void setCodPostal2(String codPostal2) {
        this.codPostal2 = codPostal2;
    }

    public String getLocalite2() {
        return localite2;
    }

    public void setLocalite2(String localite2) {
        this.localite2 = localite2;
    }

    public String getPays2() {
        return pays2;
    }

    public void setPays2(String pays2) {
        this.pays2 = pays2;
    }

    public Long getCode_pays2() {
        return code_pays2;
    }

    public void setCode_pays2(Long code_pays2) {
        this.code_pays2 = code_pays2;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCodeRetour() {
        return codeRetour;
    }

    public void setCodeRetour(String codeRetour) {
        this.codeRetour = codeRetour;
    }

    @JsonSerialize(using = CustomJsonDateSerializer.class)
    public Date getDtNaiss() {
        return dtNaiss;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setDtNaiss(Date dtNaiss) {
        this.dtNaiss = dtNaiss;
    }

    public String getEtatCession() {
        return etatCession;
    }

    public void setEtatCession(String etatCession) {
        this.etatCession = etatCession;
    }

    public Long getIdInfoTiersRemp() {
        return idInfoTiersRemp;
    }

    public void setIdInfoTiersRemp(Long idInfoTiersRemp) {
        this.idInfoTiersRemp = idInfoTiersRemp;
    }

    @JsonSerialize(using = CustomJsonDateSerializer.class)
    public Date getDatePivot() {
        return datePivot;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setDatePivot(Date datePivot) {
        this.datePivot = datePivot;
    }
}
