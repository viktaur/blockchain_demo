import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<Block> blockchain = new ArrayList<>();

    Block block0 = new Block(0, "0000000000000000000000000000000000000000000000000000000000000000", "genesis block");

    blockchain.add(block0);
    blockchain.add(new Block(1, blockchain.get(0).getValidBlockHash(), "data on block 1"));
    blockchain.add(new Block(2, blockchain.get(1).getValidBlockHash(), "data on block 2"));
    blockchain.add(new Block(3, blockchain.get(2).getValidBlockHash(), "data on block 3"));

    block0.printBlock();
    blockchain.get(1).printBlock();
    blockchain.get(2).printBlock();
    blockchain.get(3).printBlock();

  }
}
