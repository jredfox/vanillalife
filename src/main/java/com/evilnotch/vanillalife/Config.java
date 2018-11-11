package com.evilnotch.vanillalife;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config {
	
	public static float bhard = -1;
	public static float ehard = -1;
	public static int blvl = -1;
	public static int elvl = -1;

	public static void loadconfig(FMLPreInitializationEvent event) {
		Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
		cfg.load();
		bhard = (float)cfg.get("general", "bedrockHardness", 333.0D).getDouble();
		ehard = (float)cfg.get("general", "endportalHardness", 1.0D).getDouble();
		blvl = cfg.get("general", "endportalHarvestLevel", 4).getInt();
		elvl = cfg.get("general", "endportalHarvestLevel", 4).getInt();
		cfg.save();
	}

}
