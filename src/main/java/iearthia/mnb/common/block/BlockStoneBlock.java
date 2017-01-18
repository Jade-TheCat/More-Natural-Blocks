package iearthia.mnb.common.block;

import iearthia.mnb.common.property.CommonProperties;
import iearthia.mnb.common.property.EnumStoneType;
import iearthia.mnb.common.util.ModPrefs;
import keri.ninetaillib.block.IMetaBlock;
import keri.ninetaillib.texture.IIconRegistrar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockStoneBlock extends BlockNMB implements IMetaBlock {

    public BlockStoneBlock() {
        super("stone", Material.ROCK);
        this.setHardness(1.7F);
        this.setDefaultState(this.blockState.getBaseState().withProperty(CommonProperties.STONE_TYPE, EnumStoneType.SMOOTH_BASALT));
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{CommonProperties.STONE_TYPE});
    }

    @Override
    @SuppressWarnings("deprecation")
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(CommonProperties.STONE_TYPE, EnumStoneType.values()[meta]);
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        EnumStoneType type = (EnumStoneType)state.getValue(CommonProperties.STONE_TYPE);
        return type.getID();
    }

    @Override
    public String[] getSubNames() {
        return EnumStoneType.toStringArray();
    }

    @SideOnly(Side.CLIENT)
    private TextureAtlasSprite[] texture;

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegistrar registrar) {
        this.texture = new TextureAtlasSprite[this.getSubNames().length];

        for(int i = 0; i < this.getSubNames().length; i++){
            this.texture[i] = registrar.registerIcon(ModPrefs.MODID + ":blocks/stone/" + this.getSubNames()[i]);
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public TextureAtlasSprite getIcon(int meta, int side) {
        return this.texture[meta];
    }

}
