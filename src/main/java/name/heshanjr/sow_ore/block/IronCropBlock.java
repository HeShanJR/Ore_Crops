// 创建 IronCropBlock.java
package name.heshanjr.sow_ore.block;

import name.heshanjr.sow_ore.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class IronCropBlock extends CropBlock {
    public IronCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.IRON_SEEDS; // 确保您已经注册了这个物品
    }

    @Override
    public int getMaxAge() {
        return 7; // 与小麦相同的生长阶段
    }

    @Override
    protected int getGrowthAmount(World world) {
        return super.getGrowthAmount(world) / 2; // 使生长速度比小麦慢
    }
}