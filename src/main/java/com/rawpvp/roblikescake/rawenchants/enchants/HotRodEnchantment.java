package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;
import org.bukkit.Material;

public class HotRodEnchantment extends CustomEnchantment{
	static final Material[] HOTROD_ITEMS = new Material[] {
			Material.FISHING_ROD
	};

	public HotRodEnchantment() {
		super("HotRod", HOTROD_ITEMS, 3);
		description = "Caught fish are cooked";
		this.max = 3;
		this.base = 10;
		this.interval = 5;
	}
}
