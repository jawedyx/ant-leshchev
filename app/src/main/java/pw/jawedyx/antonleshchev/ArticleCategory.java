package pw.jawedyx.antonleshchev;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;



public class ArticleCategory extends Fragment {

    private ArrayList<Article> articlesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private String category;

    public ArticleCategory(){}


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        category = getArguments().getString(MainActivity.TAG_CATEGORY);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);


        recyclerView = (RecyclerView)rootView.findViewById(R.id.recycler);

        App.getApi().getArticleCats(category).enqueue(new Callback<Articles>() {
            @Override
            public void onResponse(Call<Articles> call, Response<Articles> response) {
                articlesList = response.body().getArticles();
                Log.wtf("jawex", response.body().getArticles().toString());

                recyclerView.setAdapter(new ArticlesAdapter(articlesList));
                recyclerView.getAdapter().notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<Articles> call, Throwable t) {
                Log.wtf("jawex", t.toString());
            }
        });




        return rootView;

    }


}
