package pw.jawedyx.antonleshchev;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class App extends Application {

    public static String BASE_URL = "http://jawedyx.pw/";
    private static JawexApi jawexApi;

    @Override
    public void onCreate() {
        super.onCreate();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        jawexApi = retrofit.create(JawexApi.class);


    }

    public static JawexApi getApi(){
        return jawexApi;
    }


}
