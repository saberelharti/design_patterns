package com.company.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private List<EditorState> history = new ArrayList<>();

    public void addState(EditorState state) {
        history.add(state);
    }

    public EditorState pop() {
        var lastIdex = history.size() - 1;
        var lastItem = history.get(lastIdex);
        history.remove(lastIdex);

        return lastItem;
    }
}
