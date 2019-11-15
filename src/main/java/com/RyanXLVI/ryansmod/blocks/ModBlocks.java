package com.RyanXLVI.ryansmod.blocks;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.registries.ObjectHolder;

public class ModBlocks {

    @ObjectHolder("ryansmod:firstblock")
    public static FirstBlock FIRSTBLOCK;

    @ObjectHolder("ryansmod:firstblock")
    public static TileEntityType<FirstBlockTile> FIRSTBLOCK_TILE;
}
