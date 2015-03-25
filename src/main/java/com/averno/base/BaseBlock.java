package com.averno.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * 
 * @author darkraksis
 * Esta es la clase base para todos los bloques.</br>
 * Un bloque consta de las siguientes propiedades:</br>
 * - Icon: el icono del bloque que se muestra al usuario.</br>
 * - Material: define varias propiedades.</br>
 * - Blast Resistance: resistencia a explotar (por ejemplo frente a TNT o creepers).</br>
 * - Luminance: c�mo es de brillante el bloque.</br>
 * - Hardness: c�mo de dificil es romper un bloque.</br>
 * - Creative Tab: no se qu� es por ahora.</br>
 * - Sounds: el sonido que hace el bloque al ser pisado por una entidad.</br>
 */
public class BaseBlock extends Block {

	protected BaseBlock(Material material) {
		super(material);
	}

}
