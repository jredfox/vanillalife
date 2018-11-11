package com.evilnotch.vanillalife;

import com.evilnotch.lib.minecraft.content.item.armor.ArmorMat;
import com.evilnotch.lib.minecraft.content.item.armor.ArmorSet;
import com.evilnotch.lib.minecraft.content.item.armor.BasicArmor;
import com.evilnotch.lib.minecraft.content.item.armor.PotionArmor;
import com.evilnotch.lib.minecraft.content.item.tool.ItemBasicAxe;
import com.evilnotch.lib.minecraft.content.item.tool.ItemBasicHoe;
import com.evilnotch.lib.minecraft.content.item.tool.ItemBasicPickaxe;
import com.evilnotch.lib.minecraft.content.item.tool.ItemBasicSpade;
import com.evilnotch.lib.minecraft.content.item.tool.ItemBasicSword;
import com.evilnotch.lib.minecraft.content.item.tool.ToolMat;
import com.evilnotch.lib.minecraft.content.item.tool.ToolSet;
import com.evilnotch.lib.minecraft.content.lang.LangEntry;

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


@Mod(modid=MainJava.modid, name=MainJava.name, version=MainJava.version, dependencies = "required-after:evilnotchlib@[1.2.3]")
public class MainJava
{
  public static final String modid = "vanillalife";
  public static final String name = "Vanilla Life";
  public static final String version = "1.2.7";
  
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
	opic = new ItemBasicPickaxe(obsidian_material,new ResourceLocation(modid + ":" + "obsidian_pickaxe"),CreativeTabs.TOOLS,new LangEntry("Obsidian Pickaxe","en_us"));
	oaxe = new ItemBasicAxe(obsidian_material,new ResourceLocation(modid + ":" + "obsidian_axe"),CreativeTabs.TOOLS,new LangEntry("Obsidian Axe","en_us"));
	osword = new ItemBasicSword(obsidian_material,new ResourceLocation(modid + ":" + "obsidian_sword"),CreativeTabs.TOOLS,new LangEntry("Obsidian Sword","en_us"));
	ospade = new ItemBasicSpade(obsidian_material,new ResourceLocation(modid + ":" + "obsidian_spade"),CreativeTabs.TOOLS,new LangEntry("Obsidian Shovel","en_us"));
	ohoe = new ItemBasicHoe(obsidian_material,new ResourceLocation(modid + ":" + "obsidian_hoe"),CreativeTabs.TOOLS,new LangEntry("Obsidian Hoe","en_us"));
	new ToolSet(opic,oaxe,osword,ospade,ohoe,new ItemStack(Blocks.OBSIDIAN),new ItemStack(Items.STICK),false,false);
	
	bedrockpic = new ItemBasicPickaxe(bedrock_material,new ResourceLocation(modid + ":" + "bedrock_pickaxe"),CreativeTabs.TOOLS,new LangEntry("Bedrock Pickaxe","en_us"));
	bedrockaxe = new ItemBasicAxe(bedrock_material,new ResourceLocation(modid + ":" + "bedrock_axe"),CreativeTabs.TOOLS,new LangEntry("Bedrock Axe","en_us"));
	bedrocksword = new ItemBasicSword(bedrock_material,new ResourceLocation(modid + ":" + "bedrock_sword"),CreativeTabs.TOOLS,new LangEntry("Bedrock Sword","en_us"));
	bedrockspade = new ItemBasicSpade(bedrock_material,new ResourceLocation(modid + ":" + "bedrock_spade"),CreativeTabs.TOOLS,new LangEntry("Bedrock Shovel","en_us"));
	bedrockhoe = new ItemBasicHoe(bedrock_material,new ResourceLocation(modid + ":" + "bedrock_hoe"),CreativeTabs.TOOLS,new LangEntry("Bedrock Hoe","en_us"));
	new ToolSet(bedrockpic,bedrockaxe,bedrocksword,bedrockspade,bedrockhoe,new ItemStack(Blocks.BEDROCK),new ItemStack(Items.STICK),false,false);
	    
