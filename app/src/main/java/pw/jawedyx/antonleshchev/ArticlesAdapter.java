package pw.jawedyx.antonleshchev;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;




public class ArticlesAdapter extends RecyclerView.Adapter<ArticlesAdapter.ViewHolder>{
    private ArrayList<Article> articles;


    public ArticlesAdapter(){}

    public ArticlesAdapter(ArrayList<Article> articles){
        this.articles = articles;
    }

    @Override
    public ArticlesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.articles, parent, false);

        return new ArticlesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ArticlesAdapter.ViewHolder holder, int position) {
        Article article = articles.get(position);

        holder.title.setText(article.getTitle());
        holder.url.setText(article.getHref());

        //App.BASE_URL +
        Picasso.with(holder.preview.getContext())
                .load( article.getDetailPicture())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.preview);

        holder.comments.setText(article.getComments());
        holder.likes.setText(article.getLikes());
        holder.date.setText(article.getPublishDate());


    }

    @Override
    public int getItemCount() {
        if(articles == null) return 0;
        return articles.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        TextView url;
        ImageView preview;
        TextView likes;
        TextView comments;
        TextView date;


        public ViewHolder(View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.blog_title);
            url = (TextView)itemView.findViewById(R.id.blog_url);
            preview = (ImageView) itemView.findViewById(R.id.blog_preview);
            likes = (TextView)itemView.findViewById(R.id.likes_text);
            comments = (TextView)itemView.findViewById(R.id.comments_text);
            date = (TextView)itemView.findViewById(R.id.date_text);


        }
    }
}

