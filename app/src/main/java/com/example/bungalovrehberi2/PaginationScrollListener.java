package com.example.bungalovrehberi2;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public abstract class PaginationScrollListener extends RecyclerView.OnScrollListener {
    private LinearLayoutManager layoutManager;
    private int visibleThreshold = 5;
    private int lastVisibleItem, totalItemCount;

    protected PaginationScrollListener(LinearLayoutManager layoutManager) {
        this.layoutManager = layoutManager;
    }

    @Override
    public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
        super.onScrolled(recyclerView, dx, dy);

        totalItemCount = layoutManager.getItemCount();
        lastVisibleItem = layoutManager.findLastVisibleItemPosition();

        if (!isLoading() && !isLastPage() && (totalItemCount <= (lastVisibleItem + visibleThreshold))) {
            loadMoreItems();
        }
    }

    protected abstract void loadMoreItems();
    public abstract boolean isLoading();
    public abstract boolean isLastPage();
}

