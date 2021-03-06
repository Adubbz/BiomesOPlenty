package tdwp_ftw.biomesop.blocks;

import tdwp_ftw.biomesop.mod_BiomesOPlenty;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;

public class BlockAcaciaPlank extends Block
{
    public static final String[] woodType = new String[] {"acacia"};

    public BlockAcaciaPlank(int par1)
    {
        super(par1, Material.wood); 
		this.setBurnProperties(this.blockID, 5, 20);
        this.setCreativeTab(mod_BiomesOPlenty.tabBiomesOPlenty);
    }

	@Override
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.blockIcon = par1IconRegister.registerIcon("BiomesOPlenty:acaciaplank");
	}
	
    public int damageDropped(int par1)
    {
        return par1;
    }
}
