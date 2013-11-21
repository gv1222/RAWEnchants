package com.rawpvp.roblikescake.rawenchants;

import com.rit.sucy.EnchantPlugin;
import com.rit.sucy.EnchantmentAPI;

import com.rawpvp.roblikescake.rawenchants.enchants.BlindnessEnchantment;
import com.rawpvp.roblikescake.rawenchants.enchants.PoisonEnchantment;

public class RAWEnchants extends EnchantPlugin {

	public void onEnable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Enabled!");
	}

	public void onDisable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Disabled!");
	}

	public void registerEnchantments() {
		EnchantmentAPI.registerCustomEnchantment(new BlindnessEnchantment());
		EnchantmentAPI.registerCustomEnchantment(new PoisonEnchantment());
	}
}
