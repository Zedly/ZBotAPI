package zedly.zbot.inventory;

public interface Inventory {

    ItemStack getSlot(int i);

    @Deprecated
    int getSelectedSlot();

    @Deprecated
    ItemStack getItemInHand();
    
    @Deprecated
    ItemStack getItemOnCursor();

    void click(int slot, int mode, int action);
    
    int internalSlot(int slot);
    
    int hotbarSlot(int offset);
    
}
