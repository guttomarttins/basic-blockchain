package main;

import java.util.ArrayList;
import model.Block;

/**
 *
 * @author Carlos
 */
public class Main {

    static int generatorBlockChain = 3;
    static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            switch (generatorBlockChain) {
                case 1:
                    System.out.println("\ncase 1: NoobChain01.generatorBlockChain()\n");
                    NoobChain01.generatorBlockChain();
                    break;
                case 2:
                    System.out.println("\ncase 2: NoobChain02.generatorBlockChain()\n");
                    NoobChain02.generatorBlockChain();
                    break;
                case 3:
                    System.out.println("\ncase 3: NoobChain03.generatorBlockChain()\n");
                    NoobChain03.generatorBlockChain();
                    break;
                default:
                    System.out.println("\ndefault: NoobChain01.generatorBlockChain()\n");
                    NoobChain01.generatorBlockChain();
                    break;
            } 
        } catch (Exception e) {
            System.out.println("Error: ".concat(e.toString()));
        }
    }

}
