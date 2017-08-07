package pw.jawedyx.antonleshchev;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JawexApi {
    @GET("api/articles")
    Call<Articles> getArticleCats(@Query("cat") String category);


}
