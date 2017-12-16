package be.phw.financeservice.web.rest;

import be.phw.financeservice.domain.ArticleBudg;
import be.phw.financeservice.repository.ArticleRepository;
import be.phw.financeservice.web.rest.util.PaginationUtil;
import com.codahale.metrics.annotation.Timed;
import io.github.jhipster.web.util.ResponseUtil;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * REST controller for managing Article.
 */
@RestController
@RequestMapping("/api")
public class ArticleBudgResource {

    private final Logger log = LoggerFactory.getLogger(ArticleBudgResource.class);

    private final ArticleRepository articleRepository;

    public ArticleBudgResource(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    /**
     * GET  /articles : get all the articles.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of articles in body
     */
    @GetMapping("/article-budgs")
    @Timed
    public ResponseEntity<List<ArticleBudg>> getAllArticles(@ApiParam Pageable pageable) {
        log.debug("REST request to get a page of Articles");
        Page<ArticleBudg> page = articleRepository.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/article-budgs");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

    /**
     * GET  /articles/:id : get the "id" article.
     *
     * @param id the id of the article to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the article, or with status 404 (Not Found)
     */
    @GetMapping("/article-budgs/{id}")
    @Timed
    public ResponseEntity<ArticleBudg> getArticle(@PathVariable Long id, @RequestParam(value="withTousCredits", required = false) Boolean withTousCredits) {
        log.debug("REST request to get Article : {}", id);
        System.out.println("withTousCredits : " + withTousCredits);
        ArticleBudg article = articleRepository.findById(id, withTousCredits);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(article));
    }

    /**
     *
     * GET  /article-budgs/by-code/:code : get the "code" article.
     *
     * @param code the code of the article to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the article, or with status 404 (Not Found)
     */
    @GetMapping("/article-budgs/by-code/{code}")
    @Timed
    public ResponseEntity<ArticleBudg> getArticle(@PathVariable String code, @RequestParam(value="withTousCredits", required = false) Boolean withTousCredits) {
        log.debug("REST request to get Article by code : {}", code);
        ArticleBudg article = articleRepository.findByCode(code, withTousCredits);
        return ResponseUtil.wrapOrNotFound(Optional.ofNullable(article));
    }


    //TODO : find by criteria (@PutMapping pour transfert ids à rechercher sans dépasser size dde l'url, ou autre méthode ?)

}
