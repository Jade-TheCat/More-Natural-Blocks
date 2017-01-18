package iearthia.mnb.proxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.*;

public interface IMNBProxy {
	void onConstruct(FMLConstructionEvent event);

    void preInit(FMLPreInitializationEvent event);

    void init(FMLInitializationEvent event);

    void postInit(FMLPostInitializationEvent event);

    void onServerAboutToStart(FMLServerAboutToStartEvent event);

    void onServerStarting(FMLServerStartingEvent event);

    void onServerStarted(FMLServerStartedEvent event);

    void onServerStopping(FMLServerStoppingEvent event);

    void onServerStopped(FMLServerStoppedEvent event);

	void registerItemRenderer(Item item, int meta, String id);
}
