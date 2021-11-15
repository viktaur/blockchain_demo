import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Block> blockchain = new ArrayList<>();

    Block block0 = new Block(0, "0000000000000000000000000000000000000000000000000000000000000000", "genesis block");
    Block block1 = new Block(1, block0.getValidBlockHash(), "data of block 1");
    Block block2 = new Block(2, block1.getValidBlockHash(), "data of block 2");

    block0.mineBlock();
    block1.mineBlock();
    block2.mineBlock();


  }
}
