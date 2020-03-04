package ma.naf.cinatis.web.rest;

import ma.naf.cinatis.domain.Article;
import ma.naf.cinatis.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/rest/cinatis/articles")
public class ArticleResource {

    ArticleService articleService;

    public ArticleResource(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public ResponseEntity<List<Article>> getArticles() {
        List<Article> articles = articleService.getArticles();
        return ResponseEntity.ok(articles);
    }

}
