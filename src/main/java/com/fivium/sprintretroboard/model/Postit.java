package com.fivium.sprintretroboard.model;

import com.fivium.sprintretroboard.enumeration.PostitColour;

public class Postit {
    PostitColour colour;
    String owner;
    String content;
    boolean read;

    public Postit(PostitColour colour, String owner, String content, boolean read) {
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
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
