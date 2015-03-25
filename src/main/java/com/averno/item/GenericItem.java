package com.averno.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * 
 * @author darkraksis Esta es una clase de objeto gen�rico de ejemplo, un objeto
 *         debe heredar de la clase Item.
 */
public class GenericItem extends Item {

	/**
	 * Constructor vac�o, en �l se inician los datos necesarios para el
	 * objeto:</br> - setMaxStackSize(64) Establece el valor acumulable del
	 * objeto en el inventario, para objetos acumulables es recomendable que
	 * este valor valga 1.</br> - setCreativeTab() Establece en qu� pesta�a del
	 * modo creativo se situar� el objeto.</br> - setUnlocalizedName() Establece
	 * el nombre interno del objeto (no el que se ver� por el usuario), no puede
	 * tener espacios, sirve para hacer referencia al nombre que ver� el
	 * usuario, definido en el archivo de idioma.
	 */
	public GenericItem() {
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMisc);
		setUnlocalizedName("genericItem");
	}

	/**
	 * Constructor recibiendo par�metros. Esto permite crear diferentes objetos
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
