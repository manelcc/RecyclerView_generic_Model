package com.example.exampleinheritancemodelrecyclerview;

import androidx.annotation.DrawableRes;

public abstract class ModelAdapter {
    private String title;
    private String description;
    private @DrawableRes int label;


    abstract String getTitle();
    abstract String getDescription();
    abstract int getLabel();

}
