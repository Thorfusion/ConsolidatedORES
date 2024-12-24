package com.thorfusion.consolidatedores.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import com.thorfusion.consolidatedores.consolidatedoresTypes;

import java.util.List;

public class ItemRaw extends ItemConsolidatedORES
{
    public IIcon[] icons = new IIcon[256];

    public ItemRaw()
    {
        super();
        setHasSubtypes(true);
    }

    @Override
    public void registerIcons(IIconRegister register)
    {
        for(int i = 0; i < consolidatedoresTypes.values().length; i++)
        {
            icons[i] = register.registerIcon("thorfusion:" + "RawPoor" + consolidatedoresTypes.values()[i].getName());
        }
    }

    @Override
    public IIcon getIconFromDamage(int meta)
    {
        return icons[meta];
    }

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List itemList)
    {
        for(int counter = 0; counter < consolidatedoresTypes.values().length; counter++)
        {
            itemList.add(new ItemStack(this, 1, counter));
        }
    }

    @Override
    public String getUnlocalizedName(ItemStack item)
    {
        if(item.getItemDamage() <= consolidatedoresTypes.values().length-1)
        {
            return "item." + "RawPoor" + consolidatedoresTypes.values()[item.getItemDamage()].getName();
        }

        return "Invalid";
    }
}
