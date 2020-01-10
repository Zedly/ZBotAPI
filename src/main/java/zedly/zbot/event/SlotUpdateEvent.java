package zedly.zbot.event;

import zedly.zbot.inventory.ItemStack;

public class SlotUpdateEvent extends Event {

    private final ItemStack itemStack;
    private final int slotId;

    public SlotUpdateEvent(int slotId, ItemStack is) {
        this.slotId = slotId;
        this.itemStack = is;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }

    public int getSlotId() {
        return slotId;
    }
}
