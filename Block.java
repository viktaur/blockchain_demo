import java.lang.Object;
import java.util.Date;

public class Block {

  int id;
  int maximumNonce = 100000;

  public String hash;
  public String previousHash;
  private String data;
  private long timeStamp;

  String validBlockHash;
  int validNonce;

  public Block(String previousHash, String data) {
    this.id = id;
    this.previousHash = previousHash;
    this.data = data;
  }

  public int getId() {
    return id;
  }

  public String getBlockHash(int nonce) {
    return Toolbox.getHash(getData() + getPreviousHash() + nonce);
  }

  public String getValidBlockHash() {
    mineBlock();
    return validBlockHash;
  }

  public int getValidNonce() {
    return validNonce;
  }

  public String getPreviousHash() {
    return previousHash;
  }

  public String getData() {
    return data;
  }

  public boolean isValid(int nonce) {
    return getBlockHash(nonce).startsWith("0000");
  }

  public void mineBlock() {
    for (int i = 0; i < maximumNonce; i++) {
      if (isValid(i)) {
        validBlockHash = getBlockHash(i);
        validNonce = i;
//        System.out.println("The nonce is " + validNonce);
        break;
      }
    }
  }

  public void printBlock() {
    System.out.println("--------------------------------------------------------------------------------");
    System.out.println("ID: " + id);
    System.out.println("Hash: " + getBlockHash(validNonce));
    System.out.println("Nonce: " + validNonce);
    System.out.println("Previous hash: " + previousHash);
    System.out.println("Valid: " + isValid(validNonce));
    System.out.println("--------------------------------------------------------------------------------");
  }
}