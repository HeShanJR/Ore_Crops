package name.heshanjr.ore_crops.item;

import name.heshanjr.ore_crops.OreCrops;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final RegistryKey<ItemGroup> ORE_CROPS_GROUP = register("ore_crops_group");

    private static RegistryKey<ItemGroup> register(String id){
        return RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(OreCrops.MOD_ID, id));
    }

    public static void registerGroups(){
        Registry.register(
                Registries.ITEM_GROUP,
                ORE_CROPS_GROUP,
                ItemGroup.create(ItemGroup.Row.TOP, 7)
                        .displayName(Text.translatable("itemGroup.ore_crops_group"))
                        .icon(() -> new ItemStack(ModItems.IRON_SEEDS))
                        .entries((displayContext, entries) -> {
                            entries.add(ModItems.IRON_SEEDS);
                        }).build());
    }
}


