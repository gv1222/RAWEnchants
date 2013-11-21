package com.rawpvp.roblikescake.rawenchants.enchants;

import com.rit.sucy.CustomEnchantment;
import org.bukkit.Material;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class PoisonEnchantment extends CustomEnchantment {
	static final Material[] POISON_ITEMS = new Material[] {
			Material.WOOD_SWORD,
			Material.STONE_SWORD,
			Material.IRON_SWORD,
			Material.GOLD_SWORD,
			Material.DIAMOND_SWORD };

	public PoisonEnchantment() {
		super("Poison", POISON_ITEMS, 5);
		description = "Poisons enemy on hit";
		this.max = 2;
		this.base = 5;
		this.interval = 10;
	}

	@Override
	public void applyEffect(LivingEntity user, LivingEntity target, int enchantLevel, EntityDamageByEntityEvent event) {
		Random random = new Random();
		int diceRoll = random.nextInt(100);
		int effectChance = 25;
		int poisonTicks = (enchantLevel + 1);

		if (diceRoll <= effectChance) {
			target.addPotionEffect(new PotionEffect(PotionEffectType.POISON, poisonTicks, 2));
		}
	}
}
