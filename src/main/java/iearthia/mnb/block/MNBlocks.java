package iearthia.mnb.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MNBlocks {
	public static StoneBlock basalt;
	public static StoneBlock marble;
	public static StoneBlock limestone;
	public static StoneBlock basalt_brick;
	public static StoneBlock marble_brick;
	public static StoneBlock limestone_brick;
	
	public static void init() {
		basalt = register(new StoneBlock("basalt").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		marble = register(new StoneBlock("marble").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		limestone = register(new StoneBlock("limestone").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		basalt_brick = register(new StoneBlock("basalt_brick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		marble_brick = register(new StoneBlock("marble_brick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
		limestone_brick = register(new StoneBlock("limestone_brick").setCreativeTab(CreativeTabs.BUILDING_BLOCKS));
	}
	
	private static <T extends Block> T register(T block, ItemBlock itemBlock) {
		GameRegistry.register(block);
		GameRegistry.register(itemBlock);
		
		if (block instanceof StoneBlock) {
			((StoneBlock)block).registerItemModel(itemBlock);
		}
		
		return block;
	}
	
	private static <T extends Block> T register(T block) {
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		return register(block, itemBlock);
	}
}
