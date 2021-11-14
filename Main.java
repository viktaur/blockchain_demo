import java.util.ArrayList;
import java.util.List;

public class Main {

  List<Block> blockchain = new ArrayList<>();

  public void main(String[] args) {

    blockchain.add(new Block(0, "0000000000000000000000000000000000000000000000000000000000000000", "genesis block"));
    blockchain.add(new Block(1, blockchain.get(0).getBlockHash(), "data on block 1"));
    blockchain.add(new Block(2, blockchain.get(1).getBlockHash(), "data on block 2 alsdkfjlksdj"));

  }
}
