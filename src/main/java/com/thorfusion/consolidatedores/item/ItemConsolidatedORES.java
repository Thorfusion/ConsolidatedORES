package com.thorfusion.consolidatedores.item;

import com.thorfusion.consolidatedores.ConsolidatedORES;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemConsolidatedORES extends Item
{
    public ItemConsolidatedORES()
    {
        super();
        setCreativeTab(ConsolidatedORES.tabConsolidatedORES);
    }

    @Override
    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon("consolidatedores:" + getUnlocalizedName().replace("item.", ""));
    }
}
