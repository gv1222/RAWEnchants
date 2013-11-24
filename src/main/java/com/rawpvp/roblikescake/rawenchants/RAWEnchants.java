package com.rawpvp.roblikescake.rawenchants;

import com.rawpvp.roblikescake.rawenchants.enchants.*;
import com.rawpvp.roblikescake.rawenchants.listeners.PlayerListener;

import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;

public class RAWEnchants extends EnchantPlugin {

	public void onEnable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Enabled!");
		getServer().getPluginManager().registerEvents(new PlayerListener(), RAWEnchants.this);
	}

	public void onDisable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Disabled!");
	}

	public void registerEnchantments() {
		EnchantmentAPI.registerCustomEnchantments(
			new BlindnessEnchantment(),
			new ConfusionEnchantment(),
			new CurseEnchantment(),
			new FishermanEnchantment(),
			new HotRodEnchantment(),
			new InvisibilityStaffEnchantment(),
			new LifeStealEnchantment(),
			new PestilenceEnchantment(),
			new PoisonEnchantment(),
			new SlownessEnchantment()
		);
	}
}
