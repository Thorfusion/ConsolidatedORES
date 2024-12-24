package com.thorfusion.consolidatedores;

import com.thorfusion.consolidatedores.block.BlockPoorOre;
import com.thorfusion.consolidatedores.item.ItemBlockPoorOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class consolidatedoresBlocks {
    public static final Block OreBlockPoor = new BlockPoorOre("stone").setBlockName("OreBlock");
    public static final Block OreBlockPoorDeepslate = new BlockPoorOre("deepslate").setBlockName("DeepslateOreBlock");

    public static void register()
    {
        GameRegistry.registerBlock(OreBlockPoor, ItemBlockPoorOre.class, "OreBlock");
        GameRegistry.registerBlock(OreBlockPoorDeepslate, ItemBlockPoorOre.class, "DeepslateOreBlock");

    }
    public static void registerOreDict(){
        OreDictionary.registerOre("orePoorCopper", new ItemStack(OreBlockPoor, 1, 0));
        OreDictionary.registerOre("orePoorGold", new ItemStack(OreBlockPoor, 1, 1));
        OreDictionary.registerOre("orePoorIron", new ItemStack(OreBlockPoor, 1, 2));
        OreDictionary.registerOre("orePoorLead", new ItemStack(OreBlockPoor, 1, 3));
        OreDictionary.registerOre("orePoorTin", new ItemStack(OreBlockPoor, 1, 4));
        OreDictionary.registerOre("orePoorOsmium", new ItemStack(OreBlockPoor, 1, 5));
        OreDictionary.registerOre("orePoorSilver", new ItemStack(OreBlockPoor, 1, 6));

        OreDictionary.registerOre("orePoorCopper", new ItemStack(OreBlockPoorDeepslate, 1, 0));
        OreDictionary.registerOre("orePoorGold", new ItemStack(OreBlockPoorDeepslate, 1, 1));
        OreDictionary.registerOre("orePoorIron", new ItemStack(OreBlockPoorDeepslate, 1, 2));
        OreDictionary.registerOre("orePoorLead", new ItemStack(OreBlockPoorDeepslate, 1, 3));
        OreDictionary.registerOre("orePoorTin", new ItemStack(OreBlockPoorDeepslate, 1, 4));
        OreDictionary.registerOre("orePoorOsmium", new ItemStack(OreBlockPoorDeepslate, 1, 5));
        OreDictionary.registerOre("orePoorSilver", new ItemStack(OreBlockPoorDeepslate, 1, 6));
    }

}
