package be.civadis.financeservice.repository;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractRepository extends SqlSessionDaoSupport {

    //@Autowired
    //protected SqlSession sqlSession;

    //public AbstractRepository(SqlSession sqlSession) {
    //    this.sqlSession = sqlSession;
    //}

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    /**
     * Permet de construire une portion de clause Where pour l'inclusion d'identifiants dans une liste
     * Cette methode specifique a ete creee pour pallier aux defauts des clauses IN ne prenant que 1000 arguments maximum
     * @param ids Liste des valeurs autorisees
     * @param terme Terme faisant l'objet de la clause IN
     * @return Portion de clause where a integrer dans la requete
     */
    protected static String getClauseWhereIn(List ids, String terme, Class clazz){
        if (ids!=null) {
            StringBuilder whereClause = new StringBuilder("");

            if (!ids.isEmpty()){
                int cpt=0;
                int i=0;
                while (i < ids.size()){
                    if (i!=0){
                        whereClause.append(" OR ");
                    }
                    whereClause.append(terme); // OBJECT.ID
                    whereClause.append(" IN ( ");
                    for (i=cpt*500;i<(cpt+1)*500&&i<ids.size();i++){
                        Object value = ids.get(i);
                        String prefix = "";
                        String suffix = "";
                        if (String.class.equals(clazz)){
                            prefix="'";
                            suffix="'";
                        }
                        if (i==cpt*500){
                            whereClause.append(prefix+value+suffix);
                        }else{
                            whereClause.append(" , " + prefix+value+suffix);
                        }
                    }
                    whereClause.append(" )");
                    cpt++;
                }

            }else{
                whereClause.append(terme); // OBJECT.ID
                String prefix = "";
                String suffix = "";
                if (String.class.equals(clazz)){
                    prefix="'";
                    suffix="'";
                }
                whereClause.append(" IN ("+prefix+" -1 "+suffix+") ");

            }

            return whereClause.toString();
        }
        return null;
    }

}
