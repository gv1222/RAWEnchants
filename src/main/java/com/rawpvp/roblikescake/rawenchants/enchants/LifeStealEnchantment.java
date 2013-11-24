package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.Random;

public class LifeStealEnchantment extends CustomEnchantment {
	static final Material[] LIFESTEAL_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD,
	};

	public LifeStealEnchantment() {
		super("LifeSteal", LIFESTEAL_ITEMS, 3);
		description = "Steals life from enemy on hit";
		this.max = 2;
		this.base = 15;
		this.interval = 10;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 10);

		if (new Random().nextInt(100) <= 100) {
			double targetHealth = target.getHealth();

			target.setHealth(targetHealth - 1);
			addHealth(user, 1.0D);
		}
	}

	/**
	 * @author faydewey
	**/
	public void addHealth(LivingEntity user, double amount) {
		Player player = (Player) user;
		double current = player.getHealth();
		double max = player.getMaxHealth();

		if (current <= 0.0D) {
			return;
		}

		if (current + amount > max) {
			player.setHealth(max);
		} else {
			player.setHealth(current + amount);
		}
	}
}
