package iearthia.mnb.etc;

import iearthia.mnb.block.MNBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MNBRecipes {
	public static void init() {
		addBrickRecipe(MNBlocks.basalt, MNBlocks.basalt_brick);
		addBrickRecipe(MNBlocks.marble, MNBlocks.marble_brick);
		addBrickRecipe(MNBlocks.limestone, MNBlocks.limestone_brick);
	}
	protected static <T extends Block> void addBrickRecipe(T in, T out) {
		GameRegistry.addShapedRecipe(new ItemStack(Item.getItemFromBlock(out)), "SS", "SS", 'S', Item.getItemFromBlock(in));
	}
}
