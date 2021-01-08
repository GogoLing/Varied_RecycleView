package com.example.varied_recycle_view.jvo;

import java.io.Serializable;

public class KnightErrant implements Serializable {
    /**
     * 名字
     */
    private String name;
    /**
     * 门派
     */
    private String sect;
    /**
     * 排名
     */
    private int rank;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSect() {
        return sect;
    }

    public void setSect(String sect) {
        this.sect = sect;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "KnightErrant{" +
                "name='" + name + '\'' +
                ", sect='" + sect + '\'' +
                ", rank=" + rank +
                '}';
    }
}
