package com.Applhau.JujutsuKaisenMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Applhau.JujutsuKaisenMod.Armor.Renderer.GojoEyeband;
import com.Applhau.JujutsuKaisenMod.base.JujutsuKaisenArmor;
import com.Applhau.JujutsuKaisenMod.base.JujutsuKaisenItem;
import com.Applhau.JujutsuKaisenMod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class JujutsuKaisenItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item CURSED_CLOTH = new JujutsuKaisenItem("cursed_cloth");
	public static final Item CURSED_ENERGY = new JujutsuKaisenItem("cursed_energy");
	
	public static final ArmorMaterial GOJO_EYEBAND_MATERIAL = EnumHelper.addArmorMaterial("gojo", Reference.MOD_ID + ":gojo", 40, new int[]{2, 7, 9, 2}, 0, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	public static final Item GOJO_EYEBAND = new GojoEyeband("gojo_eyeband", GOJO_EYEBAND_MATERIAL, EntityEquipmentSlot.HEAD);
	public static final Item GOJO_JACKET = new GojoEyeband("gojo_jacket", GOJO_EYEBAND_MATERIAL, EntityEquipmentSlot.CHEST);

	
}
