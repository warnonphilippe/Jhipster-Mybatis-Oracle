package be.civadis.financeservice.domain;

import be.civadis.financeservice.utils.CustomJsonDateDeserializer;
import be.civadis.financeservice.utils.CustomJsonDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: phw
 * Date: 16/06/14
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class BonCommande {

    private String an_exercice;
    private Long num_doc;
    private Date date_doc;
    private String lib_1lg;
    private String lib_2lg;
    private Long id_info_art_budg;
    private Long id_info_depart;
    private String livraison_1lg;
    private String livraison_2lg;
    private String texte_1;
    private BigDecimal decimal_1;
    private String message_1lg;
    private String message_2lg;
    private String texte_2;
    private String reference;
    private String reference_struct;
    private Date date_ech;
    private Long tiers_id_info;
    private BigDecimal mnt_ttc_euro;
    private BigDecimal mnt_tva_euro;
    private Boolean is_assujetti_tva_bc;
    private BigDecimal pourcentage_tva_bc;
    private BigDecimal base_imposable_bc;
    private BigDecimal tva_a_declarer_bc;
    private Long id_info_ser;
    private Long id_marche_3p;
    private String num_lot_3p;
    private Long id_info_reserv;
    private Long id_info;

    /*
    retour renvoyé par Phenix suite au traitment du BC
    si OK, 00
    sinon, contient la concat des erreurs eventuelles (A vérifier)
        ex : 02:al_id_info_art_budget|02:al_tiers
        où :
            01 : Zone(s) obligatoire(s)
            02 : Zone(s) érronée(s)
            03 : Problème de monants
            04 : Problème de numérotation
            05 : Incompatibilitée tiers/article
            98 : Problème l'hors de l'insert (lignes)
            99 : Problème l'hors de l'insert (document)
    */
    private String codeRetour;

    public String getAn_exercice() {
        return an_exercice;
    }

    public void setAn_exercice(String an_exercice) {
        this.an_exercice = an_exercice;
    }

    public Long getNum_doc() {
        return num_doc;
    }

    public void setNum_doc(Long num_doc) {
        this.num_doc = num_doc;
    }

    @JsonSerialize(using = CustomJsonDateSerializer.class)
    public Date getDate_doc() {
        return date_doc;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setDate_doc(Date date_doc) {
        this.date_doc = date_doc;
    }

    public String getLib_1lg() {
        return lib_1lg;
    }

    public void setLib_1lg(String lib_1lg) {
        this.lib_1lg = lib_1lg;
    }

    public String getLib_2lg() {
        return lib_2lg;
    }

    public void setLib_2lg(String lib_2lg) {
        this.lib_2lg = lib_2lg;
    }

    public Long getId_info_art_budg() {
        return id_info_art_budg;
    }

    public void setId_info_art_budg(Long id_info_art_budg) {
        this.id_info_art_budg = id_info_art_budg;
    }

    public Long getId_info_depart() {
        return id_info_depart;
    }

    public void setId_info_depart(Long id_info_depart) {
        this.id_info_depart = id_info_depart;
    }

    public String getLivraison_1lg() {
        return livraison_1lg;
    }

    public void setLivraison_1lg(String livraison_1lg) {
        this.livraison_1lg = livraison_1lg;
    }

    public String getLivraison_2lg() {
        return livraison_2lg;
    }

    public void setLivraison_2lg(String livraison_2lg) {
        this.livraison_2lg = livraison_2lg;
    }

    public String getTexte_1() {
        return texte_1;
    }

    public void setTexte_1(String texte_1) {
        this.texte_1 = texte_1;
    }

    public BigDecimal getDecimal_1() {
        return decimal_1;
    }

    public void setDecimal_1(BigDecimal decimal_1) {
        this.decimal_1 = decimal_1;
    }

    public String getMessage_1lg() {
        return message_1lg;
    }

    public void setMessage_1lg(String message_1lg) {
        this.message_1lg = message_1lg;
    }

    public String getMessage_2lg() {
        return message_2lg;
    }

    public void setMessage_2lg(String message_2lg) {
        this.message_2lg = message_2lg;
    }

    public String getTexte_2() {
        return texte_2;
    }

    public void setTexte_2(String texte_2) {
        this.texte_2 = texte_2;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getReference_struct() {
        return reference_struct;
    }

    public void setReference_struct(String reference_struct) {
        this.reference_struct = reference_struct;
    }

    @JsonSerialize(using = CustomJsonDateSerializer.class)
    public Date getDate_ech() {
        return date_ech;
    }

    @JsonDeserialize(using = CustomJsonDateDeserializer.class)
    public void setDate_ech(Date date_ech) {
        this.date_ech = date_ech;
    }

    public Long getTiers_id_info() {
        return tiers_id_info;
    }

    public void setTiers_id_info(Long tiers_id_info) {
        this.tiers_id_info = tiers_id_info;
    }

    public BigDecimal getMnt_ttc_euro() {
        return mnt_ttc_euro;
    }

    public void setMnt_ttc_euro(BigDecimal mnt_ttc_euro) {
        this.mnt_ttc_euro = mnt_ttc_euro;
    }

    public BigDecimal getMnt_tva_euro() {
        return mnt_tva_euro;
    }

    public void setMnt_tva_euro(BigDecimal mnt_tva_euro) {
        this.mnt_tva_euro = mnt_tva_euro;
    }

    public Boolean getIs_assujetti_tva_bc() {
        return is_assujetti_tva_bc;
    }

    public void setIs_assujetti_tva_bc(Boolean is_assujetti_tva_bc) {
        this.is_assujetti_tva_bc = is_assujetti_tva_bc;
    }

    public BigDecimal getPourcentage_tva_bc() {
        return pourcentage_tva_bc;
    }

    public void setPourcentage_tva_bc(BigDecimal pourcentage_tva_bc) {
        this.pourcentage_tva_bc = pourcentage_tva_bc;
    }

    public BigDecimal getBase_imposable_bc() {
        return base_imposable_bc;
    }

    public void setBase_imposable_bc(BigDecimal base_imposable_bc) {
        this.base_imposable_bc = base_imposable_bc;
    }

    public BigDecimal getTva_a_declarer_bc() {
        return tva_a_declarer_bc;
    }

    public void setTva_a_declarer_bc(BigDecimal tva_a_declarer_bc) {
        this.tva_a_declarer_bc = tva_a_declarer_bc;
    }

    public Long getId_info_ser() {
        return id_info_ser;
    }

    public void setId_info_ser(Long id_info_ser) {
        this.id_info_ser = id_info_ser;
    }

    public Long getId_marche_3p() {
        return id_marche_3p;
    }

    public void setId_marche_3p(Long id_marche_3p) {
        this.id_marche_3p = id_marche_3p;
    }

    public String getNum_lot_3p() {
        return num_lot_3p;
    }

    public void setNum_lot_3p(String num_lot_3p) {
        this.num_lot_3p = num_lot_3p;
    }

    public Long getId_info_reserv() {
        return id_info_reserv;
    }

    public void setId_info_reserv(Long id_info_reserv) {
        this.id_info_reserv = id_info_reserv;
    }

    public Long getId_info() {
        return id_info;
    }

    public void setId_info(Long id_info) {
        this.id_info = id_info;
    }

    public String getCodeRetour() {
        return codeRetour;
    }

    public void setCodeRetour(String codeRetour) {
        this.codeRetour = codeRetour;
    }
}
