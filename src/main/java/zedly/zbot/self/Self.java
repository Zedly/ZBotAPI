package zedly.zbot.self;

import zedly.zbot.ClientSettings;
import zedly.zbot.Location;
import zedly.zbot.ServerConnection;
import zedly.zbot.ai.Control;
import zedly.zbot.entity.Entity;
import zedly.zbot.entity.Player;
import zedly.zbot.environment.Environment;
import zedly.zbot.event.Listener;
import zedly.zbot.inventory.Inventory;
import zedly.zbot.plugin.ZBotPlugin;

public interface Self extends Player {

    @Deprecated
    void attackEntity(Entity ent);

    void cancelTask(int i);

    Control getControl();
    
    boolean controlAvailable();
    
    void releaseControl();
    
    @Deprecated
    void closeWindow();

    ClientSettings getClientSettings();

    @Override
    int getEntityId();

    Environment getEnvironment();

    Inventory getInventory();

    ServerConnection getServerConnection();

    @Override
    Location getLocation();

    @Deprecated
    void interactWithEntity(Entity ent, boolean leftHand);

    @Deprecated
    void interactWithEntity(Entity ent, Location loc, boolean leftHand);

    @Deprecated
    void moveTo(double x, double y, double z);

    @Deprecated
    void moveTo(double x, double y, double z, double yaw, double pitch);

    @Deprecated
    void moveTo(Location loc);

    @Deprecated
    void performAction(int action);

    @Deprecated
    void placeBlock(int x, int y, int z);

    @Deprecated
    void placeBlock(Location loc);

    @Deprecated
    void breakBlock(int x, int y, int z);

    @Deprecated
    void breakBlock(int x, int y, int z, int millis, Runnable callback);

    @Deprecated
    void breakBlock(Location loc);

    @Deprecated
    void breakBlock(Location loc, int millis, Runnable callback);

    @Deprecated
    void clickBlock(int x, int y, int z);

    @Deprecated
    void clickBlock(Location loc);

    void registerEvents(Listener listener);

    @Deprecated
    void respawn();

    int scheduleSyncDelayedTask(ZBotPlugin plugin, Runnable r, long delay);

    int scheduleSyncRepeatingTask(ZBotPlugin plugin, Runnable r, long delay, long interval);

    @Deprecated
    void selectSlot(int i);

    @Deprecated
    void sendChat(String message);

    @Deprecated
    void setAbilities(int abilities);

    void setClientSettings(ClientSettings clientSettings);

    void shutdown();

    @Deprecated
    void sneak(boolean sneak);

    @Deprecated
    void sprint(boolean sprint);

    @Deprecated
    void swingArm(boolean leftHand);

    @Deprecated
    void useItem(boolean leftHand);

    void unregisterEvents(Listener listener);

    @Deprecated
    void writeToSign(Location loc, String line1, String line2, String line3, String line4);

}
