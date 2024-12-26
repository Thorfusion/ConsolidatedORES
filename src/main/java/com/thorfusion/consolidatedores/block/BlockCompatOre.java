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
 * 0: Minico
 *
 */

public class BlockCompatOre extends Block
{
    public IIcon[] icons = new IIcon[256];

    public BlockCompatOre()
    {
        super(Material.rock);
        setHardness(4.5F);
        setResistance(5F);
        setHarvestLevel("pickaxe", 2);
        setCreativeTab(ConsolidatedORES.tabConsolidatedORES);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
        icons[0] = register.registerIcon("thorfusion:oreDeepslateMinicio");
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
    }
}
