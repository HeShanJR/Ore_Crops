package name.heshanjr.sow_ore.item;

import name.heshanjr.sow_ore.SowOre;
//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
//为添加natural而导入的库
//import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
//为添加natural而导入的库
import name.heshanjr.sow_ore.block.ModBlocks;
//import net.minecraft.block.Blocks;
//为添加原版作物而导入的库
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemGroups;
//为添加natural而导入的库
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final  Item IRON_SEEDS = registerItem("iron_seeds", new AliasedBlockItem(ModBlocks.IRON_CROP, new Item.Settings()));
    //由于还没写相关作物，这里先用原版的小麦
    public static Item registerItems(String id,Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),new Identifier(SowOre.MOD_ID,id)), item);
    }

    public static Item registerItem(String id,Item item){
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(),new Identifier(SowOre.MOD_ID,id)), item);
    }

    public static Item register(String id, Item item) {
        return register(new Identifier(SowOre.MOD_ID,id), item);
    }

    public static Item register(Identifier id, Item item) {
        return register(RegistryKey.of(Registries.ITEM.getKey(), id), item);
    }

    public static Item register(RegistryKey<Item> key, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registries.ITEM, key, item);
    }

    //private static void addItemToItemGroup(FabricItemGroupEntries entries){
        //entries.add(IRON_SEEDS);
    //}
    //在原版nature中加入物品，不需要就注释掉

    public static void registerItems() {
        //ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemToItemGroup);
        //在原版nature中加入物品，不需要就注释掉
    }
}