	redstonepic = new ItemBasicPickaxe(redstone_material,new ResourceLocation(modid + ":" + "redstone_pickaxe"),CreativeTabs.TOOLS,new LangEntry("Redstone Pickaxe","en_us"));
	redstoneaxe = new ItemBasicAxe(redstone_material,new ResourceLocation(modid + ":" + "redstone_axe"),CreativeTabs.TOOLS,new LangEntry("Redstone Axe","en_us"));
	redstone_sword = new ItemBasicSword(redstone_material,new ResourceLocation(modid + ":" + "redstone_sword"),CreativeTabs.TOOLS,new LangEntry("Redstone Sword","en_us"));
	redstoneshovel = new ItemBasicSpade(redstone_material,new ResourceLocation(modid + ":" + "redstone_spade"),CreativeTabs.TOOLS,new LangEntry("Redstone Shovel","en_us"));
	redstonehoe = new ItemBasicHoe(redstone_material,new ResourceLocation(modid + ":" + "redstone_hoe"),CreativeTabs.TOOLS,new LangEntry("Redstone Hoe","en_us"));
	new ToolSet(redstonepic,redstoneaxe,redstone_sword,redstoneshovel,redstonehoe,new ItemStack(Blocks.REDSTONE_BLOCK),new ItemStack(Items.STICK),false,false);
	   
	lapispic = new ItemBasicPickaxe(lapis_material,new ResourceLocation(modid + ":" + "lapis_pickaxe"),CreativeTabs.TOOLS,new LangEntry("Lapis Pickaxe","en_us"));
	lapisaxe = new ItemBasicAxe(lapis_material,new ResourceLocation(modid + ":" + "lapis_axe"),CreativeTabs.TOOLS,new LangEntry("Lapis Axe","en_us"));
	lapis_sword = new ItemBasicSword(lapis_material,new ResourceLocation(modid + ":" + "lapis_sword"),CreativeTabs.TOOLS,new LangEntry("Lapis Sword","en_us"));
	lapis_shovel = new ItemBasicSpade(lapis_material,new ResourceLocation(modid + ":" + "lapis_spade"),CreativeTabs.TOOLS,new LangEntry("Lapis Shovel","en_us"));
	lapishoe = new ItemBasicHoe(lapis_material,new ResourceLocation(modid + ":" + "lapis_hoe"),CreativeTabs.TOOLS,new LangEntry("Lapis Hoe","en_us"));
	new ToolSet(lapispic,lapisaxe,lapis_sword,lapis_shovel,lapishoe,new ItemStack(Blocks.LAPIS_BLOCK),new ItemStack(Items.STICK),false,false);
	  
	quartzpic = new ItemBasicPickaxe(quartz_material,new ResourceLocation(modid + ":" + "quartz_pickaxe"),CreativeTabs.TOOLS,new LangEntry("Quartz Pickaxe","en_us"));
	quartzaxe = new ItemBasicAxe(quartz_material,new ResourceLocation(modid + ":" + "quartz_axe"),CreativeTabs.TOOLS,new LangEntry("Quartz Axe","en_us"));
	quartzsword = new ItemBasicSword(quartz_material,new ResourceLocation(modid + ":" + "quartz_sword"),CreativeTabs.TOOLS,new LangEntry("Quartz Sword","en_us"));
	quartzshovel = new ItemBasicSpade(quartz_material,new ResourceLocation(modid + ":" + "quartz_spade"),CreativeTabs.TOOLS,new LangEntry("Quartz Shovel","en_us"));
	quartzhoe = new ItemBasicHoe(quartz_material,new ResourceLocation(modid + ":" + "quartz_hoe"),CreativeTabs.TOOLS,new LangEntry("Quartz Hoe","en_us"));
	new ToolSet(quartzpic,quartzaxe,quartzsword,quartzshovel,quartzhoe,new ItemStack(Blocks.QUARTZ_BLOCK),new ItemStack(Items.STICK),true,false);
	
