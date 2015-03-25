package com.averno.registro;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.averno.item.GenericItem;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * 
 * @author darkraksis Clase encargada de registrar todo lo necesario para que
 *         nuestro mod funcione.
 *
 */
public class Registro {
	public static Item item1;
	public static Item genericIngot;

	/**
	 * Inicia todos los objetos antes de registrarlos, además llama al método
	 * registrar una vez los ha cargado todos.
	 * 
	 * @see Registro#registrar
	 */
	public static void iniciar() {
		item1 = new GenericItem();
		registrar();
	}

	/**
	 * Registra todos los objetos que hemos iniciado en el mod para que
	 * minecraft los reconozca.</br> Para registrar algo tenemos que usar la
	 * siguiente línea de código:</br> GameRegistry.register(tipo de variable a
	 * registrar).(objeto, nombre);</br> Ej: GameRegistry.registerItem(item1,
	 * "item1"); Registrará un nuevo objeto en base a nuestro item1 llamado
	 * item1.
	 */
	public static void registrar() {
		GameRegistry.registerItem(item1, "item1");
	}
}
