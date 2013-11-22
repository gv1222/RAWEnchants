package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class SlownessEnchantment extends CustomEnchantment{
	static final Material[] SLOWNESS_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD,
			Material.BOW
	};

	public SlownessEnchantment() {
		super("Slowness", SLOWNESS_ITEMS, 6);
		description = "Slows enemy on hit";
		this.max = 4;
		this.base = 1;
		this.interval = 5;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 15);
		int effectTime = (enchantLevel * 10);

		if (new Random().nextInt(100) <= 100) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.SLOW, effectTime, 2));
		}
	}
}
