package com.evilnotch.vanillalife;

import com.evilnotch.lib.minecraft.basicmc.auto.item.ArmorMat;
import com.evilnotch.lib.minecraft.basicmc.auto.item.ArmorSet;
import com.evilnotch.lib.minecraft.basicmc.auto.item.ToolMat;
import com.evilnotch.lib.minecraft.basicmc.auto.item.ToolSet;
import com.evilnotch.lib.minecraft.basicmc.auto.lang.LangEntry;
import com.evilnotch.lib.minecraft.basicmc.item.armor.BasicArmor;
import com.evilnotch.lib.minecraft.basicmc.item.armor.BasicPotionArmor;
import com.evilnotch.lib.minecraft.basicmc.item.tool.BasicAxe;
import com.evilnotch.lib.minecraft.basicmc.item.tool.BasicHoe;
import com.evilnotch.lib.minecraft.basicmc.item.tool.BasicPickaxe;
import com.evilnotch.lib.minecraft.basicmc.item.tool.BasicSpade;
import com.evilnotch.lib.minecraft.basicmc.item.tool.BasicSword;

import net.minecraft.block.BlockEndPortalFrame;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


@Mod(modid=MainJava.modid, name=MainJava.name, version=MainJava.version, dependencies = "required-after:evilnotchlib@[1.2.3,]")
public class MainJava
{
  public static final String modid = "vanillalife";
  public static final String name = "Vanilla Life";
  public static final String version = "1.2.8.2";
  
  public static Item opic;
  public static Item oaxe;
  public static Item osword;
  public static Item ospade;
  public static Item ohoe;
  public static Item bedrockpic;
  public static Item bedrockaxe;
  public static Item bedrocksword;
  public static Item bedrockspade;
  public static Item bedrockhoe;
  public static Item redstonepic;
  public static Item redstoneaxe;
  public static Item redstone_sword;
  public static Item redstoneshovel;
  public static Item redstonehoe;
  public static Item lapispic;
  public static Item lapisaxe;
  public static Item lapis_sword;
  public static Item lapis_shovel;
  public static Item lapishoe;
  public static Item quartzpic;
  public static Item quartzaxe;
  public static Item quartzsword;
  public static Item quartzshovel;
  public static Item quartzhoe;
  public static Item oh;
  public static Item oc;
  public static Item ol;
  public static Item ob;
  public static Item bh;
  public static Item bc;
  public static Item bl;
  public static Item bb;
  public static Item rh;
  public static Item rc;
  public static Item rl;
  public static Item rb;
  public static Item lh;
  public static Item lc;
  public static Item ll;
  public static Item lb;
  public static Item qh;
  public static Item qc;
  public static Item ql;
  public static Item qb;
  public static Item dh;
  public static Item dc;
  public static Item dl;
  public static Item db;
  
