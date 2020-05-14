package com.minant.mant.service.neo4j;

import com.minant.mant.form.MovieInfoForm;
import com.minant.mant.mapper.MyNeo4jMapper;
import com.minant.mant.model.MovieInfoModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName Neo4jServiceImpl
 * @Description TODO
 * @Author MinAnt
 * @Date 2020/5/9
 * @Version V1.0
 */
@Service("neo4jService")
public class Neo4jServiceImpl implements Neo4jService {
    @Autowired
    private MyNeo4jMapper neo4jMapper;

    @Override
    public List<MovieInfoModel> getAll() {
        return neo4jMapper.getAll();
    }

    @Override
    public int addMovie(MovieInfoForm form) {
        return neo4jMapper.addMovie(form);
    }

    @Override
    public int updateMovie(MovieInfoForm form) {
        return neo4jMapper.updateMovie(form);
    }

    @Override
    public int delMovie(MovieInfoForm form) {
        return neo4jMapper.delMovie(form);
    }
}
