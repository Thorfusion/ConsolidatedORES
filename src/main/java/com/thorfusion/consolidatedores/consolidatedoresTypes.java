package com.thorfusion.consolidatedores;

import mekanism.api.MekanismConfig;

import java.util.Objects;

public enum consolidatedoresTypes {
    COPPER("Copper"),
    GOLD("Gold"),
    IRON("Iron"),
    LEAD("Lead"),
    TIN("Tin"),
    OSMIUM("Osmium"),
    SILVER("Silver");

    private String name;

    private consolidatedoresTypes(String s)
    {
        name = s;
    }

    /**
     * Returns resource from a String.
     * Used to convert Oregas into their physical output
     *
     */
    public static consolidatedoresTypes getFromName(String s)
    {
        for(consolidatedoresTypes r : values())
        {
            String resourceName = r.getOredictName().toLowerCase();
            if(resourceName.equals(s.toLowerCase()))
            {
                return r;
            }
        }

        return null;
    }

    /**
     * Returns the name of a resource.
     *
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the oredictionary name of a resource.
     *
     */
    public String getOredictName() {
        String oreName = name;

        return oreName;
    }
}
