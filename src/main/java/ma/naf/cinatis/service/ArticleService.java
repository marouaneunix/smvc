package ma.naf.cinatis.service;

import ma.naf.cinatis.domain.Article;
import ma.naf.cinatis.repository.ArticleMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

    ArticleMapper articleMapper;

    public ArticleService(ArticleMapper articleMapper) {
        this.articleMapper = articleMapper;
    }

    public List<Article> getArticles() {
        return articleMapper.getArticles();
    }
}
