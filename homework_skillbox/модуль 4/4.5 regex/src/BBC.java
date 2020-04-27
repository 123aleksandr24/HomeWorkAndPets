public class BBC {
    public static void main(String[] args) {
        //написать программу которая разбивает новости BBC на слова
        String bbs = "Some thought they would be the Fort Knox of bins. Well,\n" +
                "sort of. Resistant to marauding raccoons, or at least that\n" +
                "was the hope. To residents of Toronto, Canada, raccoons are\n" +
                "a familiar pest. The mammals adore rummaging through household\n" +
                "waste, seeking out scraps of food. But a few years ago, the\n" +
                "city launched new rubbish bins with securely locking lids.\n" +
                "And yet, the wiliest raccoons still found a way to get inside\n" +
                "them. Video captured by a reporter at local newspaper The Star\n" +
                "shows one of the animals tipping over a bin, and – impressively –\n" +
                "turning the handle lock on the lid to gain access to the contents.\n" +
                "Before the bins were deployed, they were tested with “dozens and\n" +
                "dozens” of raccoons by Suzanne MacDonald at York University,\n" +
                "Toronto, who studies the animals. None ever managed to break in\n" +
                "so she was surprised when she saw that the bins could, in fact, be breached.\n" +
                "You might also like:\n" +
                "How do you bring wildlife back to the city?\n" +
                "How weeds help fight climate change\n" +
                "Why the future on nature will be weird\n" +
                "“Only a few raccoons have figured out how to break into the bins,”\n" +
                "she says, two years later. “I can’t imagine how they would be modified,\n" +
                "frankly, because some raccoons will always figure out how to break things.”\n" +
                "It raises a question, though. Do the secure locks, traps and\n" +
                "barriers we use to keep so-called pests at bay actually prompt\n" +
                "them to learn or evolve in order to outwit such measures? We\n" +
                "already know that, in trying to poison urban rats, we are\n" +
                "encouraging them to develop resistance to those same chemicals.\n" +
                "Could the same thing be happening with the intelligence,\n" +
                "or cognitive prowess, of pests?\n" +
                "The first thing to note, says MacDonald, is that Toronto’s\n" +
                "raccoons are not dependent on cracking into the locked bins\n" +
                "for food, so there is no selection pressure prioritising\n" +
                "the survival of the raccoons that know how to bust open a bin.\n" +
                "Plus, she adds that raccoons are not social learners, so the\n" +
                "raiders of the locked bins won’t have taught others how they did it";

        String[] news = bbs.split("\\s");

        String words;
        for (int i = 0; i < news.length; i++) {
            words = String.valueOf(news[i]);
            System.out.println(words);
        }
    }

}
