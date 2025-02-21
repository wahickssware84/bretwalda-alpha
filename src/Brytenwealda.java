import java.util.Scanner;
import java.util.Random; // randomizer

/**
 * @param
 * @return
 */
public class Brytenwealda {
    public static void main(String[] args) {
        Integer score = 0;
        Integer factionID = 0;
        String userInput = "";
        String faction = "";
        Faction Angles = new Faction(1, "Angles", "");
        Faction Saxons = new Faction(2, "Saxons", "");
        Faction Jutes = new Faction(3, "Jutes", "");
        Faction Britons = new Faction(4, "Britons", "");
        Faction Picts = new Faction(5, "Picts", "");
        Faction Gaels = new Faction(6, "Gaels", "");
        String intro = ("Welcome to Brytenwealda!\n");
        String factionPrompt = ("- CHOOSE YOUR FACTION -\n" +
                "1. Angles\n" + // (Germanic, Pagan)
                "2. Saxons\n" + // (Germanic, Pagan)
                "3. Jutes\n" + // (Germanic, Christian)
                "4. Britons\n" + // (Brythonic, Christian)
                "5. Picts\n" + // (Brythonic, Pagan)
                "6. Gaels\n"); // (Goidelic, Pagan)

        Scanner in = new Scanner(System.in);

        displayWindow(intro);
        displayWindow(factionPrompt);
        userInput = in.nextLine();
        factionID = Integer.parseInt(userInput);
        System.err.print("\tFaction ID:" + factionID);
        faction = assignFaction(factionID);
        System.err.print("\tFaction:" + faction);
        displayWindow("THE " + faction.toUpperCase());
    }

    public static String assignFaction(Integer factionID) {
        String s = "";
        if (factionID == 1)
            s = "Angles";
        else if (factionID == 2)
            s = "Saxons";
        else if (factionID == 3)
            s = "Jutes";
        else if (factionID == 4)
            s = "Britons";
        else if (factionID == 5)
            s = "Picts";
        else if (factionID == 6)
            s = "Gaels";
        return s;
    }

    public static void displayWindow(String s) {
        char x = '*';
        int y = 40;
        for (int i = 0; i < y; ++i) {
            System.out.print(x);
        }
        System.out.print("\n\t" + s + "\n");
        for (int i = 0; i < y; ++i) {
            System.out.print(x);
        }
        System.out.print('\n');
    }
}
