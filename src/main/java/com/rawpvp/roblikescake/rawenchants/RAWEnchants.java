package com.rawpvp.roblikescake.rawenchants;

import com.rit.sucy.EnchantPlugin;

public class RAWEnchants extends EnchantPlugin {

	public void onEnable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Enabled!");
	}

	public void onDisable() {
		getLogger().info(this.getDescription().getName() + " " + this.getDescription().getVersion() + " has been Disabled!");
	}
}
