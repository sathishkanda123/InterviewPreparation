package com.sathish83.interviewpreparation.designpatterns.behavioural.memento;

import java.util.List;

public class Editor {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState(){
        return new EditorState(content);
    }

    public EditorState restore(){
        EditorState state = new EditorState();
        return state.getContent();
    }


}
