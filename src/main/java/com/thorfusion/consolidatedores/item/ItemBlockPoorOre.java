package com.thorfusion.consolidatedores.item;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;


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

public class ItemBlockPoorOre extends ItemBlock {
    public Block metaBlock;

    public ItemBlockPoorOre(Block block)
    {
        super(block);
        metaBlock = block;
        setHasSubtypes(true);
    }

    @Override
    public int getMetadata(int i)
    {
        return i;
    }

    @Override
    public IIcon getIconFromDamage(int i)
    {
        return metaBlock.getIcon(2, i);
    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        String name = "";

        switch(itemstack.getItemDamage())
        {
            case 0:
                name = "orePoorCopper";
                break;
            case 1:
                name = "orePoorGold";
                break;
            case 2:
                name = "orePoorIron";
                break;
            case 3:
                name = "orePoorLead";
                break;
            case 4:
                name = "orePoorTin";
                break;
            case 5:
                name = "orePoorOsmium";
                break;
            case 6:
                name = "orePoorSilver";
                break;
            case 7:
                name = "orePoorDeepslateCopper";
                break;
            case 8:
                name = "orePoorDeepslateGold";
                break;
            case 9:
                name = "orePoorDeepslateIron";
                break;
            case 10:
                name = "orePoorDeepslateLead";
                break;
            case 11:
                name = "orePoorDeepslateTin";
                break;
            case 12:
                name = "orePoorDeepslateOsmium";
                break;
            case 13:
                name = "orePoorDeepslateSilver";
                break;
            default:
                name = "Unknown";
                break;
        }

        return getUnlocalizedName() + "." + name;
    }
}
