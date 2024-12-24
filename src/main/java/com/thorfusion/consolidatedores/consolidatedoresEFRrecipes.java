package com.thorfusion.consolidatedores;
import net.minecraft.item.ItemStack;
import com.thorfusion.consolidatedores.consolidatedoresBlocks;
import cpw.mods.fml.common.Optional.Method;
import ganymedes01.etfuturum.api.DeepslateOreRegistry;

public class consolidatedoresEFRrecipes {
    @Method(modid = "etfuturum")
    public static void hookEFRRecipes() {
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 0, consolidatedoresBlocks.OreBlockPoorDeepslate, 0);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresBlocks.OreBlockPoorDeepslate, 1);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresBlocks.OreBlockPoorDeepslate, 2);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 3, consolidatedoresBlocks.OreBlockPoorDeepslate, 3);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 4, consolidatedoresBlocks.OreBlockPoorDeepslate, 4);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 5, consolidatedoresBlocks.OreBlockPoorDeepslate, 5);
        DeepslateOreRegistry.addOre(consolidatedoresBlocks.OreBlockPoor, 6, consolidatedoresBlocks.OreBlockPoorDeepslate, 6);
    }

}
