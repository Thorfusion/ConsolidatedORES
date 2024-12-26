package com.thorfusion.consolidatedores.block;

import com.thorfusion.consolidatedores.ConsolidatedORES;
import com.thorfusion.consolidatedores.consolidatedoresBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

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

public class BlockPoorOre extends Block
{
    public IIcon[] icons = new IIcon[256];

    public BlockPoorOre(String type)
    {
        super(Material.rock);
        setHardness(type == "deepslate" ? 4.5F :3F);
        setResistance(5F);
        setHarvestLevel("pickaxe", 1);
        setCreativeTab(ConsolidatedORES.tabConsolidatedORES);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        if(this == consolidatedoresBlocks.OreBlockPoor)
        {
        icons[0] = register.registerIcon("thorfusion:orePoorCopper");
        icons[1] = register.registerIcon("thorfusion:orePoorGold");
        icons[2] = register.registerIcon("thorfusion:orePoorIron");
        icons[3] = register.registerIcon("thorfusion:orePoorLead");
        icons[4] = register.registerIcon("thorfusion:orePoorTin");
        icons[5] = register.registerIcon("thorfusion:orePoorOsmium");
        icons[6] = register.registerIcon("thorfusion:orePoorSilver");
        }
        if(this == consolidatedoresBlocks.OreBlockPoorDeepslate) {
        icons[0] = register.registerIcon("thorfusion:orePoorDeepslateCopper");
        icons[1] = register.registerIcon("thorfusion:orePoorDeepslateGold");
        icons[2] = register.registerIcon("thorfusion:orePoorDeepslateIron");
        icons[3] = register.registerIcon("thorfusion:orePoorDeepslateLead");
        icons[4] = register.registerIcon("thorfusion:orePoorDeepslateTin");
        icons[5] = register.registerIcon("thorfusion:orePoorDeepslateOsmium");
        icons[6] = register.registerIcon("thorfusion:orePoorDeepslateSilver");
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return icons[meta];
    }

    @Override
    public int damageDropped(int i)
    {
        return i;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs creativetabs, List list)
    {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
        list.add(new ItemStack(item, 1, 4));
        list.add(new ItemStack(item, 1, 5));
        list.add(new ItemStack(item, 1, 6));
    }
}
