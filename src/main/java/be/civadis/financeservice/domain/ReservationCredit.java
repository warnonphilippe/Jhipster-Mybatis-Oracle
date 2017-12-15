package be.civadis.financeservice.domain;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA.
 * User: phw
 * Date: 16/06/14
 * Time: 14:41
 * To change this template use File | Settings | File Templates.
 */
public class ReservationCredit {

    private Long id_info;
    private Long id_info_art_budget;
    private BigDecimal montant;
    private String lib_1lg;

    /*
    code_retour = 01 si diponible article dépassé
    code_retour = 02 si enveloppe dépassée
    code_retour = 03 si article erroné
    code_retour = 04 si montant erroné
    code_retour = 00 si OK
    code_retour = 98 si l'article budgetaire est bloque en comptabilite (lock par PB)
    code_retour = 99 si Problème l'hors de l'insert ou du delete
    */
    private String code_retour;

    public Long getId_info() {
        return id_info;
    }

    public void setId_info(Long id_info) {
        this.id_info = id_info;
    }

    public Long getId_info_art_budget() {
        return id_info_art_budget;
    }

    public void setId_info_art_budget(Long id_info_art_budget) {
        this.id_info_art_budget = id_info_art_budget;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getLib_1lg() {
        return lib_1lg;
    }

    public void setLib_1lg(String lib_1lg) {
        this.lib_1lg = lib_1lg;
    }

    public String getCode_retour() {
        return code_retour;
    }

    public void setCode_retour(String code_retour) {
        this.code_retour = code_retour;
    }
}
