package com.sunil.imdbandroid.adapter;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.sunil.imdbandroid.R;
import com.sunil.imdbandroid.db.model.IMBD;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by sunil on 30-09-2017.
 */

public class ImDbAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<IMBD> itemModels;
    private Context context;
    private onItemClickListener listener;

    public ImDbAdapter(Context context, List<IMBD> imbdList, Fragment fragment) {
        this.itemModels = imbdList;
        this.context = context;
        this.listener = (onItemClickListener) fragment;
    }

    @Override
    public int getItemCount() {
        return itemModels.size();
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        IMBD model = itemModels.get(position);
        initializeViews(model, holder, position);
    }


    private void initializeViews(final IMBD model, final RecyclerView.ViewHolder holder, final int position) {
        ((ItemViewHolder)holder).name.setText(model.getName());
        ((ItemViewHolder)holder).releasyear.setText("Release Year: "+model.getYearofrelease());
        ((ItemViewHolder)holder).rating.setText(""+model.getRating());
        ((ItemViewHolder)holder).relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.itemDetailClick(model);
            }
        });
        String imageUrl = model.getImageurl();
        if (imageUrl != null && !imageUrl.isEmpty()){
            Picasso.with(context)
                    .load(imageUrl)
                    .placeholder(R.drawable.movie_icon)
                    .error(R.drawable.movie_icon)
                    .into(((ItemViewHolder)holder).imageView);
        }
    }


    public static class ItemViewHolder extends RecyclerView.ViewHolder {

        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.releasyear)
        TextView releasyear;
        @BindView(R.id.rating)
        TextView rating;
        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.relative)
        RelativeLayout relative;

        public ItemViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface onItemClickListener{
        public void itemDetailClick(IMBD imbd);
    }

    public void setSearchResult(List<IMBD> result) {
        itemModels = result;
        notifyDataSetChanged();
    }
}
