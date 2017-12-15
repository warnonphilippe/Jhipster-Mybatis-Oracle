package be.civadis.financeservice.utils;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Handler à fournir à Mybatis en cas de stockage de boolean sous forme de char(1) en db.
 * Le dataHandler par défaut converti bien le char vers du boolean
 * Par contre problème de conversion de boolean vers char (semble avoir du mal à détecter la taille du char cible, existe p-e un param à définir ?)
 *
 * @author phw
 */
@MappedJdbcTypes(JdbcType.CHAR)
public class BooleanAsChar1Handler extends BaseTypeHandler<Boolean> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, convert(parameter));
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return convert(rs.getString(columnName));
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return convert(resultSet.getString(i));
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return convert(cs.getString(columnIndex));
    }

    private String convert(Boolean value){
        String c;
        if (Boolean.TRUE.equals(value)){
            c = "1";
        } else {
            c = "0";
        }
        return c;
    }

    private Boolean convert(String value){
        if (value != null){
            if (value.equals("1")){
                return true;
            } else if (value.equalsIgnoreCase("v")){
                return true;
            } else if (value.equalsIgnoreCase("t")){
                return true;
            } else if (value.equalsIgnoreCase("o")){
                return true;
            } else if (value.equalsIgnoreCase("y")){
                return true;
            }
        }
        return false;
    }
}
