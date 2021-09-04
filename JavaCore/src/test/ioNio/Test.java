package test.ioNio;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        String zapovit = "When I am dead, bury me In my beloved Ukraine, My tomb upon a grave mound high Amid the spreading plain, So that the fields, the boundless steppes, The Dnieper’s plunging shore My eyes could see, my ears could hear The mighty river roar." +
                "When from Ukraine the Dnipro bears Into the deep blue sea The blood of foes … then will I leave These hills and fertile fields — I’ll leave them all and fly away To the abode of God, And then I’ll pray …. But till that day I nothing know of God." +
                "Oh bury me, then rise ye up And break your heavy chains And water with the tyrants’ blood The freedom you have gained. And in the great new family, The family of the free, With softly spoken, kindly word Remember also me.";
        String s = " hello";
        try(FileWriter writer = new FileWriter("test2.txt", true)) {
//            for (int i = 0; i < zapovit.length(); i++){
//                writer.write(zapovit.charAt(i));
//             }
//            writer.write(zapovit);
            writer.write(s);
            System.out.println("Done!!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
