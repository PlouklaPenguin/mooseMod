package com.sam.moosemod.items;

import com.sam.moosemod.MooseMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RawMooseMeat extends Item {
    public RawMooseMeat() {
        super(new Item.Properties()
            .group(MooseMod.TAB)
            .food(new Food.Builder()
                .hunger(4)
                .saturation(2.0f)
                .effect(() -> new EffectInstance(Effects.UNLUCK, 12000, 5), 9.5f)
                .effect(() -> new EffectInstance(Effects.POISON, 200, 5), 2.0f)
                .meat()
                .build())


        );
    }
}
