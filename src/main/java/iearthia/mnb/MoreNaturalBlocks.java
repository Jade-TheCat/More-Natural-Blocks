package iearthia.mnb;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;

import static iearthia.mnb.resources.Constants.*;

import iearthia.mnb.block.MNBlocks;
import iearthia.mnb.etc.MNBRecipes;
import iearthia.mnb.proxy.IMNBProxy;

@Mod(modid = MODID, version = VERSION, name = NAME, dependencies = DEPS)
public class MoreNaturalBlocks
{
	@Mod.Instance(value=MODID)
	public static MoreNaturalBlocks INSTANCE = new MoreNaturalBlocks();
	@SidedProxy(clientSide = CSIDE, serverSide = SSIDE)
	public static IMNBProxy PROXY;
    
	@EventHandler
	public void construct(FMLConstructionEvent e) {
		PROXY.onConstruct(e);
		
	}
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		PROXY.preInit(e);

		MNBlocks.init();
	}
	
    @EventHandler
    public void init(FMLInitializationEvent e) {
    	PROXY.init(e);
        
    	MNBRecipes.init();
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent e) {
    	PROXY.postInit(e);
    	
    }
}
