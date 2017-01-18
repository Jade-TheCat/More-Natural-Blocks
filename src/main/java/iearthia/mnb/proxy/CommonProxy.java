package iearthia.mnb.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy implements IMNBProxy {

	@Override
	public void onConstruct(FMLConstructionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@Override
	public void init(FMLInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onServerAboutToStart(FMLServerAboutToStartEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onServerStarting(FMLServerStartingEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onServerStarted(FMLServerStartedEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onServerStopping(FMLServerStoppingEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onServerStopped(FMLServerStoppedEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	public void registerItemRenderer(Item item, int meta, String id) {
	}

}
