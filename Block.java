import java.lang.Object;

public class Block {

  int id;
  int maximumNonce = 100000;
  String previousHash;
  String data;
  String validBlockHash;
  int nonce;

  public Block(int id, String previousHash, String data) {
    this.id = id;
    this.previousHash = previousHash;
    this.data = data;
  }

  public int getId() {
    return id;
  }

  public String getBlockHash() {
    return Toolbox.getHash(getData() + getPreviousHash() + nonce);
  }

  public String getPreviousHash() {
    return previousHash;
  }

  public String getData() {
    return data;
  }

  public boolean isValid() {
    return getBlockHash().startsWith("0000");
  }

  public void mineBlock(){
    for (int i = 0; i < maximumNonce; i++) {
      if (isValid()) {
        nonce = i;
        validBlockHash = getBlockHash();
        break;
      }
    }
  }
}