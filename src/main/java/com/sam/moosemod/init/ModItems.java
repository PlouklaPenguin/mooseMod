package com.sam.moosemod.init;

import com.electronwill.nightconfig.core.ConfigSpec;
import com.sam.moosemod.MooseMod;
import com.sam.moosemod.blocks.BlockItemBase;
import com.sam.moosemod.items.ItemBase;
import com.sam.moosemod.items.MooseMeat;
import com.sam.moosemod.items.RawMooseMeat;
import com.sam.moosemod.utl.enums.ModArmorMaterial;
import com.sam.moosemod.utl.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    //Register the items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MooseMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> ANTLERS = ITEMS.register("antlers", ItemBase::new);
    public static final RegistryObject<Item> MOOSE_SADDLE = ITEMS.register("moose_saddle", ItemBase::new);
    public static final RegistryObject<Item> GREEN = ITEMS.register("green_ingot", ItemBase::new);
    public static final RegistryObject<RawMooseMeat> RAW_MOOSE_MEAT = ITEMS.register("raw_moose_meat", RawMooseMeat::new);
    public static final RegistryObject<MooseMeat> MOOSE_MEAT = ITEMS.register("moose_meat", MooseMeat::new);

    //Block items
    public static final RegistryObject<Item> PERMAFROST_BLOCK_ITEM = ITEMS.register("permafrost_block",
            () -> new BlockItemBase(ModBlocks.PERMAFROST_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_BLOCK_ITEM = ITEMS.register("green_block",
            () -> new BlockItemBase(ModBlocks.GREEN_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_ORE_ITEM = ITEMS.register("green_ore",
            () -> new BlockItemBase(ModBlocks.GREEN_ORE.get()));

    //Tools

    public static final RegistryObject<SwordItem> ANTLER_SWORD = ITEMS.register("antler_sword",
            () -> new SwordItem(ModItemTier.ANTLER, 7, -2.4f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<PickaxeItem> ANTLER_PICKAXE = ITEMS.register("antler_pickaxe",
            () -> new PickaxeItem(ModItemTier.ANTLER, 3, -2.8f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<AxeItem> ANTLER_AXE = ITEMS.register("antler_axe",
            () -> new AxeItem(ModItemTier.ANTLER, 9, -3.0f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ShovelItem> ANTLER_SHOVEL = ITEMS.register("antler_shovel",
            () -> new ShovelItem(ModItemTier.ANTLER, 2, -2.8f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<HoeItem> ANTLER_HOE = ITEMS.register("antler_hoe",
            () -> new HoeItem(ModItemTier.ANTLER, 1,-2.2f, new Item.Properties().group(MooseMod.TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> GREEN_CHESTPLATE = ITEMS.register("green_chestplate",
            () -> new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.CHEST, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_HELMET = ITEMS.register("green_helmet",
            () -> new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.HEAD, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_LEGGINGS = ITEMS.register("green_leggings",
            () -> new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.LEGS, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_BOOTS = ITEMS.register("green_boots",
            () -> new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.FEET, new Item.Properties().group(MooseMod.TAB)));

}
