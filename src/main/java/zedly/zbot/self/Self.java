package zedly.zbot.self;

import zedly.zbot.ClientSettings;
import zedly.zbot.Location;
import zedly.zbot.ServerConnection;
import zedly.zbot.entity.Entity;
import zedly.zbot.entity.Player;
import zedly.zbot.environment.Environment;
import zedly.zbot.event.Listener;
import zedly.zbot.inventory.Inventory;
import zedly.zbot.plugin.ZBotPlugin;
import zedly.zbot.ai.BlockingControl;
import zedly.zbot.BlockFace;

public interface Self extends Player {

    void attackEntity(Entity ent);

    void cancelTask(int i);

    void closeWindow();

    ClientSettings getClientSettings();

    @Override
    int getEntityId();

    Environment getEnvironment();

    int getFoodLevel();

    Inventory getInventory();
    
    double getSaturation();

    ServerConnection getServerConnection();

    int getXPLevels();

    double getXPPercent();

    @Override
    Location getLocation();

    void interactWithEntity(Entity ent, boolean leftHand);

    void interactWithEntity(Entity ent, Location loc, boolean leftHand);

    void lookAt(double yaw, double pitch);

    void moveTo(double x, double y, double z);

    void moveTo(double x, double y, double z, double yaw, double pitch);

    void moveTo(Location loc);

    //void performAction(int action);

    int placeBlock(int x, int y, int z, BlockFace face);

    int placeBlock(Location loc, BlockFace face);

    int breakBlock(int x, int y, int z);

    int breakBlock(int x, int y, int z, int millis, Runnable callback);

    int breakBlock(Location loc);

    int breakBlock(Location loc, int millis, Runnable callback);

    int clickBlock(int x, int y, int z);

    int clickBlock(Location loc);

    int eatHeldItem();
    
    int eatHeldItem(int usedHand);

    int eatHeldItem(int usedHand, Runnable callback);

    void recipeBookStatus(int bookType, boolean open, boolean filterActive);

    void registerEvents(Listener listener);

    void requestRecipe(String recipeId, boolean makeAll);

    void respawn();

    int scheduleSyncDelayedTask(ZBotPlugin plugin, Runnable r, long delay);

    int scheduleSyncRepeatingTask(ZBotPlugin plugin, Runnable r, long delay, long interval);

    int scheduleSyncRepeatingTask(ZBotPlugin plugin, Runnable r, long interval);

    void selectSlot(int i);

    void sendChat(String message);

    void setAbilities(int abilities);

    void setClientSettings(ClientSettings clientSettings);

    void shutdown();

    void sneak(boolean sneak);

    void sprint(boolean sprint);

    int stopEating();
    
    void swingArm(boolean leftHand);

    int useItem(boolean leftHand);

    void unregisterEvents(Listener listener);

    void writeToSign(Location loc, String line1, String line2, String line3, String line4);

}
