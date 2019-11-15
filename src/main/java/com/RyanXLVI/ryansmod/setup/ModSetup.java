package com.RyanXLVI.ryansmod.setup;

import com.RyanXLVI.ryansmod.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup("ryansmod") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.FIRSTBLOCK);
        }
    };


    public void init() {

    }
}
