package org.example;

import java.util.HashSet;
import java.util.Set;

public class PhotoManager {
    private final Set<String> photoNames = new HashSet<>();

    public boolean nameExists(String name) {
        return photoNames.contains(name);
    }

    public void addName(String name) {
        photoNames.add(name);
    }
}