	//armor
	oh = new PotionArmor(obsidian_armor_material, new ResourceLocation(modid + ":" + "obsidian_helmet"), 0, EntityEquipmentSlot.HEAD,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Obsidian Helmet","en_us"));
    oc = new PotionArmor(obsidian_armor_material, new ResourceLocation(modid + ":" + "obsidian_chestplate"), 0, EntityEquipmentSlot.CHEST,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Obsidian Chestplate","en_us"));
    ol = new PotionArmor(obsidian_armor_material, new ResourceLocation(modid + ":" + "obsidian_leggings"), 0, EntityEquipmentSlot.LEGS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Obsidian Leggings","en_us"));
    ob = new PotionArmor(obsidian_armor_material, new ResourceLocation(modid + ":" + "obsidian_boots"), 0, EntityEquipmentSlot.FEET,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Obsidian Boots","en_us"));
    new ArmorSet(oh,oc,ol,ob,new ItemStack(Blocks.OBSIDIAN),false);
	
	bh = new PotionArmor(bedrock_armor_material, new ResourceLocation(modid + ":" + "bedrock_helmet"), 0, EntityEquipmentSlot.HEAD,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Bedrock Helmet","en_us"));
	bc = new PotionArmor(bedrock_armor_material, new ResourceLocation(modid + ":" + "bedrock_chestplate"), 0, EntityEquipmentSlot.CHEST,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Bedrock Chestplate","en_us"));
	bl = new PotionArmor(bedrock_armor_material, new ResourceLocation(modid + ":" + "bedrock_leggings"), 0, EntityEquipmentSlot.LEGS,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Bedrock Leggings","en_us"));
	bb = new PotionArmor(bedrock_armor_material, new ResourceLocation(modid + ":" + "bedrock_boots"), 0, EntityEquipmentSlot.FEET,new PotionEffect(Potion.getPotionFromResourceLocation("minecraft:fire_resistance")),CreativeTabs.COMBAT,new LangEntry("Bedrock Boots","en_us"));
	new ArmorSet(bh,bc,bl,bb,new ItemStack(Blocks.BEDROCK),false);
	
	rh = new BasicArmor(redstone_armor_material, new ResourceLocation(modid + ":" + "redstone_helmet"), 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("Redstone Helmet","en_us"));
	rc = new BasicArmor(redstone_armor_material, new ResourceLocation(modid + ":" + "redstone_chestplate"), 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("Redstone Boots","en_us"));
	rl = new BasicArmor(redstone_armor_material, new ResourceLocation(modid + ":" + "redstone_leggings"), 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("Redstone Leggings","en_us"));
	rb = new BasicArmor(redstone_armor_material, new ResourceLocation(modid + ":" + "redstone_boots"), 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("Redstone Boots","en_us"));
	new ArmorSet(rh,rc,rl,rb,new ItemStack(Blocks.REDSTONE_BLOCK),false);
	   
	lh = new BasicArmor(lapis_amror_material, new ResourceLocation(modid + ":" + "lapis_helmet"), 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("Lapis Helmet","en_us"));
	lc = new BasicArmor(lapis_amror_material, new ResourceLocation(modid + ":" + "lapis_chestplate"), 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("Lapis Chestplate","en_us"));
	ll = new BasicArmor(lapis_amror_material, new ResourceLocation(modid + ":" + "lapis_leggings"), 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("Lapis Leggings","en_us"));
	lb = new BasicArmor(lapis_amror_material, new ResourceLocation(modid + ":" + "lapis_boots"), 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("Lapis Boots","en_us"));
	new ArmorSet(lh,lc,ll,lb,new ItemStack(Blocks.LAPIS_BLOCK),false);
	    
	qh = new BasicArmor(quartz_armor_material, new ResourceLocation(modid + ":" + "quartz_helmet"), 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("Quartz Helmet","en_us"));
	qc = new BasicArmor(quartz_armor_material, new ResourceLocation(modid + ":" + "quartz_chestplate"), 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("Quartz Chestplate","en_us"));
	ql = new BasicArmor(quartz_armor_material, new ResourceLocation(modid + ":" + "quartz_leggings"), 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("Quartz Leggings","en_us"));
	qb = new BasicArmor(quartz_armor_material, new ResourceLocation(modid + ":" + "quartz_boots"), 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("Quartz Boots","en_us"));
	new ArmorSet(qh,qc,ql,qb,new ItemStack(Blocks.QUARTZ_BLOCK),true);
	    
	dh = new BasicArmor(dirt_armor_material, new ResourceLocation(modid + ":" + "dirt_helmet"), 0, EntityEquipmentSlot.HEAD,CreativeTabs.COMBAT,new LangEntry("Dirt Helmet","en_us"));
	dc = new BasicArmor(dirt_armor_material, new ResourceLocation(modid + ":" + "dirt_chestplate"), 0, EntityEquipmentSlot.CHEST,CreativeTabs.COMBAT,new LangEntry("Dirt Chestplate","en_us"));
	dl = new BasicArmor(dirt_armor_material, new ResourceLocation(modid + ":" + "dirt_leggings"), 0, EntityEquipmentSlot.LEGS,CreativeTabs.COMBAT,new LangEntry("Dirt Leggings","en_us"));
	db = new BasicArmor(dirt_armor_material, new ResourceLocation(modid + ":" + "dirt_boots"), 0, EntityEquipmentSlot.FEET,CreativeTabs.COMBAT,new LangEntry("Dirt Boots","en_us"));
	new ArmorSet(dh,dc,dl,db,new ItemStack(Blocks.DIRT),true);
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
