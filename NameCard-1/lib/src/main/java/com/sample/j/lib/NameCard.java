package com.sample.j.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.Dimension;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by joe_wang on 2016/10/28.
 */

public class NameCard extends FrameLayout {
    private ImageView ivPhoto;
    private TextView  tvName;
    private TextView  tvTitle;

    private int idName;
    private int idTitle;
    private int idPhoto;

    public NameCard(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.name_card, this);
        ivPhoto = (ImageView) findViewById(R.id.photo);
        tvName  = (TextView) findViewById(R.id.name);
        tvTitle = (TextView) findViewById(R.id.title);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.AttrNameCard,
                0, 0);

        try {
            idName = a.getResourceId(R.styleable.AttrNameCard_ncName, R.string.default_name);
            idTitle = a.getResourceId(R.styleable.AttrNameCard_ncTitle, R.string.default_title);
            idPhoto = a.getResourceId(R.styleable.AttrNameCard_ncPhoto, R.drawable.ic_person_black_36dp);

            ivPhoto.setImageDrawable(getResources().getDrawable(idPhoto));
            tvName.setText(idName);
            tvTitle.setText(idTitle);
        } finally {
            a.recycle();
        }
    }

    public void setPhoto(Drawable drawable) {
        ivPhoto.setImageDrawable(drawable);
    }

    public void setName(String name) {
        tvName.setText(name);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }
}
