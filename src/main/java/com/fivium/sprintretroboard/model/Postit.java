package com.fivium.sprintretroboard.model;

import com.fivium.sprintretroboard.enumeration.PostitColour;

public class Postit {
    private PostitColour colour;
    private Person owner;
    private String content;
    private boolean read;

    public Postit(PostitColour colour, Person owner, String content, boolean read) {
        this.colour = colour;
        this.owner = owner;
        this.content = content;
    }

    public PostitColour getColour() {
        return colour;
    }

    public void setColour(PostitColour colour) {
        this.colour = colour;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }
}
