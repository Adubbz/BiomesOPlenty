package tdwp_ftw.biomesop.blocks;

import tdwp_ftw.biomesop.mod_BiomesOPlenty;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class BlockRedRockCobble extends Block
{
    public BlockRedRockCobble(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(mod_BiomesOPlenty.tabBiomesOPlenty);
    }
    
	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("BiomesOPlenty:redcobble");
	}
}
