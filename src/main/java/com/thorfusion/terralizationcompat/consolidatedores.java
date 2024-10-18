package com.thorfusion.terralizationcompat;

import com.jadarstudios.developercapes.DevCapes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerAboutToStartEvent;
import cpw.mods.fml.relauncher.Side;

@Mod(modid = consolidatedores.MODID, name = consolidatedores.NAME, version = consolidatedores.VERSION, dependencies = "before:aobd;after:MineTweaker3")

public class consolidatedores {
    public static final String NAME = "ConsolidatedORES";
    public static final String MODID = "consolidatedores";
    public static final String VERSION = "GRADLE_MODVERSION";

    public static boolean isMekanismLoaded;
    public static boolean isThorfusionLoaded;


    @Mod.Instance
    public static consolidatedores instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        isMekanismLoaded = Loader.isModLoaded("Mekanism");
        isThorfusionLoaded = Loader.isModLoaded("thorfusion");
        consolidatedoresConfig.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
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
    }

    @Mod.EventHandler
    public void onServerAboutToStart(FMLServerAboutToStartEvent event) {
    }
}
