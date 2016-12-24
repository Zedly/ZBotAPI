package zedly.zbot.inventory;

import org.bukkit.Material;
import net.minecraft.server.NBTBase;

public interface ItemStack {

    Material getType();

    int getTypeId();

    short getData();

    NBTBase getNbt();

    byte getAmount();
}
