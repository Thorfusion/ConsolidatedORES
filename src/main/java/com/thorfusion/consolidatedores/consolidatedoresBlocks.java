package com.thorfusion.consolidatedores;

import com.thorfusion.consolidatedores.block.BlockPoorOre;
import com.thorfusion.consolidatedores.item.ItemBlockPoorOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class consolidatedoresBlocks {
    public static final Block OreBlockPoor = new BlockPoorOre("stone").setBlockName("OreBlock");
    public static final Block OreBlockPoorDeepslate = new BlockPoorOre("deepslate").setBlockName("DeepslateOreBlock");

    public static void register()
    {
        GameRegistry.registerBlock(OreBlockPoor, ItemBlockPoorOre.class, "OreBlock");
        GameRegistry.registerBlock(OreBlockPoorDeepslate, ItemBlockPoorOre.class, "DeepslateOreBlock");

    }
}
