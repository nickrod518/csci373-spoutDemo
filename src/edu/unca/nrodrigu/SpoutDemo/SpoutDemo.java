package edu.unca.nrodrigu.SpoutDemo;

import java.util.logging.Level;

import org.bukkit.plugin.java.JavaPlugin;

public class SpoutDemo extends JavaPlugin {
	/*
	 * This is called when your plug-in is enabled
	 */
	public void onEnable() {
		// from Spout tutorial
		getLogger().log(Level.INFO, "SpoutDemo Enabled!");

		// save the configuration file
		saveDefaultConfig();

		// Create the listener
		new SpoutDemoListener();
	}

	/*
	 * This is called when your plug-in shuts down
	 */
	@Override
	public void onDisable() {
		getLogger().log(Level.INFO, "SpoutDemo Disabled!");

	}
}
