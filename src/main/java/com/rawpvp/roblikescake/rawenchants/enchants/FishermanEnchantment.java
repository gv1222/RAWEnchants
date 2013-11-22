package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;

public class FishermanEnchantment extends CustomEnchantment {
	static final Material[] FISHERMAN_ITEMS = new Material[] {
			Material.FISHING_ROD
	};

	public FishermanEnchantment() {
		super("Fisherman", FISHERMAN_ITEMS, 3);
		description = "Catch extra fish";
		this.max = 5;
		this.base = 5;
		this.interval = 5;
	}
}
