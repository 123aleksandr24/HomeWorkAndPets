import kotlin.Unit;
import kotlin.jvm.Throws;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;
import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.io.IOException;

public class Java {

    private int hitPoints = 52489112;
    private String greeting = "BLARGH";

    public static void main(String[] args) {
        System.out.println(Hero.makeProclamation());
    }


     System.out.println("Spells:"); //391
    Spellbook spellbook = new Spellbook();
    for (String spell : spellbook.spells) {
        System.out.println(spell);
    }

     Spellbook.getSpellbookGreeting();//393

    Function1<String, Unit> translator = Hero.getTranslator();
    translator.invoke("TRUCE"); // вызов функционального типа в джава

    public String utterGreeting() {
        return greeting;
    }

    @Nullable
    public String determineFriendshipLevel() {
        return null;  // возвр нулл тк монстру чуждо дружелюбие
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void offerFood() {   //387 даёт возможность предложить еду монстру
        Hero.handOverFood("pizza");  // нужно  @JvmOverloads в котлине
    }

    public void extendHandInFriendship() throws Exception {
        throw new Exception();
    }

    public static void handOverFood(String leftHand, String rightHand) { //387
        System.out.println("Mmmm... you hand over some delicious " +
                leftHand + " and " + rightHand + ".");
    }

    public static void handOverFood(String leftHand) {
        handOverFood(leftHand, "beef");
    }
    public static void handOverFood() {
        handOverFood("berries", "beef");
    }



    public void apologize() {
        try {
            Hero.acceptApology();
        } catch (IOException e) {
            System.out.println("Caught!");
        }
    }
}

