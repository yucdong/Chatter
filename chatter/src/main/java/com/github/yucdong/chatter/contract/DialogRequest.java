package com.github.yucdong.chatter.contract;

public class DialogRequest {

    private final String botId;
    private final String query;
    private final String userId;

    public DialogRequest(String botId, String query, String userId) {
        this.botId = botId;
        this.query = query;
        this.userId = userId;
    }

    public String getBotId() {
        return this.botId;
    }

    public String getQuery() {
        return this.query;
    }

    public String getUserId() {
        return this.userId;
    }
}
