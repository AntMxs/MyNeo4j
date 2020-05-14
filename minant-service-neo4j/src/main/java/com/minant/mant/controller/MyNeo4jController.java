package com.minant.mant.controller;

import com.minant.mant.form.MovieInfoForm;
import com.minant.mant.model.MovieInfoModel;
import com.minant.mant.service.neo4j.Neo4jService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @author : MinAnt
 * @ClassName : MyNeo4jController
 * @Description :
 * @date : 2020/5/14
 **/

@RestController
public class MyNeo4jController {

    @Autowired
    private Neo4jService neo4jService;

    /**
     * 查询所有电影节点信息
     * */
    @RequestMapping("/getAll")
    public List<MovieInfoModel> getAll() {
        List<MovieInfoModel> models = neo4jService.getAll();
        return models;
    }

    /**
     * 新增电影节点
     * */
    @RequestMapping("/add")
    public int add(MovieInfoForm form) {
        form = new MovieInfoForm();
        form.setTitle("MinAntMovie");
        form.setReleased("2020");
        form.setTagline("my test add");
        int i = neo4jService.addMovie(form);
        return i;
    }

    /**
     * 修改电影节点
     * */
    @RequestMapping("/update")
    public int update(MovieInfoForm form) {
        form = new MovieInfoForm();
        form.setTitle("MinAntMovie");
        form.setReleased("2050");
        form.setTagline("my test update");
        int i = neo4jService.updateMovie(form);
        return i;
    }
    /**
     * 删除电影节点
     * */
    @RequestMapping("/delMovie")
    public int delMovie(MovieInfoForm form) {
        form = new MovieInfoForm();
        form.setTitle("MinAntMovie");
        int i = neo4jService.delMovie(form);
        return i;
    }

}

