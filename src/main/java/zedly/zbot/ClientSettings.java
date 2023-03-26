package zedly.zbot;

public class ClientSettings {

    private String locale = "en_US";
    private int viewDistance = 16;
    private ChatMode chatMode = ChatMode.NORMAL;
    private boolean chatColorsEnabled = true;
    private int skinFlags = 0x7F;
    private boolean leftHanded = true;
    private boolean enableTextFiltering = true;
    private boolean allowServerListings = true;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public int getViewDistance() {
        return viewDistance;
    }

    public void setViewDistance(int viewDistance) {
        this.viewDistance = viewDistance;
    }

    public ChatMode getChatMode() {
        return chatMode;
    }

    public void setChatMode(ChatMode chatMode) {
        this.chatMode = chatMode;
    }

    public boolean isChatColorsEnabled() {
        return chatColorsEnabled;
    }

    public void setChatColorsEnabled(boolean chatColorsEnabled) {
        this.chatColorsEnabled = chatColorsEnabled;
    }

    public int getSkinFlags() {
        return skinFlags;
    }

    public void setSkinFlags(int skinFlags) {
        this.skinFlags = skinFlags;
    }

    public boolean isLeftHanded() {
        return leftHanded;
    }

    public void setLeftHanded(boolean leftHanded) {
        this.leftHanded = leftHanded;
    }

    /**
     * @return the enabletextfiltering
     */
    public boolean isEnableTextFilterring() {
        return enableTextFiltering;
    }

    /**
     * @param enabletextfiltering the enabletextfiltering to set
     */
    public void setEnableTextFiltering(boolean enabletextfiltering) {
        this.enableTextFiltering = enabletextfiltering;
    }

    /**
     * @return the allowserverlistings
     */
    public boolean isAllowServerListings() {
        return allowServerListings;
    }

    /**
     * @param allowserverlistings the allowserverlistings to set
     */
    public void setAllowServerListings(boolean allowserverlistings) {
        this.allowServerListings = allowserverlistings;
    }

}
