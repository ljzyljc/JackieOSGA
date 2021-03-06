package com.oceansoft.osga.widget;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Dream on 16/6/1.
 */
public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    private int space;

    public DividerItemDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        if (parent.getChildAdapterPosition(view) != 0)
            outRect.top = space;
    }
}
