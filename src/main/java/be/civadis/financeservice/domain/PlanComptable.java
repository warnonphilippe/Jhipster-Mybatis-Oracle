package be.civadis.financeservice.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: dco
 * Date: 3/02/16
 * Time: 15:16
 * To change this template use File | Settings | File Templates.
 */
public class PlanComptable {

    private String compteGeneral;
    private List<String> compteGenerauxContrepartieList;

    public PlanComptable() {
        compteGenerauxContrepartieList = new ArrayList<String>();
    }

    public String getCompteGeneral() {
        return compteGeneral;
    }

    public void setCompteGeneral(String compteGeneral) {
        this.compteGeneral = compteGeneral;
    }

    public List<String> getCompteGenerauxContrepartieList() {
        return compteGenerauxContrepartieList;
    }

    public void setCompteGenerauxContrepartieList(List<String> compteGenerauxContrepartieList) {
        this.compteGenerauxContrepartieList = compteGenerauxContrepartieList;
    }
}
