package com.spring.ai.demo.models;

import java.util.List;

public class WorkoutChatResponse {

    private List<ChatResponseContent> responseContents;

    public List<ChatResponseContent> getResponseContents() {
        return responseContents;
    }

    public void setResponseContents(List<ChatResponseContent> responseContents) {
        this.responseContents = responseContents;
    }
}
