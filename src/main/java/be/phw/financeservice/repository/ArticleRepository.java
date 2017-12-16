package be.phw.financeservice.repository;

import be.phw.financeservice.domain.ArticleBudg;
import org.apache.ibatis.session.RowBounds;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ArticleRepository extends AbstractRepository{

    //REM : Les queries du mapper restournent des List<Map<>>, retourner des objets correctes générés
    //REM : Les repos Spring Datas de Jhipster exposent des pages, on implem donc la pagination ici pour garder le même principe

    //public ArticleRepository(SqlSession sqlSession) {
      //  super(sqlSession);
    //}

    private final static String mapper = "be.phw.financeservice.mapper.ArticleBudgetMapper";

    public Page<ArticleBudg> findAll(Pageable pageable) {
        return findArticleListByCriteria(null, null, null, null, null, null, null, false, null, null, false, null, pageable);
    }

    public ArticleBudg findById(Long id, Boolean withTousCredits) {
        HashMap<String, Object> params =  new HashMap<String, Object>();
        params.put("articleId", id);
        params.put("withTousCredits", withTousCredits);
        return this.getSqlSession().selectOne(mapper + ".findArticleDetail", params);
    }

    public ArticleBudg findByCode(String code, Boolean withTousCredits) {
        HashMap<String, Object> params =  new HashMap<String, Object>();
        params.put("code", code);
        params.put("withTousCredits", withTousCredits);
        return this.getSqlSession().selectOne(mapper + ".findArticleDetail", params);
    }

    public Page<ArticleBudg> findArticleListByCriteria(List<Long> ids, List<Long> idsGroups, List<Long> idsDeps, String codeDepRecette, String codeOrdiExtra, String exercice, String code, boolean isCodeStrict, Long projetId, String codeProjet, boolean withTousCredits, Boolean withMillesime, Pageable pageable) {
        HashMap<String, Object> params =  new HashMap<String, Object>();
        params.put("cod_dep_recette",codeDepRecette);
        params.put("cod_ordi_extra",codeOrdiExtra);
        params.put("exercice", exercice);
        params.put("code", code);
        params.put("isCodeStrict", isCodeStrict);
        params.put("isSousBudget",isSousBudget());
        params.put("codeProjet",codeProjet);
        params.put("projetId",projetId);
        params.put("withMillesime", withMillesime);
        if (ids!=null&&ids.size()==1){
            params.put("articleId", ids.get(0));
        }else{
            params.put("whereIds", getClauseWhereIn(ids, "art.id_info_art_budget", Long.class));
        }
        params.put("whereDepIdsWithoutSousBudget", getClauseWhereIn(idsDeps,"artdep.id_info_depart",Long.class));
        params.put("whereDepIdsWithSousBudget", getClauseWhereIn(idsDeps,"art.id_info_depart",Long.class));
        params.put("whereGroupIds", getClauseWhereIn(idsGroups,"grp.id_info",Long.class));
        params.put("withTousCredits", withTousCredits);

        //TODO : permettre pagination dans la query, rowbounds le fait en mémoire après exécution de la query
        RowBounds rowBounds = new RowBounds(pageable.getOffset(), pageable.getPageSize());
        List<ArticleBudg> content = this.getSqlSession().selectList(mapper + ".findArticleListByCriteria", params, rowBounds);
        Long total = this.getSqlSession().selectOne(mapper + ".countArticlesByCriteria", params);
        Page<ArticleBudg> page = new PageImpl<>(content, pageable, total);

        return page;
    }

    /**
     * Permet de savoir si la comptabilite utilise les sous-budgets
     * @return true si la comptabilite est parametree pour utiliser les sous-budget, false sinon
     */
    private boolean isSousBudget(){
        return Boolean.TRUE.equals(this.getSqlSession().selectOne(mapper + ".isSousBudget"));
    }

}
