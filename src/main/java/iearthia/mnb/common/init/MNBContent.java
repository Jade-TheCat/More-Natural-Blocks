package iearthia.mnb.common.init;

import iearthia.mnb.common.block.BlockStoneBlock;
import net.minecraft.block.Block;

public class MNBContent {

    public static Block stone;

    public static void preInit(){
        stone = new BlockStoneBlock();
    }

    public static void init(){

    }

}
