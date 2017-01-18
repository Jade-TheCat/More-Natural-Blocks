package iearthia.mnb;

import iearthia.mnb.common.init.MNBConfig;
import iearthia.mnb.common.init.MNBContent;
import iearthia.mnb.common.init.MNBCrafting;
import iearthia.mnb.common.util.INaturalProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static iearthia.mnb.common.util.ModPrefs.*;

@Mod(modid = MODID, name = NAME, version = VERSION, dependencies = DEPS, acceptedMinecraftVersions = ACC_MC)
public class MoreNaturalBlock {

    @Mod.Instance(value = MODID)
    public static MoreNaturalBlock INSTANCE = new MoreNaturalBlock();
    @SidedProxy(clientSide = CSIDE, serverSide = SSIDE)
    public static INaturalProxy PROXY;
    public static Logger LOGGER = LogManager.getLogger(NAME);
    public static MNBConfig CONFIG;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        CONFIG = new MNBConfig(event);
        MNBContent.preInit();
        PROXY.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        MNBContent.init();
        MNBCrafting.init();
        PROXY.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        PROXY.postInit(event);
    }

}
