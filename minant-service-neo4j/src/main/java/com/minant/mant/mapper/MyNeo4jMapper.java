package com.minant.mant.mapper;

import com.minant.mant.form.MovieInfoForm;
import com.minant.mant.model.MovieInfoModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyNeo4jMapper {

    List<MovieInfoModel> getAll();

    int addMovie(MovieInfoForm form);

    int updateMovie(MovieInfoForm form);

    int delMovie(MovieInfoForm form);
}
