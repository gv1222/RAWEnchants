package com.rawpvp.roblikescake.rawenchants.listeners;

import com.rit.sucy.EnchantmentAPI;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class PlayerListener implements Listener{

	@EventHandler(priority = EventPriority.MONITOR, ignoreCancelled = true)
	public void onPlayerFish(PlayerFishEvent event) {
		if (event.getState() != PlayerFishEvent.State.CAUGHT_FISH) {
			return;
		}

		ItemStack caughtFish = ((Item)event.getCaught()).getItemStack();
		ItemStack inHand = event.getPlayer().getItemInHand();

		if (EnchantmentAPI.itemHasEnchantment(inHand, "Fisherman")) {
			applyFishermenEnchantmentEffect(caughtFish);
		}
		else if (EnchantmentAPI.itemHasEnchantment(inHand, "HotRod")) {
			applyHotRodEnchantmentEffect(caughtFish);
		}
	}

	public void applyFishermenEnchantmentEffect(ItemStack caughtFish) {
		int effectChance = 5;

		if (new Random().nextInt(100) <= effectChance) {
			caughtFish.setAmount(2);
		}
	}

	public void applyHotRodEnchantmentEffect(ItemStack caughtFish) {
		int effectChance = 5;

		if (new Random().nextInt(100) <= effectChance) {
			caughtFish.setType(Material.COOKED_FISH);
		}
	}
}
