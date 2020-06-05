package com.sathish83.interviewpreparation.designpatterns.behavioural.memento;

import java.util.List;

public class EditorState {

    private String content;

    public History history = new History();

    public EditorState(){

    }

    public EditorState(String content) {
        this.content = content;
    }

    public EditorState getContent() {
       return history.pop();
    }

    public void setContent(String content) {
        this.content = content;
    }



}
