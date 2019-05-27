package com.github.yucdong.chatter.contract;

public class DialogResponse {

    private final String action;
    private final String text;

    public DialogResponse(String text, String action) {
        this.text = text;
        this.action = action;
    }

    public String getAction() {
        return this.action;
    }

    public String getText() {
        return this.text;
    }
}
