package com.company.memento;

public class Editor {
    public String content;

    public EditorState createState(String content) {
        return new EditorState(content);
    }

    public void restoreState(EditorState editorState) {
        this.content = editorState.getContent();
    }

    public void setContent(String content) {
        this.content = content;
    }
}
