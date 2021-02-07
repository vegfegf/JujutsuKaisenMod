package com.Applhau.JujutsuKaisenMod.base;

import com.Applhau.JujutsuKaisenMod.Main;
import com.Applhau.JujutsuKaisenMod.init.JujutsuKaisenItems;
import com.Applhau.JujutsuKaisenMod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class JujutsuKaisenItem extends Item implements IHasModel
{
	public JujutsuKaisenItem(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		JujutsuKaisenItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerModel(this, 0);
	}

	
}
