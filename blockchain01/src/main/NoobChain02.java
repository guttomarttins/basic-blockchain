package main;

import com.google.gson.GsonBuilder;
import static main.Main.blockchain;
import model.Block;

/**
 *
 * @author Carlos
 */
public class NoobChain02 {

    public static void generatorBlockChain() {
        //add our blocks to the blockchain ArrayList:
        blockchain.add(new Block("Hi im the first block", "0"));
        blockchain.add(new Block("Yo im the second block", blockchain.get(blockchain.size() - 1).getHash()));
        blockchain.add(new Block("Hey im the third block", blockchain.get(blockchain.size() - 1).getHash()));

        String blockchainJson = new GsonBuilder().setPrettyPrinting().create().toJson(blockchain);

        System.out.println(blockchainJson);
    }
}
