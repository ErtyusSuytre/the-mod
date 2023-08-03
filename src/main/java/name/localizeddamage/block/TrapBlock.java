package name.localizeddamage.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;

import javax.swing.text.html.BlockView;

public class TrapBlock extends Block{
    public TrapBlock(Settings settings) {
        super(settings);
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        VoxelShape shape = VoxelShapes.empty();
        return VoxelShapes.cuboid(0.75f, 0.75f, 0.75f, 0.75f, 0.75f, 0.75f);
    }

}
