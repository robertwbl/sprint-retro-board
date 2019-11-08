package com.fivium.sprintretroboard.model;

public class Action {
    private String content;
    private Person owner;
    private boolean completed;

    public Action(String content, Person owner, boolean completed) {
        this.content = content;
        this.owner = owner;
        this.completed = completed;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}
