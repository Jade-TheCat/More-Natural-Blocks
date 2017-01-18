package iearthia.mnb.common.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MNBCrafting {

    public static void init(){
        GameRegistry.addRecipe(new ItemStack(MNBContent.stone, 4, 6), new Object[]{"XX", "XX", 'X', new ItemStack(MNBContent.stone, 1, 3)});
        GameRegistry.addRecipe(new ItemStack(MNBContent.stone, 4, 7), new Object[]{"XX", "XX", 'X', new ItemStack(MNBContent.stone, 1, 4)});
        GameRegistry.addRecipe(new ItemStack(MNBContent.stone, 4, 8), new Object[]{"XX", "XX", 'X', new ItemStack(MNBContent.stone, 1, 5)});
    }

}
