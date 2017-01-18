package iearthia.mnb.block;

import iearthia.mnb.MoreNaturalBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

public class StoneBlock extends Block{
	
	protected String name;
	
	public StoneBlock(String name) {
		super(Material.ROCK);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setHardness(3f);
		setResistance(5f);
	}
	
	public void registerItemModel(ItemBlock itemBlock) {
		MoreNaturalBlocks.PROXY.registerItemRenderer(itemBlock, 0, name);
	}
	
	@Override
	public StoneBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
