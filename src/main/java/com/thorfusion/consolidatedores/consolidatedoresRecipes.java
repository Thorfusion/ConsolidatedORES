package com.thorfusion.consolidatedores;

import mekanism.api.recipe.RecipeHelper;
import mekanism.api.util.StackUtils;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.oredict.OreDictionary;
import com.thorfusion.consolidatedores.consolidatedoresTypes;



public class consolidatedoresRecipes {
    public static void init() {
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpCopper").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpGold").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("clumpIron").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpLead").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("clumpTin").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("clumpOsmium").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpSilver").get(0), 3));

        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpCopper").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpGold").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("clumpIron").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpLead").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("clumpTin").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("clumpOsmium").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpSilver").get(0), 3));

        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpCopper").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpGold").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("clumpIron").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("clumpLead").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("clumpTin").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("clumpOsmium").get(0), 3));
        RecipeHelper.addPurificationChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("clumpSilver").get(0), 3));

        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotCopper").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotGold").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("ingotIron").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotLead").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("ingotTin").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("ingotOsmium").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresItems.Raw, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotSilver").get(0), 1));

        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotCopper").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotGold").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("ingotIron").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotLead").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("ingotTin").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("ingotOsmium").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotSilver").get(0), 1));

        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotCopper").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotGold").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("ingotIron").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("ingotLead").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("ingotTin").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("ingotOsmium").get(0), 1));
        RecipeHelper.addEnrichmentChamberRecipe(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 2, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("ingotSilver").get(0), 1));


        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetCopper").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetGold").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetIron").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetLead").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetTin").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetOsmium").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresItems.Raw, 1, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetSilver").get(0), 3), 1.0F);

        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetCopper").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetGold").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetIron").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetLead").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetTin").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetOsmium").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoor, 1, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetSilver").get(0), 3), 1.0F);

        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.COPPER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetCopper").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.GOLD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetGold").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.IRON.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetIron").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.LEAD.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetLead").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.TIN.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetTin").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.OSMIUM.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetOsmium").get(0), 3), 1.0F);
        FurnaceRecipes.smelting().func_151394_a(new ItemStack(consolidatedoresBlocks.OreBlockPoorDeepslate, 1, consolidatedoresTypes.SILVER.ordinal()), StackUtils.size(OreDictionary.getOres("nuggetSilver").get(0), 3), 1.0F);


    }
}