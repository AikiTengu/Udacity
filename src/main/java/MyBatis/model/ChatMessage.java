package MyBatis.model;

public class ChatMessage {
    private int messageId;
    private String username;
    private String messagetext;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMessage() {
        return messagetext;
    }

    public void setMessage(String messagetext) {
        this.messagetext = messagetext;
    }

    public int getMessageID() {
        return messageId;
    }

    public void setMessageID(int messageId) {
        this.messageId = messageId;
    }
}