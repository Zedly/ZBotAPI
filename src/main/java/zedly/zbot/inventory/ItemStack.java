package zedly.zbot.inventory;

import zedly.zbot.block.Material;
import net.minecraft.server.NBTBase;

public interface ItemStack {

    Material getType();

    int getTypeId();

    short getDamageValue();

    NBTBase getNbt();

    byte getAmount();
}
