package com.thorfusion.consolidatedores;
import cpw.mods.fml.common.Optional.Method;
import ganymedes01.etfuturum.api.DeepslateOreRegistry;
import ganymedes01.etfuturum.api.RawOreRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

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

        RawOreRegistry.addOre("orePoorCopper", consolidatedoresItems.Raw, 0);
        RawOreRegistry.addOre("orePoorGold", consolidatedoresItems.Raw, 1);
        RawOreRegistry.addOre("orePoorIron", consolidatedoresItems.Raw, 2);
        RawOreRegistry.addOre("orePoorLead", consolidatedoresItems.Raw, 3);
        RawOreRegistry.addOre("orePoorTin", consolidatedoresItems.Raw, 4);
        RawOreRegistry.addOre("orePoorOsmium", consolidatedoresItems.Raw, 5);
        RawOreRegistry.addOre("orePoorSilver", consolidatedoresItems.Raw, 6);

        DeepslateOreRegistry.addOreByOreDict("oreMinicio", consolidatedoresBlocks.OreBlockCompat, 0);
    }

}
