package fr.arcane.allmobstrade;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import masecla.villager.classes.VillagerInventory;
import masecla.villager.classes.VillagerTrade;

public class TradeListeners implements Listener {


	@EventHandler
	public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent e){
		
		Player p = e.getPlayer();
		Entity mob = e.getRightClicked();
		
		List<VillagerTrade> trades = new ArrayList<>();
		
		if (mob.getType() == EntityType.CHICKEN) {
			
			trades.add(new VillagerTrade(new ItemStack(Material.WHEAT_SEEDS), new ItemStack(Material.EMERALD, 3), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lChicken"));
			
			cr.open();
			
		}
		

		if (mob.getType() == EntityType.SHEEP) {
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 4), new ItemStack(Material.RED_BED), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 2), new ItemStack(Material.WHITE_WOOL, 5), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lSheep"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.PIG) {
			
			ItemStack saucisson = new ItemStack(Material.COOKED_PORKCHOP, 2);
			ItemMeta Msaucisson = saucisson.getItemMeta();
			Msaucisson.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&c&lSaucisson"));
			saucisson.setItemMeta(Msaucisson);
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), saucisson, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lPig"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.COW) {
			
			ItemStack bigcookie = new ItemStack(Material.COOKIE);
			ItemMeta Mbigcookie = bigcookie.getItemMeta();
			Mbigcookie.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lCookie OP"));
			Mbigcookie.addEnchant(Enchantment.LURE, 1, true);
			Mbigcookie.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			bigcookie.setItemMeta(Mbigcookie);
			
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.MILK_BUCKET), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), bigcookie, 500));
			
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lCow"));
			
			cr.open();
			
		}
		
		
		
		if (mob.getType() == EntityType.SQUID) {
			
			ItemStack waterbpotion = new ItemStack(Material.POTION);
			PotionMeta waterbmeta = (PotionMeta) waterbpotion.getItemMeta();
			waterbmeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 2), true);
			waterbpotion.setItemMeta(waterbmeta);;
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 6), new ItemStack(waterbpotion), 200));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&1&lSquid"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.ZOMBIFIED_PIGLIN) {
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.GOLD_INGOT, 2), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 4), new ItemStack(Material.GOLD_BLOCK), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&2&lZombie Pigmen"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.ZOMBIE) {
			
			ItemStack OpSword = new ItemStack(Material.GOLDEN_SWORD);
			ItemMeta MOpSword = OpSword.getItemMeta();
			MOpSword.addEnchant(Enchantment.DAMAGE_ALL, 500, true);
			MOpSword.addEnchant(Enchantment.FIRE_ASPECT, 10, true);
			MOpSword.addEnchant(Enchantment.SWEEPING_EDGE, 10, true);
			MOpSword.addEnchant(Enchantment.LOOT_BONUS_MOBS, 5, true);
			MOpSword.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOpSword.setUnbreakable(true);
			ArrayList<String> lore = new ArrayList<String>();
			lore.add(ChatColor.translateAlternateColorCodes('&', "&d&0Ouais du coup en gros c'est OP"));
			MOpSword.setLore(lore);
			MOpSword.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lZombies Holy Sword"));
			OpSword.setItemMeta(MOpSword);
			
			
			

			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.ROTTEN_FLESH, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 3), new ItemStack(Material.ZOMBIE_HEAD), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OpSword, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&4&lZombie"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.SKELETON) {
			
			
			ItemStack explodeBow = new ItemStack(Material.BOW);
			ItemMeta MexplodeBow = explodeBow.getItemMeta();
			MexplodeBow.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&a&lOP Bow"));
			MexplodeBow.addEnchant(Enchantment.ARROW_DAMAGE, 25, true);
			
			MexplodeBow.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			explodeBow.setItemMeta(MexplodeBow);
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.ARROW, 8), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.BONE, 3), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 3), new ItemStack(Material.SKELETON_SKULL), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 3), explodeBow, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lSkeleton"));
			
			cr.open();
			
		}
		
		
		
		
		if (mob.getType() == EntityType.WITHER) {
			
			ItemStack elytra = new ItemStack(Material.ELYTRA);
			ItemMeta Melytra = elytra.getItemMeta();
			Melytra.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10, true);
			Melytra.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			Melytra.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&5&lElytra"));
			Melytra.setUnbreakable(true);
			elytra.setItemMeta(Melytra);
			
			
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 48), elytra, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&e&Wither"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.ENDERMAN) {
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD), new ItemStack(Material.CHORUS_FRUIT, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 6), new ItemStack(Material.ENDER_PEARL), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&2&lEnderman"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.IRON_GOLEM) {
			
			ItemStack OPh = new ItemStack(Material.IRON_HELMET);
			ItemMeta MOPh = OPh.getItemMeta();
			MOPh.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
			MOPh.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOPh.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lIron Golem Helmet"));
			MOPh.setUnbreakable(true);
			OPh.setItemMeta(MOPh);
			
			ItemStack OPc = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta MOPc = OPc.getItemMeta();
			MOPc.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
			MOPc.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOPc.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lIron Golem Chestplate"));
			MOPc.setUnbreakable(true);
			OPc.setItemMeta(MOPc);
			
			ItemStack OPl = new ItemStack(Material.IRON_LEGGINGS);
			ItemMeta MOPl = OPl.getItemMeta();
			MOPl.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
			MOPl.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOPl.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lIron Golem Helmet"));
			MOPl.setUnbreakable(true);
			OPl.setItemMeta(MOPl);
			
			ItemStack OPb = new ItemStack(Material.IRON_BOOTS);
			ItemMeta MOPb = OPb.getItemMeta();
			MOPb.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
			MOPb.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOPb.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&8&lIron Golem Helmet"));
			MOPb.setUnbreakable(true);
			OPb.setItemMeta(MOPb);
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OPh, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OPc, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OPl, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OPb, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 2), (new ItemStack(Material.IRON_INGOT, 4)), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&2&lIron Golem"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.PIGLIN || mob.getType() == EntityType.PIGLIN_BRUTE) {
			
			
			ItemStack potion = new ItemStack(Material.POTION);
			PotionMeta meta = (PotionMeta) potion.getItemMeta();
			meta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 2), true);
			potion.setItemMeta(meta);;
			
			ItemStack splashpotion = new ItemStack(Material.POTION);
			PotionMeta splashmeta = (PotionMeta) splashpotion.getItemMeta();
			splashmeta.addCustomEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 1600, 1), true);
			splashpotion.setItemMeta(splashmeta);;
			
			
			ItemStack bottesSSoul = new ItemStack(Material.IRON_BOOTS);
			ItemMeta MbottesSSoul = bottesSSoul.getItemMeta();
			MbottesSSoul.addEnchant(Enchantment.SOUL_SPEED, 3, true);
			bottesSSoul.setItemMeta(MbottesSSoul);
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.BLACKSTONE, 8), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.GRAVEL, 8), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.LEATHER, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT), new ItemStack(Material.NETHER_BRICK, 8), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.CRYING_OBSIDIAN, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.SOUL_SAND, 16), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.SPECTRAL_ARROW, 8), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 12), new ItemStack(Material.ENDER_PEARL, 3), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 3), new ItemStack(Material.FIRE_CHARGE), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 2), new ItemStack(Material.OBSIDIAN, 1), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 10), potion, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 10), splashpotion, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 20), bottesSSoul, 500));
			
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lPiglin"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.CREEPER) {
			

			
			ItemStack Opcross = new ItemStack(Material.CROSSBOW);
			ItemMeta MOpcross = Opcross.getItemMeta();
			MOpcross.addEnchant(Enchantment.MULTISHOT, 10, true);
			MOpcross.addEnchant(Enchantment.ARROW_DAMAGE, 10, true);
			MOpcross.addEnchant(Enchantment.PIERCING, 10, true);
			MOpcross.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			MOpcross.setUnbreakable(true);
			ArrayList<String> lore = new ArrayList<String>();
			lore.add("Oui.. C'est OP, Et Alors ??");
			MOpcross.setLore(lore);
			MOpcross.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lExplode Crossbow"));
			Opcross.setItemMeta(MOpcross);
			
			ItemStack BigTNT = new ItemStack(Material.TNT);
			ItemMeta MBigTNT = BigTNT.getItemMeta();
			MBigTNT.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&4&lNuclear TNT"));
			BigTNT.setItemMeta(MBigTNT);
			
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 3), new ItemStack(Material.FLINT_AND_STEEL), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 4), new ItemStack(Material.TNT, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 2), new ItemStack(Material.CREEPER_HEAD), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 48), Opcross, 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 64),(new ItemStack(Material.EMERALD, 64)), BigTNT, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&2&lCreeper"));
			
			cr.open();
			
		}
		
		
		if (mob.getType() == EntityType.BLAZE) {
			
			trades.add(new VillagerTrade(new ItemStack(Material.GOLD_INGOT, 12), new ItemStack(Material.BLAZE_ROD), 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&4&lBlaze"));
			
			cr.open();
			
		}
		
		if (mob.getType() == EntityType.SPIDER || mob.getType() == EntityType.CAVE_SPIDER) {
			
			ItemStack OPpick = new ItemStack(Material.DIAMOND_PICKAXE);
			ItemMeta MOPpick = OPpick.getItemMeta();
			MOPpick.addEnchant(Enchantment.DIG_SPEED, 10, true);
			MOPpick.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 5, true);
			MOPpick.setDisplayName(ChatColor.translateAlternateColorCodes('&', "&1&lUltimate Disassembler"));
			MOPpick.setUnbreakable(true);
			OPpick.setItemMeta(MOPpick);
			
			
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 1), new ItemStack(Material.STRING, 4), 500));
			trades.add(new VillagerTrade(new ItemStack(Material.EMERALD, 32), OPpick, 500));
			
			VillagerInventory cr = new VillagerInventory(trades, p);
			cr.setName(ChatColor.translateAlternateColorCodes('&', "&a&lSpider"));
			
			cr.open();
			
		}
		
		
	}
	
	@EventHandler
	public void cookieeatevent(PlayerItemConsumeEvent e) {
		
		Player p = e.getPlayer();
		ItemStack i = e.getItem();
		
		if (i.getType() == Material.COOKIE && i.getItemMeta().hasDisplayName() == true) {
			p.addPotionEffect( new PotionEffect(PotionEffectType.HEALTH_BOOST, 12000, 9, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.REGENERATION, 600, 9, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 12000, 2, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.FAST_DIGGING, 12000, 9, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 12000, 9, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.SPEED, 12000, 3, true));
			p.addPotionEffect( new PotionEffect(PotionEffectType.JUMP, 12000, 3, true));
		}
		
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void exploshoot(ProjectileHitEvent e) {
		
		 if(e.getEntity() instanceof Arrow && e.getEntity().getShooter() instanceof Player){
			 
			 Arrow a = (Arrow) e.getEntity();
			 Player s = (Player) a.getShooter();
			 
			 ItemStack handI = s.getItemInHand();
			 
			 if(handI.getItemMeta().hasDisplayName() == true) {
				 Location loc = a.getLocation();
	               
	                World world = loc.getWorld();
	                double x = loc.getX();
	                double y = loc.getY();
	                double z = loc.getZ();
	                
	                world.createExplosion(x, y, z, 6f);
	                a.setDamage(10000);
			 }
			 
			 
			 
		
		 }
		
		
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void bigtntevent(PlayerInteractEvent e) throws InterruptedException {
		
		Action ac = e.getAction();
		Player p = e.getPlayer();
		ItemStack i = p.getItemInHand();
		Location loc = e.getClickedBlock().getLocation();
		World w = loc.getWorld();
		//double x = loc.getX();
		//double y = loc.getY();
		//double z = loc.getZ();
		
		
		if (ac == Action.RIGHT_CLICK_BLOCK && i.getType() == Material.TNT && i.getItemMeta().hasDisplayName() == true) {
			
			

					p.sendTitle(ChatColor.translateAlternateColorCodes('&', "&4&lExplode !"), null, 10, 0, 0);
					w.createExplosion(loc, 40f);
					e.setCancelled(true);

			
			
		}
		
	}
	
	

}
