package com.github.jlran;

import org.bukkit.plugin.java.JavaPlugin;

public class FirstMcPlugin extends JavaPlugin{
	@Override
	public void onEnable() {
		//�����������ʱ����
		getLogger().info("onEnable ��������....");
	}
	
	@Override
	public void onDisable() {
		//�����ж��ʱ����
		//getLogger().info("onDisable ��ж����....");
	}
}
