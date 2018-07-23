package zedly.zbot.inventory;

import java.util.List;
import java.util.Map;
import org.bukkit.Material;
import net.minecraft.server.NBTBase;

public interface ItemStack {

    Material getType();

    int getTypeId();

    short getData();

    NBTBase getNbt();
    
    Map<Enchantment, Integer> getEnchantments();
    
    List<String> getLore();
    
    String getDisplayName();

    boolean hasEnchantments();
    
    boolean hasLore();
    
    boolean hasDisplayName();
    
    byte getAmount();
}
