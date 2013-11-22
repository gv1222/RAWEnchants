package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class BlindnessEnchantment extends CustomEnchantment {
	static final Material[] BLINDNESS_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD
	};

	public BlindnessEnchantment() {
		super("Blindness", BLINDNESS_ITEMS, 6);
		description = "Blinds enemy on hit";
		this.max = 3;
		this.base = 1;
		this.interval = 4;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 3);
		int effectTime = (enchantLevel * 20);

		if (new Random().nextInt(100) <= effectChance) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.BLINDNESS, effectTime, 3));
		}
	}
}