  @Mod.EventHandler
  public void preInit(FMLPreInitializationEvent event)
  {
	Config.loadconfig(event);//Gets Values From User For Armor/Tools
	
	ToolMat obsidian_material = new ToolMat(new ResourceLocation(modid + ":obsidian_tool"), 4,6500,8.0f,5.0f,13);
	ToolMat bedrock_material =  new ToolMat(new ResourceLocation(modid + ":bedrock_tool"), 5,25000,14.0f,7.0f,11);
	ToolMat redstone_material =  new ToolMat(new ResourceLocation(modid + ":redstone_tool"), 2,500,18.0f,6.0f,12);
	ToolMat lapis_material =  new ToolMat(new ResourceLocation(modid + ":lapis_tool"), 2,185,7.0f,12.0f,26);
	ToolMat quartz_material =  new ToolMat(new ResourceLocation(modid + ":quartz_tool"), 2,800,8.0f,3.0f,10);
	
	ArmorMat obsidian_armor_material = new ArmorMat(new ResourceLocation(modid + ":" + "obsidian_armor"), new ResourceLocation(modid + ":obsidian"), 800, new int[]{4, 8, 6, 3}, 13, (SoundEvent)null, 3.0f);
	ArmorMat bedrock_armor_material = new ArmorMat(new ResourceLocation(modid + ":" + "bedrock_armor"), new ResourceLocation(modid + ":bedrock"), 1200, new int[]{4, 9, 6, 3}, 11, (SoundEvent)null, 4.0f);
	ArmorMat lapis_amror_material = new ArmorMat(new ResourceLocation(modid + ":" + "lapis_armor"), new ResourceLocation(modid + ":lapis"), 15, new int[]{2, 3, 2, 1}, 26, (SoundEvent)null, 0.0f);
	ArmorMat redstone_armor_material = new ArmorMat(new ResourceLocation(modid + ":" + "redstone_armor"), new ResourceLocation(modid + ":redstone"), 18, new int[]{2, 3, 2, 1}, 12, (SoundEvent)null, 0f);
	ArmorMat quartz_armor_material = new ArmorMat(new ResourceLocation(modid + ":" + "quartz_armor"), new ResourceLocation(modid + ":quartz"), 19, new int[]{3, 6, 5, 2}, 10, (SoundEvent)null, 0f);
	ArmorMat dirt_armor_material = new ArmorMat(new ResourceLocation(modid + ":" + "dirt_armor"), new ResourceLocation(modid + ":dirt"), 3, new int[]{1, 2, 1, 1}, 1, (SoundEvent)null, 0f);
	
	//tools
	opic = new BasicPickaxe(new ResourceLocation(modid + ":" + "obsidian_pickaxe"), obsidian_material, CreativeTabs.TOOLS, new LangEntry("en_us","Obsidian Pickaxe"));
	oaxe = new BasicAxe(new ResourceLocation(modid + ":" + "obsidian_axe"), obsidian_material, CreativeTabs.TOOLS,new LangEntry("en_us","Obsidian Axe"));
	osword = new BasicSword(new ResourceLocation(modid + ":" + "obsidian_sword"), obsidian_material, CreativeTabs.TOOLS,new LangEntry("en_us","Obsidian Sword"));
	ospade = new BasicSpade(new ResourceLocation(modid + ":" + "obsidian_spade"),obsidian_material,CreativeTabs.TOOLS,new LangEntry("en_us","Obsidian Shovel"));
	ohoe = new BasicHoe(new ResourceLocation(modid + ":" + "obsidian_hoe"),obsidian_material,CreativeTabs.TOOLS,new LangEntry("en_us","Obsidian Hoe"));
	new ToolSet(opic,oaxe,osword,ospade,ohoe,new ItemStack(Blocks.OBSIDIAN),new ItemStack(Items.STICK),false,false);
	
	bedrockpic = new BasicPickaxe(new ResourceLocation(modid + ":" + "bedrock_pickaxe"),bedrock_material,CreativeTabs.TOOLS,new LangEntry("en_us","Bedrock Pickaxe"));
	bedrockaxe = new BasicAxe(new ResourceLocation(modid + ":" + "bedrock_axe"),bedrock_material,CreativeTabs.TOOLS,new LangEntry("en_us","Bedrock Axe"));
	bedrocksword = new BasicSword(new ResourceLocation(modid + ":" + "bedrock_sword"),bedrock_material,CreativeTabs.TOOLS,new LangEntry("en_us","Bedrock Sword"));
	bedrockspade = new BasicSpade(new ResourceLocation(modid + ":" + "bedrock_spade"),bedrock_material,CreativeTabs.TOOLS,new LangEntry("en_us","Bedrock Shovel"));
	bedrockhoe = new BasicHoe(new ResourceLocation(modid + ":" + "bedrock_hoe"),bedrock_material,CreativeTabs.TOOLS,new LangEntry("en_us","Bedrock Hoe"));
	new ToolSet(bedrockpic,bedrockaxe,bedrocksword,bedrockspade,bedrockhoe,new ItemStack(Blocks.BEDROCK),new ItemStack(Items.STICK),false,false);
	    
	redstonepic = new BasicPickaxe(new ResourceLocation(modid + ":" + "redstone_pickaxe"),redstone_material,CreativeTabs.TOOLS,new LangEntry("en_us","Redstone Pickaxe"));
	redstoneaxe = new BasicAxe(new ResourceLocation(modid + ":" + "redstone_axe"),redstone_material,CreativeTabs.TOOLS,new LangEntry("en_us","Redstone Axe"));
	redstone_sword = new BasicSword(new ResourceLocation(modid + ":" + "redstone_sword"),redstone_material,CreativeTabs.TOOLS,new LangEntry("en_us","Redstone Sword"));
	redstoneshovel = new BasicSpade(new ResourceLocation(modid + ":" + "redstone_spade"),redstone_material,CreativeTabs.TOOLS,new LangEntry("en_us","Redstone Shovel"));
	redstonehoe = new BasicHoe(new ResourceLocation(modid + ":" + "redstone_hoe"),redstone_material,CreativeTabs.TOOLS,new LangEntry("en_us","Redstone Hoe"));
	new ToolSet(redstonepic,redstoneaxe,redstone_sword,redstoneshovel,redstonehoe,new ItemStack(Blocks.REDSTONE_BLOCK),new ItemStack(Items.STICK),false,false);
	   
	lapispic = new BasicPickaxe(new ResourceLocation(modid + ":" + "lapis_pickaxe"),lapis_material,CreativeTabs.TOOLS,new LangEntry("en_us","Lapis Pickaxe"));
	lapisaxe = new BasicAxe(new ResourceLocation(modid + ":" + "lapis_axe"),lapis_material,CreativeTabs.TOOLS,new LangEntry("en_us","Lapis Axe"));
	lapis_sword = new BasicSword(new ResourceLocation(modid + ":" + "lapis_sword"),lapis_material,CreativeTabs.TOOLS,new LangEntry("en_us","Lapis Sword"));
	lapis_shovel = new BasicSpade(new ResourceLocation(modid + ":" + "lapis_spade"),lapis_material,CreativeTabs.TOOLS,new LangEntry("en_us","Lapis Shovel"));
	lapishoe = new BasicHoe(new ResourceLocation(modid + ":" + "lapis_hoe"),lapis_material,CreativeTabs.TOOLS,new LangEntry("en_us", "Lapis Hoe"));
	new ToolSet(lapispic,lapisaxe,lapis_sword,lapis_shovel,lapishoe,new ItemStack(Blocks.LAPIS_BLOCK),new ItemStack(Items.STICK),false,false);
	  
	quartzpic = new BasicPickaxe(new ResourceLocation(modid + ":" + "quartz_pickaxe"),quartz_material,CreativeTabs.TOOLS,new LangEntry("en_us", "Quartz Pickaxe"));
	quartzaxe = new BasicAxe(new ResourceLocation(modid + ":" + "quartz_axe"),quartz_material,CreativeTabs.TOOLS,new LangEntry("en_us","Quartz Axe"));
	quartzsword = new BasicSword(new ResourceLocation(modid + ":" + "quartz_sword"),quartz_material,CreativeTabs.TOOLS,new LangEntry("en_us","Quartz Sword"));
	quartzshovel = new BasicSpade(new ResourceLocation(modid + ":" + "quartz_spade"),quartz_material,CreativeTabs.TOOLS,new LangEntry("en_us","Quartz Shovel"));
	quartzhoe = new BasicHoe(new ResourceLocation(modid + ":" + "quartz_hoe"),quartz_material,CreativeTabs.TOOLS,new LangEntry("en_us","Quartz Hoe"));
	new ToolSet(quartzpic,quartzaxe,quartzsword,quartzshovel,quartzhoe,new ItemStack(Blocks.QUARTZ_BLOCK),new ItemStack(Items.STICK),true,false);
	
	//armor
	oh = new BasicPotionArmor(new ResourceLocation(modid + ":" + "obsidian_helmet"), obsidian_armor_material, 0, EntityEquipmentSlot.HEAD,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us","Obsidian Helmet"));
    oc = new BasicPotionArmor(new ResourceLocation(modid + ":" + "obsidian_chestplate"), obsidian_armor_material, 0, EntityEquipmentSlot.CHEST,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us","Obsidian Chestplate"));
    ol = new BasicPotionArmor(new ResourceLocation(modid + ":" + "obsidian_leggings"), obsidian_armor_material, 0, EntityEquipmentSlot.LEGS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us","Obsidian Leggings"));
    ob = new BasicPotionArmor(new ResourceLocation(modid + ":" + "obsidian_boots"), obsidian_armor_material, 0, EntityEquipmentSlot.FEET,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us","Obsidian Boots"));
    new ArmorSet(oh,oc,ol,ob,new ItemStack(Blocks.OBSIDIAN),false);
	
	bh = new BasicPotionArmor(new ResourceLocation(modid + ":" + "bedrock_helmet"), bedrock_armor_material, 0, EntityEquipmentSlot.HEAD,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us","Bedrock Helmet"));
	bc = new BasicPotionArmor(new ResourceLocation(modid + ":" + "bedrock_chestplate"),bedrock_armor_material, 0, EntityEquipmentSlot.CHEST,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us", "Bedrock Chestplate"));
	bl = new BasicPotionArmor(new ResourceLocation(modid + ":" + "bedrock_leggings"),bedrock_armor_material, 0, EntityEquipmentSlot.LEGS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us", "Bedrock Leggings"));
	bb = new BasicPotionArmor(new ResourceLocation(modid + ":" + "bedrock_boots"),bedrock_armor_material, 0, EntityEquipmentSlot.FEET,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("en_us", "Bedrock Boots"));
	new ArmorSet(bh,bc,bl,bb,new ItemStack(Blocks.BEDROCK),false);
	
	rh = new BasicArmor(new ResourceLocation(modid + ":" + "redstone_helmet"),redstone_armor_material, 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("en_us","Redstone Helmet"));
	rc = new BasicArmor(new ResourceLocation(modid + ":" + "redstone_chestplate"),redstone_armor_material, 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("en_us","Redstone Boots"));
	rl = new BasicArmor(new ResourceLocation(modid + ":" + "redstone_leggings"),redstone_armor_material, 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("en_us","Redstone Leggings"));
	rb = new BasicArmor(new ResourceLocation(modid + ":" + "redstone_boots"),redstone_armor_material, 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("en_us","Redstone Boots"));
	new ArmorSet(rh,rc,rl,rb,new ItemStack(Blocks.REDSTONE_BLOCK),false);
	   
	lh = new BasicArmor(new ResourceLocation(modid + ":" + "lapis_helmet"),lapis_amror_material, 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("en_us","Lapis Helmet"));
	lc = new BasicArmor(new ResourceLocation(modid + ":" + "lapis_chestplate"),lapis_amror_material, 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("en_us","Lapis Chestplate"));
	ll = new BasicArmor(new ResourceLocation(modid + ":" + "lapis_leggings"),lapis_amror_material, 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("en_us","Lapis Leggings"));
	lb = new BasicArmor(new ResourceLocation(modid + ":" + "lapis_boots"),lapis_amror_material, 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("en_us","Lapis Boots"));
	new ArmorSet(lh,lc,ll,lb,new ItemStack(Blocks.LAPIS_BLOCK),false);
	    
	qh = new BasicArmor(new ResourceLocation(modid + ":" + "quartz_helmet"),  quartz_armor_material, 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("en_us","Quartz Helmet"));
	qc = new BasicArmor(new ResourceLocation(modid + ":" + "quartz_chestplate"), quartz_armor_material, 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("en_us","Quartz Chestplate"));
	ql = new BasicArmor(new ResourceLocation(modid + ":" + "quartz_leggings"), quartz_armor_material, 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("en_us","Quartz Leggings"));
	qb = new BasicArmor(new ResourceLocation(modid + ":" + "quartz_boots"),quartz_armor_material, 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("en_us","Quartz Boots"));
	new ArmorSet(qh,qc,ql,qb,new ItemStack(Blocks.QUARTZ_BLOCK),true);
	    
	dh = new BasicArmor(new ResourceLocation(modid + ":" + "dirt_helmet"),dirt_armor_material, 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("en_us","Dirt Helmet"));
	dc = new BasicArmor(new ResourceLocation(modid + ":" + "dirt_chestplate"),dirt_armor_material, 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("en_us","Dirt Chestplate"));
	dl = new BasicArmor(new ResourceLocation(modid + ":" + "dirt_leggings"),dirt_armor_material, 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("en_us","Dirt Leggings"));
	db = new BasicArmor(new ResourceLocation(modid + ":" + "dirt_boots"),dirt_armor_material, 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("en_us","Dirt Boots"));
	new ArmorSet(dh, dc, dl, db,new ItemStack(Blocks.DIRT), true);
  }

  @Mod.EventHandler
  public void Init(FMLInitializationEvent event)
  {
	  Blocks.BEDROCK.setHardness(Config.bhard);
      Blocks.BEDROCK.setHarvestLevel("pickaxe", Config.blvl);
      Blocks.END_PORTAL_FRAME.setHardness(Config.ehard);
      Blocks.END_PORTAL_FRAME.setHarvestLevel("pickaxe", Config.elvl);
      MinecraftForge.EVENT_BUS.register(this);
  }
  
  @SubscribeEvent
  public void on(BlockEvent.HarvestDropsEvent event)
  {
	if(event.getState() == null)
		return;
    if ((event.getState().getBlock() instanceof BlockEndPortalFrame) || event.getState().getBlock() == Blocks.BEDROCK)
    	event.getDrops().add(new ItemStack(event.getState().getBlock(), 1));
  }
  
  @Mod.EventHandler
  public void postInit(FMLPostInitializationEvent event) {}


}
