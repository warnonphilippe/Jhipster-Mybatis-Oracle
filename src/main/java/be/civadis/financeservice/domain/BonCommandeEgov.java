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
public class BonCommandeEgov {

    private String an_exercice;
    private Long num_doc;
    private Date date_doc;
    private String lib_1lg;
    private String lib_2lg;
    private Long id_info_art_budg;
    private Long id_info_depart;
    private String livraison_1lg;
    private String livraison_2lg;
    private String reduction_tva;
    private BigDecimal pourc_reduction_tva;
    private String mess_reduct_tva_1lg;
    private String mess_reduct_tva_2lg;
    private String responsable_dossier;
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
    private Long id_service;
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

    public String getReduction_tva() {
        return reduction_tva;
    }

    public void setReduction_tva(String reduction_tva) {
        this.reduction_tva = reduction_tva;
    }

    public BigDecimal getPourc_reduction_tva() {
        return pourc_reduction_tva;
    }

    public void setPourc_reduction_tva(BigDecimal pourc_reduction_tva) {
        this.pourc_reduction_tva = pourc_reduction_tva;
    }

    public String getMess_reduct_tva_1lg() {
        return mess_reduct_tva_1lg;
    }

    public void setMess_reduct_tva_1lg(String mess_reduct_tva_1lg) {
        this.mess_reduct_tva_1lg = mess_reduct_tva_1lg;
    }

    public String getMess_reduct_tva_2lg() {
        return mess_reduct_tva_2lg;
    }

    public void setMess_reduct_tva_2lg(String mess_reduct_tva_2lg) {
        this.mess_reduct_tva_2lg = mess_reduct_tva_2lg;
    }

    public String getResponsable_dossier() {
        return responsable_dossier;
    }

    public void setResponsable_dossier(String responsable_dossier) {
        this.responsable_dossier = responsable_dossier;
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

    public Long getId_service() {
        return id_service;
    }

    public void setId_service(Long id_service) {
        this.id_service = id_service;
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
