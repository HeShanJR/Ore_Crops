package name.heshanjr.ore_crops;

import name.heshanjr.ore_crops.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class OreCropsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 设置作物方块使用透明渲染层
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_CROP, RenderLayer.getCutout());
	}
}