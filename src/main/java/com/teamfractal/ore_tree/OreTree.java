package com.teamfractal.ore_tree;

import com.teamfractal.ore_tree.common.util.OTRegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;


@Mod(OreTree.MODID)
public class OreTree
{
    public static final String MODID = "ore_tree";
    public OreTree() {
        OTRegistryHandler.register();
        MinecraftForge.EVENT_BUS.register(this);
    }
}
