package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class CurseEnchantment extends CustomEnchantment {
	static final Material[] CURSE_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD
	};

	public CurseEnchantment() {
		super("Curse", CURSE_ITEMS, 3);
		description = "Withers enemy on hit";
		this.max = 2;
		this.base = 20;
		this.interval = 5;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 5);
		int effectTime = (enchantLevel * 40);

		if (new Random().nextInt(100) <= effectChance) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, effectTime, 1));
		}
	}
}
