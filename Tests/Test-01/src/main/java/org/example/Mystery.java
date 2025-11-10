package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mystery implements MysteryColorAnalyzer{

    @Override
    public int numberOfDistinctColors(List<Color> mysteryColors) {
        List<Color> colors = new ArrayList<>();
        for(Color color : mysteryColors){
            if(!colors.contains(color))
                colors.add(color);
        }
        return colors.size();
    }

    @Override
    public int colorOccurrence(List<Color> mysteryColors, Color color) {
        int occurrence = 0;
        for(Color c : mysteryColors){
            if (c == color) occurrence++;
        }
        return occurrence;
    }
}
