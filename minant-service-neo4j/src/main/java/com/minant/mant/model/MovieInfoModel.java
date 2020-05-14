package com.minant.mant.model;

/**
 * @ClassName MovieInfoModel
 * @Description TODO 电影节点信息Model
 * @Author MinAnt
 * @Date 2020/5/14
 * @Version V1.0
 */
public class MovieInfoModel {
    private Long id;
    private String title;
    private String tagline;
    private String released;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getReleased() {
        return released;
    }

    public void setReleased(String released) {
        this.released = released;
    }
}
