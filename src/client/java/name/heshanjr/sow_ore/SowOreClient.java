package name.heshanjr.sow_ore;

import name.heshanjr.sow_ore.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class SowOreClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// 设置作物方块使用透明渲染层
		BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_CROP, RenderLayer.getCutout());
	}
}