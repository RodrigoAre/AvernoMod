package com.averno.base;

import net.minecraft.item.Item;

import com.averno.proxy.CommonProxy;
import com.averno.registro.Registro;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * 
 * @author darkraksis Anotaci�n mod:</br> - Mod = Le dice a Forge que esta es la
 *         clase base del mod. Recibe los siguientes par�metros:</br> 1.- modid
 *         = El nombre �nico de tu mod, no debe cambiar una vez se haya
 *         lanzado.</br> 2.- name = El nombre que ver�n los usuarios para tu
 *         mod.</br> 3.- version = La versi�n de tu mod.
 */
@Mod(modid = Averno.MODID, name = "Averno", version = Averno.VERSION)
public class Averno {

	public static final String MODID = "Averno01";
	public static final String VERSION = "0.0.0";

	@Instance(value = MODID)
	public static Averno instance;

	/**
	 * Esta anotaci�n le dice a Forge qu� debe cargar dependiendo de si el mod
	 * es cargado desde el lado del cliente o o desde el servidor.</br>
	 * Dependiendo de cu�l sea la carga que deba hacer invocar� a una clase
	 * distinta:</br> - clientSide: clase con la carga del cliente.</br> -
	 * serverSide: clase con la carga del servidor.</br>
	 * 
	 * @see CommonProxy
	 */
	@SidedProxy(clientSide = "com.averno.proxy.ClientProxy", serverSide = "com.averno.proxy.CommonProxy")
	public static CommonProxy proxy;

	/**
	 * Este m�todo es el primero en ejecutarse, en �l debemos registrar todo lo
	 * necesario para nuestro mod: bloques, objetos, logros, npc...</br></br> En
	 * nuestro caso llamaremos a la clase Registro, donde tendremos almacenadas
	 * todas las cargas, limitando este m�todo a una l�nea de c�digo.
	 * 
	 * @param event
	 * @see Registro
	 */
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Registro.iniciar();
	}

	@EventHandler
	public void load(FMLInitializationEvent event) {
		proxy.registerRenderers();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	}
}