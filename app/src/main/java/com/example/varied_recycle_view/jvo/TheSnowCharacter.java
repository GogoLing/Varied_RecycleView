package com.example.varied_recycle_view.jvo;

import java.io.Serializable;

public class TheSnowCharacter implements Serializable {
    private int imageDrawable;
    private String name;
    private int rank;

    public int getImageDrawable() {
        return imageDrawable;
    }

    public void setImageDrawable(int imageDrawable) {
        this.imageDrawable = imageDrawable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "TheSnowCharacter{" +
                "imageDrawable=" + imageDrawable +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}
