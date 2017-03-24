package com.android.casopisinterfon.interfon.model;


import java.util.List;
import java.util.Random;

/**
 * Model representing one article
 */
public class Article {

    private String pictureLink;
    private String articleTitle;
    private String articleDescription;
    private String articleDate;
    private long id;
    private String articleLink;
    private List<Category> articleCategories;

    public Article() {
        randomArticle();
    }

    private void randomArticle() {
        Random rand = new Random();
        int articleNum = rand.nextInt(35);
        id = articleNum; // TODO - implement id
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public List<Category> getArticleCategories() {
        return articleCategories;
    }
    public void setArticleCategories(List<Category> articleCategories) {
        this.articleCategories = articleCategories;
    }

    public String getArticleDate() {
        return articleDate;
    }
    public void setArticleDate(String articleDate) {
        this.articleDate = articleDate;
    }

    public String getArticleDescription() {
        return articleDescription;
    }
    public void setArticleDescription(String articleDescription) {
        this.articleDescription = articleDescription;
    }

    public String getArticleTitle() {
        return articleTitle;
    }
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getPictureLink() {
        return pictureLink;
    }
    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    public void setArticleLink(String articleLink) {
        this.articleLink = articleLink;
    }

}
