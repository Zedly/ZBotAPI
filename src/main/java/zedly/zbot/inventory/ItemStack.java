package zedly.zbot.inventory;

import java.util.List;
import java.util.Map;
import net.minecraft.server.NBTBase;
import zedly.zbot.Material;

public interface ItemStack {

    Material getType();

    NBTBase getNbt();
    
    Map<Enchantment, Integer> getEnchantments();
    
    List<String> getLore();
    
    String getDisplayName();

    boolean hasEnchantments();
    
    boolean hasLore();
    
    boolean hasDisplayName();
    
    int getAmount();
}
