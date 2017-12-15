package be.civadis.financeservice.utils;

/**
 * Created with IntelliJ IDEA.
 * User: phw
 * Date: 17/06/14
 * Time: 8:43
 * To change this template use File | Settings | File Templates.
 */

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Handler à fournir à Mybatis en cas de stockage de boolean sous forme de number : 1/0 en db.
 *
 * @author phw
 */
@MappedJdbcTypes(JdbcType.NUMERIC)
public class BooleanAsNumberHandler extends BaseTypeHandler<Boolean> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, convert(parameter));
    }

    @Override
    public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return convert(rs.getInt(columnName));
    }

    @Override
    public Boolean getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return null;
    }

    @Override
    public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return convert(cs.getInt(columnIndex));
    }

    private Integer convert(Boolean value){
        Integer i;
        if (Boolean.TRUE.equals(value)){
            i = 1;
        } else {
            i = 0;
        }
        return i;
    }

    private Boolean convert(Integer value){
        if (value != null && value.equals(1)){
            return true;
        } else{
            return false;
        }
    }
}
