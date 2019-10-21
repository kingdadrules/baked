package lastworld;

import java.util.Random;




import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class LastWorldGenerator extends WorldGenerator implements IWorldGenerator {
	
	int count = 0;
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		int blockX = chunkX * 16;
		int blockZ = chunkZ * 16;
		
		if (world.provider.getDimension() == 11)
		{	
				generateOverworld(world, rand, blockX + 8, blockZ + 8);
		}
	}
	
	private void generateOverworld(World world, Random rand, int blockX, int blockZ)
	{	
		if (count == 0)
		{
			BlockPos pos = new BlockPos(1000, 70, 1000);
			WorldGenerator structure = new LoonybinWorldGen();
			structure.generate(world, rand, pos);
			count = 1;
		}
	}	
			
	
	@Override
	public boolean generate(World worldIn, Random rand, BlockPos position) {
		// TODO Auto-generated method stub
		return false;
	}
}