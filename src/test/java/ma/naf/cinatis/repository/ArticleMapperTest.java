package ma.naf.cinatis.repository;

import ma.naf.cinatis.config.DbConfig;
import ma.naf.cinatis.domain.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DbConfig.class)
public class ArticleMapperTest {


    @Autowired
    private ArticleMapper articleMapper;

    @Test
    public void should_return_article_by_given_id() {
        Optional<Article> article = articleMapper.getArticleById(1L);

        assertThat(article).isPresent();
        assertThat(article.get().getId()).isEqualTo(1L);
        assertThat(article.get().getAuthor()).isEqualTo("Baeldung");
        assertThat(article.get().getTitle()).isEqualTo("Working with MyBatis in Spring");
    }

}
