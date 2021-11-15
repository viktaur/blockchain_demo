import java.security.MessageDigest;
import java.io.*;
import java.util.List;

public class Toolbox {

  //hash
  public static String getHash(String data) {
    try {
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      md.update(data.getBytes());
      return bytesToHex(md.digest());
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
  }

  private static String bytesToHex(byte[] bytes) {
    StringBuilder result = new StringBuilder();
    for (byte b : bytes)
      result.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
    return result.toString();
  }

  public static void printBlockChain(List<Block> blockchain) {
    for (Block block : blockchain) {
      block.printBlock();
    }
  }
}
