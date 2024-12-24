package com.thorfusion.consolidatedores;

import com.jadarstudios.developercapes.DevCapes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

@Mod(modid = com.thorfusion.consolidatedores.ConsolidatedORES.MODID, name = com.thorfusion.consolidatedores.ConsolidatedORES.NAME, version = com.thorfusion.consolidatedores.ConsolidatedORES.VERSION, dependencies = "before:aobd;after:MineTweaker3;after:etfuturum")

public class ConsolidatedORES {
    public static final String NAME = "ConsolidatedORES";
    public static final String MODID = "consolidatedores";
    public static final String VERSION = "GRADLE_MODVERSION";

    public static boolean isEFRLoaded;
    public static boolean isThorfusionLoaded;

    public static CreativeTabs tabConsolidatedORES = new CreativeTabs("tabConsolidatedORES") {

        @Override
        public Item getTabIconItem() {
            return new ItemStack(Items.coal).getItem();
        }
    };


    @Mod.Instance
    public static com.thorfusion.consolidatedores.ConsolidatedORES instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        isEFRLoaded = Loader.isModLoaded("etfuturum");
        isThorfusionLoaded = Loader.isModLoaded("thorfusion");
        consolidatedoresConfig.init();
        consolidatedoresBlocks.register();
        consolidatedoresItems.register();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        consolidatedoresBlocks.registerOreDict();
        consolidatedoresItems.registerOreDict();
        if (consolidatedoresConfig.EnableCapes & !isThorfusionLoaded) {
            //proxy, tilentity
            if (FMLCommonHandler.instance().getEffectiveSide() == Side.CLIENT) {
                try {
                    DevCapes.getInstance().registerConfig("https://raw.githubusercontent.com/maggi373/files/main/capes/cape.json");
                } catch (Exception e) {
                    System.out.print("Failed to load capes\n" + e);
                }
            }
        }
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        if(isEFRLoaded){
            consolidatedoresEFRrecipes.hookEFRRecipes();
            System.out.print("Hooked into EFR api successfully.");
        }
    }

    @Mod.EventHandler
    public void onServerAboutToStart(FMLServerAboutToStartEvent event) {
    }
}
