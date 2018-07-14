package zedly.zbot.event;

public class ChatEvent extends Event {

    private final String message;
    private final String rawMessage;
    
    public ChatEvent(String rawMessage, String message) {
        this.rawMessage = rawMessage;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
    
    public String getRawMessage() {
        return rawMessage;
    }
}
