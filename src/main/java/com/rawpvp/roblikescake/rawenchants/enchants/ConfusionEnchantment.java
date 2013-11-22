package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class ConfusionEnchantment extends CustomEnchantment{
	static final Material[] CONFUSION_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD,
			Material.BOW
	};

	public ConfusionEnchantment() {
		super("Confusion", CONFUSION_ITEMS, 4);
		description = "Confuses enemy on hit";
		this.max = 1;
		this.base = 25;
		this.interval = 10;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 3);
		int effectTime = (enchantLevel * 40);

		if (new Random().nextInt(100) <= effectChance) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.CONFUSION, effectTime, 3));
		}
	}
}
