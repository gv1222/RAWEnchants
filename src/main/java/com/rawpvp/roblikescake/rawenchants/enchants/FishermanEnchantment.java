package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerInteractEvent;

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

	public void applyMiscEffect(Player player, int enchantLevel, PlayerInteractEvent event) {
		player.sendMessage("Are we fishing yet?");
	}
}
