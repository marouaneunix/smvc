package ma.naf.cinatis.repository;

import ma.naf.cinatis.domain.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Optional;

@MapperScan
public interface ArticleMapper {

    @Select("SELECT * FROM ARTICLES WHERE id = #{id}")
    Optional<Article> getArticleById(@Param("id") Long id);

    @Select("SELECT * FROM ARTICLES")
    List<Article> getArticles();
}
