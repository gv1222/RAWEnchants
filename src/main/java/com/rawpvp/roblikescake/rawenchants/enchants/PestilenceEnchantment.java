package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class PestilenceEnchantment extends CustomEnchantment{
	static final Material[] PESTILENCE_ITEMS = new Material[] {
			Material.LEATHER_CHESTPLATE,
			Material.IRON_CHESTPLATE,
			Material.GOLD_CHESTPLATE,
			Material.DIAMOND_CHESTPLATE
	};

	public PestilenceEnchantment() {
		super("Pestilence", PESTILENCE_ITEMS, 3);
		description = "Poisons victim when attacking user";
		this.max = 1;
		this.base = 20;
		this.interval = 10;
	}

	@Override
	public void applyDefenseEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageEvent event) {
		int effectChance = 10;
		int effectTime = 40;

		if (new Random().nextInt(100) <= effectChance) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, effectTime, 3));
		}
	}
}