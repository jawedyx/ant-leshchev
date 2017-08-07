package pw.jawedyx.antonleshchev;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("preview_picture")
    @Expose
    private String previewPicture;
    @SerializedName("detail_picture")
    @Expose
    private String detailPicture;
    @SerializedName("publish_date")
    @Expose
    private String publishDate;
    @SerializedName("preview_desc")
    @Expose
    private String previewDesc;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("comments")
    @Expose
    private String comments;
    @SerializedName("likes")
    @Expose
    private String likes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getPreviewPicture() {
        return previewPicture;
    }

    public void setPreviewPicture(String previewPicture) {
        this.previewPicture = previewPicture;
    }

    public String getDetailPicture() {
        return detailPicture;
    }

    public void setDetailPicture(String detailPicture) {
        this.detailPicture = detailPicture;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getPreviewDesc() {
        return previewDesc;
    }

    public void setPreviewDesc(String previewDesc) {
        this.previewDesc = previewDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

}