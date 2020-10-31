package com.topraktunca.element.util;

import com.topraktunca.element.blocks.BlockItemBase;
import com.topraktunca.element.blocks.TOre;
import com.topraktunca.element.blocks.TOreBlock;
import com.topraktunca.element.element_t;
import com.topraktunca.element.items.ItemBase;
import com.topraktunca.element.tools.ModItemTier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, element_t.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, element_t.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    //Items
    public static final RegistryObject<Item>  ELEMENT_T = ITEMS.register("element_t", ItemBase::new);

    //Tools
    public static final RegistryObject<SwordItem> T_SWORD = ITEMS.register("t_sword", () ->
            new SwordItem(ModItemTier.ELEMENT_T, 12, -2.1F, new Item.Properties().group(element_t.TAB)));

    //Blocks
    public static final RegistryObject<Block>  T_ORE = BLOCKS.register("t_ore", TOre::new);
    public static final RegistryObject<Block>  T_ORE_BLOCK = BLOCKS.register("t_ore_block", TOreBlock::new);

    //Block Items
    public static final RegistryObject<Item>  T_ORE_ITEM = ITEMS.register("t_ore", () -> new BlockItemBase(T_ORE.get()));
    public static final RegistryObject<Item>  T_ORE_BLOCK_ITEM = ITEMS.register("t_ore_block", () -> new BlockItemBase(T_ORE_BLOCK.get()));


}
