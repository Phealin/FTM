package phealin.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import phealin.mod.entity.EntityPurporiumGolem;
import phealin.mod.objects.armor.ArmorBase;
import phealin.mod.objects.items.ItemBase;
import phealin.mod.objects.tools.ToolAxe;
import phealin.mod.objects.tools.ToolHoe;
import phealin.mod.objects.tools.ToolPickaxe;
import phealin.mod.objects.tools.ToolShears;
import phealin.mod.objects.tools.ToolShovel;
import phealin.mod.objects.tools.ToolSword;
import phealin.mod.util.Reference;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_VIOLIUM = EnumHelper.addToolMaterial("tool_violium", 4, 1200, 7.0F, 2.5F, 12);
	public static final ToolMaterial TOOL_PURPORIUM = EnumHelper.addToolMaterial("tool_purporium", 5, 2000, 10.0F, 4F, 16);
	
	public static final ArmorMaterial ARMOR_VIOLIUM = EnumHelper.addArmorMaterial("armor_material", Reference.MODID + ":violium", 25, new int[]{2, 5, 7, 2}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F);
	public static final ArmorMaterial ARMOR_PURPORIUM = EnumHelper.addArmorMaterial("armor_purporium", Reference.MODID + ":violium", 50, new int[]{4, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.0F);
	
	//Items
	public static final Item INGOT_VIOLIUM = new ItemBase("ingot_violium");
	public static final Item NUGGET_VIOLIUM = new ItemBase("nugget_violium");
	public static final Item STICK_VIOLIUM = new ItemBase("stick_violium");
	public static final Item INGOT_PURPORIUM = new ItemBase("ingot_purporium");
	public static final Item NUGGET_PURPORIUM = new ItemBase("nugget_purporium");
	public static final Item STICK_PURPORIUM = new ItemBase("stick_purporium");	
	public static final Item BUCKET_CITIRIUS = new ItemBase("bucket_citirius");
	
	//Tools
	public static final Item AXE_VIOLIUM = new ToolAxe("axe_violium", TOOL_VIOLIUM);
	public static final Item SHOVEL_VIOLIUM = new ToolShovel("shovel_violium", TOOL_VIOLIUM);
	public static final Item PICKAXE_VIOLIUM = new ToolPickaxe("pickaxe_violium", TOOL_VIOLIUM);
	public static final Item SWORD_VIOLIUM = new ToolSword("sword_violium", TOOL_VIOLIUM);
	public static final Item HOE_VIOLIUM = new ToolHoe("hoe_violium", TOOL_VIOLIUM);
	public static final Item AXE_PURPORIUM = new ToolAxe("axe_purporium", TOOL_PURPORIUM);
	public static final Item SHOVEL_PURPORIUM = new ToolShovel("shovel_purporium", TOOL_PURPORIUM);
	public static final Item PICKAXE_PURPORIUM = new ToolPickaxe("pickaxe_purporium", TOOL_PURPORIUM);
	public static final Item SWORD_PURPORIUM = new ToolSword("sword_purporium", TOOL_PURPORIUM);
	public static final Item HOE_PURPORIUM = new ToolHoe("hoe_purporium", TOOL_PURPORIUM);
	
	//Armor
	public static final Item HELMET_VIOLIUM = new ArmorBase("helmet_violium", ARMOR_VIOLIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_VIOLIUM = new ArmorBase("chestplate_violium", ARMOR_VIOLIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGS_VIOLIUM = new ArmorBase("legs_violium", ARMOR_VIOLIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_VIOLIUM = new ArmorBase("boots_violium", ARMOR_VIOLIUM, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_PURPORIUM = new ArmorBase("helmet_purporium", ARMOR_PURPORIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_PURPORIUM = new ArmorBase("chestplate_purporium", ARMOR_PURPORIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGS_PURPORIUM = new ArmorBase("legs_purporium", ARMOR_PURPORIUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_PURPORIUM = new ArmorBase("boots_purporium", ARMOR_PURPORIUM, 1, EntityEquipmentSlot.FEET);
}
