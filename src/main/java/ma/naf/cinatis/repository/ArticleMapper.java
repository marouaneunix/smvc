package ma.naf.cinatis.repository;

import ma.naf.cinatis.domain.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface ArticleMapper {

    @Select("SELECT * FROM ARTICLES WHERE id = #{id}")
    Article getArticle(@Param("id") Long id);
}
