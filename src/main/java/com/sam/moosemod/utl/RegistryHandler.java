package com.sam.moosemod.utl;

import com.sam.moosemod.MooseMod;
import com.sam.moosemod.armor.ModArmorMaterial;
import com.sam.moosemod.blocks.GreenBlock;
import com.sam.moosemod.blocks.GreenOre;
import com.sam.moosemod.blocks.PermafrostBlock;
import com.sam.moosemod.blocks.BlockItemBase;
import com.sam.moosemod.items.ItemBase;
import com.sam.moosemod.items.MooseMeat;
import com.sam.moosemod.items.RawMooseMeat;
import com.sam.moosemod.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //Item/Block Registry
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MooseMod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MooseMod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // ITEMS
    public static final RegistryObject<Item> ANTLERS = ITEMS.register("antlers", ItemBase::new);
    public static final RegistryObject<Item> MOOSE_SADDLE = ITEMS.register("moose_saddle", ItemBase::new);
    public static final RegistryObject<Item> GREEN = ITEMS.register("green_ingot", ItemBase::new);
    public static final RegistryObject<RawMooseMeat> RAW_MOOSE_MEAT = ITEMS.register("raw_moose_meat", RawMooseMeat::new);
    public static final RegistryObject<MooseMeat> MOOSE_MEAT = ITEMS.register("moose_meat", MooseMeat::new);

    // TOOLS

    public static final RegistryObject<SwordItem> ANTLER_SWORD = ITEMS.register("antler_sword", () ->
            new SwordItem(ModItemTier.ANTLER, 7, -2.4f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<PickaxeItem> ANTLER_PICKAXE = ITEMS.register("antler_pickaxe", () ->
            new PickaxeItem(ModItemTier.ANTLER, 3, -2.8f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<AxeItem> ANTLER_AXE = ITEMS.register("antler_axe", () ->
            new AxeItem(ModItemTier.ANTLER, 9, -3.0f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ShovelItem> ANTLER_SHOVEL = ITEMS.register("antler_shovel", () ->
            new ShovelItem(ModItemTier.ANTLER, 2, -2.8f, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<HoeItem> ANTLER_HOE = ITEMS.register("antler_hoe", () ->
            new HoeItem(ModItemTier.ANTLER, 1,-2.2f, new Item.Properties().group(MooseMod.TAB)));

    //ARMOR
    public static final RegistryObject<ArmorItem> GREEN_CHESTPLATE = ITEMS.register("green_chestplate", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.CHEST, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_HELMET = ITEMS.register("green_helmet", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.HEAD, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_LEGGINGS = ITEMS.register("green_leggings", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.LEGS, new Item.Properties().group(MooseMod.TAB)));
    public static final RegistryObject<ArmorItem> GREEN_BOOTS = ITEMS.register("green_boots", () ->
            new ArmorItem(ModArmorMaterial.GREEN, EquipmentSlotType.FEET, new Item.Properties().group(MooseMod.TAB)));

    //BLOCKS
    public static final RegistryObject<Block> PERMAFROST_BLOCK = BLOCKS.register("permafrost_block", PermafrostBlock::new);
    public static final RegistryObject<Block> GREEN_BLOCK = BLOCKS.register("green_block", GreenBlock::new);
    public static final RegistryObject<Block> GREEN_ORE = BLOCKS.register("green_ore", GreenOre::new);



    //Block Items
    public static final RegistryObject<Item> PERMAFROST_BLOCK_ITEM = ITEMS.register("permafrost_block", () -> new BlockItemBase(PERMAFROST_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_BLOCK_ITEM = ITEMS.register("green_block", () -> new BlockItemBase(GREEN_BLOCK.get()));
    public static final RegistryObject<Item> GREEN_ORE_ITEM = ITEMS.register("green_ore", () -> new BlockItemBase(GREEN_ORE.get()));

}

