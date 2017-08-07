package pw.jawedyx.antonleshchev;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Articles {

    @SerializedName("articles")
    @Expose
    private ArrayList<Article> articles = null;

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

}