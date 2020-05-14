package com.minant.mant.service.neo4j;

import com.minant.mant.form.MovieInfoForm;
import com.minant.mant.model.MovieInfoModel;

import java.util.List;

/**
 * @ClassName Neo4jService
 * @Description TODO
 * @Author MinAnt
 * @Date 2020/5/9
 * @Version V1.0
 */
public interface Neo4jService {

    List<MovieInfoModel> getAll();

    int addMovie(MovieInfoForm form);

    int updateMovie(MovieInfoForm form);

    int delMovie(MovieInfoForm form);
}
