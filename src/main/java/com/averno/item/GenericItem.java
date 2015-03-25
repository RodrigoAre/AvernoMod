package com.averno.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 
 * @author darkraksis Esta es una clase de objeto genérico de ejemplo, un objeto
 *         debe heredar de la clase Item.
 */
public class GenericItem extends Item {

	/**
	 * Constructor vacío, en él se inician los datos necesarios para el
	 * objeto:</br> - setMaxStackSize(64) Establece el valor acumulable del
	 * objeto en el inventario, para objetos acumulables es recomendable que
	 * este valor valga 1.</br> - setCreativeTab() Establece en qué pestaña del
	 * modo creativo se situará el objeto.</br> - setUnlocalizedName() Establece
	 * el nombre interno del objeto (no el que se verá por el usuario), no puede
	 * tener espacios, sirve para hacer referencia al nombre que verá el
	 * usuario, definido en el archivo de idioma.
	 */
	public GenericItem() {
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("genericItem");
	}

	/**
	 * Constructor recibiendo parámetros. Esto permite crear diferentes objetos
	 * desde la misma clase.
	 * 
	 * @param maxStackSize
	 * @param tab
	 * @param texture
	 * @param name
	 */
	public GenericItem(int maxStackSize, CreativeTabs tab, int texture,
			String name) {
		setMaxStackSize(maxStackSize);
		setCreativeTab(tab);
		setUnlocalizedName(name);
	}

}
