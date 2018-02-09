package zedly.zbot.event;

public class KeepAliveEvent extends Event {

    private long keepAliveId;

    public KeepAliveEvent(long keepAliveId) {
        this.keepAliveId = keepAliveId;
    }

    public long getKeepAliveId() {
        return keepAliveId;
    }
}
