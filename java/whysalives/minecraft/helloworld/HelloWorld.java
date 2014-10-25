package whysalives.minecraft.helloworld;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

//===========================================================================
// HelloWorld class
//===========================================================================
/**
 * A Minecraft-Forge test-mod that outputs "Hello.. World!" to the console.
 *
 * @version {@value HelloWorld#VERSION}
 * @author Ryan F. Mercer -Open source.
 */
@Mod(modid = HelloWorld.MODID, version = HelloWorld.VERSION)
public class HelloWorld {

public static final String MODID   = "helloworld"; //lowercase, no spaces.
public static final String VERSION = "vymdt.01.2014.08.18.0000";

public String testStr = "Hello.. World!";

//===========================================================================
/**
 * Does nothing.
 *
 * @param event
 */
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
  
  //do nothing.
}
//===========================================================================
/**
 * Main mod method.
 *
 * @param event
 */
@EventHandler
public void init(FMLInitializationEvent event) {
  
  //output to console.
  System.out.println(); //newline.
  System.out.println( testStr );
  System.out.println(); //newline.
}
//===========================================================================
/**
 * Does nothing.
 * 
 * @param event
 */
@EventHandler
public void postInit(FMLPostInitializationEvent event) {
  
  //do nothing.
}
//===========================================================================
}//END class
//===========================================================================