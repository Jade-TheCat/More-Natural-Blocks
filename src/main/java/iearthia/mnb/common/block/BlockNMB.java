package iearthia.mnb.common.block;

import iearthia.mnb.common.util.ModPrefs;
import keri.ninetaillib.block.BlockBase;
import keri.ninetaillib.tile.TileEntityBase;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockNMB<T extends TileEntityBase> extends BlockBase<T> {

    public BlockNMB(String blockName, Material material, MapColor mapColor) {
        super(ModPrefs.MODID, blockName, material, mapColor);
    }

    public BlockNMB(String blockName, Material material) {
        super(ModPrefs.MODID, blockName, material);
    }

    @Override
    public CreativeTabs getCreativeTab() {
        return CreativeTabs.BUILDING_BLOCKS;
    }

}
