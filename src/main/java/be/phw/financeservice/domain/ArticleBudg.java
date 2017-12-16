package be.phw.financeservice.domain;

public class ArticleBudg {

    private Long id;
    private Long exercice;
    private String code;
    private String nom;
    private String type;
    private String serviceBudget;
    private String millesime;
    private Boolean isMillesime;
    private String assujettissementTVA;
    private Double budgetInitial;
    private Double budgetEnCours;
    private Double creditsEnCours;
    private Double tousCredits;
    private Double montantReserveNonEngage;
    private Double montantEngage;
    private Double montantImpute;
    private Double disponible;
    private Double compteNMoins1;
    private Double compteNMoins2;
    private Double compteNMoins3;
    private Double compteNMoins4;
    private Double compteNMoins5;
    private Double montantAdapteNMoins1;
    private Double budgetNMoins1;
    private String groupeEconomique;
    private String codeEconomique;
    private String codeFonctionnel;
    private String codeProjet;
    private String codeEconomiqueComplet;

    public ArticleBudg() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExercice() {
        return exercice;
    }

    public void setExercice(Long exercice) {
        this.exercice = exercice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getServiceBudget() {
        return serviceBudget;
    }

    public void setServiceBudget(String serviceBudget) {
        this.serviceBudget = serviceBudget;
    }

    public String getMillesime() {
        return millesime;
    }

    public void setMillesime(Boolean millesime) {
        isMillesime = millesime;
    }

    public String getAssujettissementTVA() {
        return assujettissementTVA;
    }

    public void setAssujettissementTVA(String assujettissementTVA) {
        this.assujettissementTVA = assujettissementTVA;
    }

    public Double getBudgetInitial() {
        return budgetInitial;
    }

    public void setBudgetInitial(Double budgetInitial) {
        this.budgetInitial = budgetInitial;
    }

    public Double getBudgetEnCours() {
        return budgetEnCours;
    }

    public void setBudgetEnCours(Double budgetEnCours) {
        this.budgetEnCours = budgetEnCours;
    }

    public Double getCreditsEnCours() {
        return creditsEnCours;
    }

    public void setCreditsEnCours(Double creditsEnCours) {
        this.creditsEnCours = creditsEnCours;
    }

    public Double getTousCredits() {
        return tousCredits;
    }

    public void setTousCredits(Double tousCredits) {
        this.tousCredits = tousCredits;
    }

    public Double getMontantReserveNonEngage() {
        return montantReserveNonEngage;
    }

    public void setMontantReserveNonEngage(Double montantReserveNonEngage) {
        this.montantReserveNonEngage = montantReserveNonEngage;
    }

    public Double getMontantEngage() {
        return montantEngage;
    }

    public void setMontantEngage(Double montantEngage) {
        this.montantEngage = montantEngage;
    }

    public Double getMontantImpute() {
        return montantImpute;
    }

    public void setMontantImpute(Double montantImpute) {
        this.montantImpute = montantImpute;
    }

    public Double getDisponible() {
        return disponible;
    }

    public void setDisponible(Double disponible) {
        this.disponible = disponible;
    }

    public Double getCompteNMoins1() {
        return compteNMoins1;
    }

    public void setCompteNMoins1(Double compteNMoins1) {
        this.compteNMoins1 = compteNMoins1;
    }

    public Double getCompteNMoins2() {
        return compteNMoins2;
    }

    public void setCompteNMoins2(Double compteNMoins2) {
        this.compteNMoins2 = compteNMoins2;
    }

    public Double getCompteNMoins3() {
        return compteNMoins3;
    }

    public void setCompteNMoins3(Double compteNMoins3) {
        this.compteNMoins3 = compteNMoins3;
    }

    public Double getCompteNMoins4() {
        return compteNMoins4;
    }

    public void setCompteNMoins4(Double compteNMoins4) {
        this.compteNMoins4 = compteNMoins4;
    }

    public Double getCompteNMoins5() {
        return compteNMoins5;
    }

    public void setCompteNMoins5(Double compteNMoins5) {
        this.compteNMoins5 = compteNMoins5;
    }

    public Double getMontantAdapteNMoins1() {
        return montantAdapteNMoins1;
    }

    public void setMontantAdapteNMoins1(Double montantAdapteNMoins1) {
        this.montantAdapteNMoins1 = montantAdapteNMoins1;
    }

    public Double getBudgetNMoins1() {
        return budgetNMoins1;
    }

    public void setBudgetNMoins1(Double budgetNMoins1) {
        this.budgetNMoins1 = budgetNMoins1;
    }

    public String getGroupeEconomique() {
        return groupeEconomique;
    }

    public void setGroupeEconomique(String groupeEconomique) {
        this.groupeEconomique = groupeEconomique;
    }

    public String getCodeEconomique() {
        return codeEconomique;
    }

    public void setCodeEconomique(String codeEconomique) {
        this.codeEconomique = codeEconomique;
    }

    public String getCodeFonctionnel() {
        return codeFonctionnel;
    }

    public void setCodeFonctionnel(String codeFonctionnel) {
        this.codeFonctionnel = codeFonctionnel;
    }

    public String getCodeProjet() {
        return codeProjet;
    }

    public void setCodeProjet(String codeProjet) {
        this.codeProjet = codeProjet;
    }

    public String getCodeEconomiqueComplet() {
        return codeEconomiqueComplet;
    }

    public void setCodeEconomiqueComplet(String codeEconomiqueComplet) {
        this.codeEconomiqueComplet = codeEconomiqueComplet;
    }

    public void setMillesime(String millesime) {
        this.millesime = millesime;
    }
}
