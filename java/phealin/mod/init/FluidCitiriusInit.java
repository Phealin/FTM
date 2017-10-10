package phealin.mod.init;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import phealin.mod.Main;
import phealin.mod.util.Reference;

public class FluidCitiriusInit 
{	
private static ModelResourceLocation citirius_location = new ModelResourceLocation(Reference.MODID + ":" + BlockFluidCitirius.name, "fluid");
	
	public static void register() {
		FluidRegistry.registerFluid(FluidCitirius.instance);
		ForgeRegistries.BLOCKS.register(BlockFluidCitirius.instance);
		Item citirius = Item.getItemFromBlock(BlockFluidCitirius.instance);
		ModelLoader.setCustomMeshDefinition(citirius, new ItemMeshDefinition() {
			
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return citirius_location;
			}
		});
		ModelLoader.setCustomStateMapper(BlockFluidCitirius.instance, new StateMapperBase() {
			
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return citirius_location;
			}
		});
		FluidRegistry.addBucketForFluid(FluidCitirius.instance);
	}
	
	public static final class FluidCitirius extends Fluid {
		
		public static final String name = "citirius";
		public static final FluidCitirius instance = new FluidCitirius();
		
		public FluidCitirius() {
			super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flow"));
			this.setDensity(2000);
			this.setViscosity(2000);
			this.setEmptySound(SoundEvents.ITEM_BUCKET_EMPTY);
			this.setFillSound(SoundEvents.ITEM_BUCKET_FILL);
		}
	}
	
	public static final class BlockFluidCitirius extends BlockFluidClassic {
		
		public static final BlockFluidCitirius instance = new BlockFluidCitirius();
		public static final String name = "citirius";
		
		public BlockFluidCitirius() {
			super(FluidCitirius.instance, Material.WATER);
			setUnlocalizedName("blockfluidcitirius");
			setRegistryName(citirius_location);
			setCreativeTab(Main.firsttab);
		}
		
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}
	}
}