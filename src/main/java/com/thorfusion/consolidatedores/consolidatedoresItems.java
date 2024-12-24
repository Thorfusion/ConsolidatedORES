package com.thorfusion.consolidatedores;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import com.thorfusion.consolidatedores.item.ItemRaw;

/**
 *
 * 0: Copper
 * 1: Gold
 * 2: Iron
 * 3: Lead
 * 4: Tin
 * 5: Osmium
 * 6: Silver
 *
 */
public class consolidatedoresItems {
    public static final Item Raw = new ItemRaw();

    public static void register() {
        GameRegistry.registerItem(Raw, "Raw");
    }
    public static void registerOreDict(){
        for(consolidatedoresTypes consolidatedorestypes : consolidatedoresTypes.values()) {
            OreDictionary.registerOre("rawPoor" + consolidatedorestypes.getOredictName(), new ItemStack(consolidatedoresItems.Raw, 1, consolidatedorestypes.ordinal()));
        }
    }
}
