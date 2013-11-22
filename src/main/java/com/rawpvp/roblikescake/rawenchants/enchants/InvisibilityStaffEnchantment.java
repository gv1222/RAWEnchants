package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;

import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class InvisibilityStaffEnchantment extends CustomEnchantment{
	static final Material[] INVISIBILITYSTAFF_ITEMS = new Material[] {
			Material.WOOD_HOE,
			Material.STONE_HOE,
			Material.IRON_HOE,
			Material.GOLD_HOE,
			Material.DIAMOND_HOE
	};

	public InvisibilityStaffEnchantment() {
		super("InvisibilityStaff", INVISIBILITYSTAFF_ITEMS, 3);
		description = "Makes user invisible when hit";
		this.max = 1;
		this.base = 30;
		this.interval = 20;
	}

	@Override
	public void applyDefenseEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageEvent event) {
		int effectChance = 25;
		int effectTime = 40;

		if (new Random().nextInt(100) <= effectChance) {
			user.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, effectTime, 3));
		}
	}
}
