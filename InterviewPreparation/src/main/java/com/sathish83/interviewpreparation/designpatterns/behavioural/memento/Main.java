package com.sathish83.interviewpreparation.designpatterns.behavioural.memento;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor();
        History history = new History();
        editor.setContent("New");
        history.push(editor.createState());

        editor.setContent("File");
        history.push(editor.createState());
        editor.restore();

        System.out.println(editor.getContent());



    }
}
