package be.civadis.financeservice.domain;

/**
 * Created by dab on 19/10/2015.
 */
public class DelReservCredit {
    private Long id_info;
    private String code_retour;

    public Long getId_info() {
        return id_info;
    }

    public void setId_info(Long id_info) {
        this.id_info = id_info;
    }

    public String getCode_retour() {
        return code_retour;
    }

    public void setCode_retour(String code_retour) {
        this.code_retour = code_retour;
    }

}
