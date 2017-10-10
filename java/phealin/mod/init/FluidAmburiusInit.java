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

public class FluidAmburiusInit 
{	
private static ModelResourceLocation amburius_location = new ModelResourceLocation(Reference.MODID + ":" + BlockFluidAmburius.name, "fluid");
	
	public static void register() {
		FluidRegistry.registerFluid(FluidAmburius.instance);
		ForgeRegistries.BLOCKS.register(BlockFluidAmburius.instance);
		Item Amburius = Item.getItemFromBlock(BlockFluidAmburius.instance);
		ModelLoader.setCustomMeshDefinition(Amburius, new ItemMeshDefinition() {
			
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return amburius_location;
			}
		});
		ModelLoader.setCustomStateMapper(BlockFluidAmburius.instance, new StateMapperBase() {
			
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return amburius_location;
			}
		});
		FluidRegistry.addBucketForFluid(FluidAmburius.instance);
	}
	
	public static final class FluidAmburius extends Fluid {
		
		public static final String name = "amburius";
		public static final FluidAmburius instance = new FluidAmburius();
		
		public FluidAmburius() {
			super(name, new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_still"), new ResourceLocation(Reference.MODID + ":" + "blocks/" + name  + "_flow"));
			this.setDensity(2000);
			this.setViscosity(2000);
			this.setEmptySound(SoundEvents.ITEM_BUCKET_EMPTY);
			this.setFillSound(SoundEvents.ITEM_BUCKET_FILL);
		}
	}
	
	public static final class BlockFluidAmburius extends BlockFluidClassic {
		
		public static final BlockFluidAmburius instance = new BlockFluidAmburius();
		public static final String name = "Amburius";
		
		public BlockFluidAmburius() {
			super(FluidAmburius.instance, Material.WATER);
			setUnlocalizedName("blockfluidAmburius");
			setRegistryName(amburius_location);
			setCreativeTab(Main.firsttab);
		}
		
		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}
	}
}