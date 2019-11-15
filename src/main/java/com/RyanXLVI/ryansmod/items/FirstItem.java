package com.RyanXLVI.ryansmod.items;

import com.RyanXLVI.ryansmod.ryansmod;
import net.minecraft.item.Item;

public class FirstItem extends Item {

    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(ryansmod.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
