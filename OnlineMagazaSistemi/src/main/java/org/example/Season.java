package org.example;

import com.sun.source.doctree.SinceTree;

public enum Season {
    WINTER, AUTUMN, SUMMER, SPRING;

    public static Season getSeason(String season) {
        return Season.valueOf(season.toUpperCase());
    }
}
