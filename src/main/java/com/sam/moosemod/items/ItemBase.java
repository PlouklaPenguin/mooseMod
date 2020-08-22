package com.sam.moosemod.items;

import com.sam.moosemod.MooseMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(MooseMod.TAB));
    }
}
