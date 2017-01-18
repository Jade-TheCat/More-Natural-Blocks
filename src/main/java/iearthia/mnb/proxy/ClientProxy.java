package iearthia.mnb.proxy;

import iearthia.mnb.resources.Constants;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerAboutToStartEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppedEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void onConstruct(FMLConstructionEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		// TODO Auto-generated method stub
		
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
	
	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Constants.MODID + ":" + id, "inventory"));
	}

}
