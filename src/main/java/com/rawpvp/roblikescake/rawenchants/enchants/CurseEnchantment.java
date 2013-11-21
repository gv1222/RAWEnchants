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
		super("Curse", CURSE_ITEMS, 2);
		description = "Withers enemy on hit";
		this.max = 2;
		this.base = 20;
		this.interval = 5;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		int effectChance = (enchantLevel * 5);

		if (new Random().nextInt(100) <= 100) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 2, 1));
		}
	}
}
