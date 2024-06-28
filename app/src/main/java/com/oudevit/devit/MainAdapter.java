package com.oudevit.devit;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_NEWS_ITEM = 1;
    private static final int VIEW_TYPE_HORIZONTAL_SCROLL = 2;
    private static final int VIEW_TYPE_NEW_TOPIC = 3;
    private static final int VIEW_TYPE_FAVORITE = 4;

    @Override
    public int getItemViewType(int position) {
        // Define your view types here based on position or data
        // For simplicity, using position in this example
        switch (position) {
            case 0:
                return VIEW_TYPE_HEADER;
            case 1:
                return VIEW_TYPE_NEWS_ITEM;
            case 2:
                return VIEW_TYPE_HORIZONTAL_SCROLL;
            case 3:
                return VIEW_TYPE_NEW_TOPIC;
            default:
                return VIEW_TYPE_FAVORITE;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        if (viewType == VIEW_TYPE_HEADER) {
            return new HeaderViewHolder(inflater.inflate(R.layout.activity_showlll, parent, false));
        } else if (viewType == VIEW_TYPE_NEWS_ITEM) {
            return new NewsViewHolder(inflater.inflate(R.layout.secondactivity, parent, false));
        } else if (viewType == VIEW_TYPE_HORIZONTAL_SCROLL) {
            return new HorizontalScrollViewHolder(inflater.inflate(R.layout.activity_favorit, parent, false));
        } else if (viewType == VIEW_TYPE_NEW_TOPIC) {
            return new NewTopicViewHolder(inflater.inflate(R.layout.activity_search, parent, false));
        } else {
            return new FavoriteViewHolder(inflater.inflate(R.layout.activity_profile, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // Bind data to view holders here based on view type and position
        // Example:
        if (holder instanceof HeaderViewHolder) {
            // Bind header data here
        } else if (holder instanceof NewsViewHolder) {
            // Bind news item data here
        } else if (holder instanceof HorizontalScrollViewHolder) {
            // Bind horizontal scroll data here
        } else if (holder instanceof NewTopicViewHolder) {
            // Bind new topic data here
        } else if (holder instanceof FavoriteViewHolder) {
            // Bind favorite data here
        }
    }

    @Override
    public int getItemCount() {
        return 5; // Update this based on the number of items
    }

    static class HeaderViewHolder extends RecyclerView.ViewHolder {
        HeaderViewHolder(View itemView) {
            super(itemView);
            // Initialize your views here
        }
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {
        NewsViewHolder(View itemView) {
            super(itemView);
            // Initialize your views here
        }
    }

    static class HorizontalScrollViewHolder extends RecyclerView.ViewHolder {
        HorizontalScrollViewHolder(View itemView) {
            super(itemView);
            // Initialize your views here
        }
    }

    static class NewTopicViewHolder extends RecyclerView.ViewHolder {
        NewTopicViewHolder(View itemView) {
            super(itemView);
            // Initialize your views here
        }
    }

    static class FavoriteViewHolder extends RecyclerView.ViewHolder {
        FavoriteViewHolder(View itemView) {
            super(itemView);
            // Initialize your views here
        }
    }
}
