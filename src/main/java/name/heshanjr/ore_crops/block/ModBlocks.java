package name.heshanjr.ore_crops.block;

import name.heshanjr.ore_crops.OreCrops;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block IRON_CROP = registerBlock("iron_crop",
            new IronCropBlock(
                    FabricBlockSettings.create()
                            .mapColor(MapColor.DARK_GREEN)
                            .noCollision()
                            .ticksRandomly()
                            .breakInstantly()
                            .sounds(BlockSoundGroup.CROP)
                            .pistonBehavior(PistonBehavior.DESTROY)
            )
    );

    // 注册方块的方法
    public static Block registerBlock(String id, Block block) {
        return Registry.register(Registries.BLOCK,
                RegistryKey.of(Registries.BLOCK.getKey(), new Identifier(OreCrops.MOD_ID, id)),
                block
        );
    }

    public static Block register(String id, Block block) {
        return register(new Identifier(OreCrops.MOD_ID, id), block);
    }

    public static Block register(Identifier id, Block block) {
        return register(RegistryKey.of(Registries.BLOCK.getKey(), id), block);
    }

    public static Block register(RegistryKey<Block> key, Block block) {
        return Registry.register(Registries.BLOCK, key, block);
    }

    // 注册方法
    public static void registerModBlocks() {
        OreCrops.LOGGER.info("Registering ModBlocks for " + OreCrops.MOD_ID);
    }
}