public class Loader2 {
    public static void main(String[] args) {
        work("Яна B И");

    }

    private static void work(String name){
        int countSpace = 0;     //счетчик пробелов

        if (name.length() >= 7) {
                for (char c : name.toCharArray()) {
                    if (Character.isSpaceChar(c)) countSpace++;
                }
        } else {
            System.out.println("количстве букв в словах должно быть больше 7");
        }
        if (countSpace == 2) {
            String partOne = name.substring(0, name.indexOf(' '));
            String partTwo = name.substring(name.indexOf(' ') + 1, name.lastIndexOf(' '));
            String partThree = name.substring(name.lastIndexOf(' ') + 1);
            if (partOne.length() > 3) {
                if (checkWord(partOne) && checkWord(partTwo) && checkWord(partThree)) {
                    System.out.println(partOne);
                    System.out.println(partTwo);
                    System.out.println(partThree);
                } else {
                    System.out.println("Неверный ввод");
                }
            } else {
                System.out.println("Неверный ввод");
            }
        }
    }

    private static boolean checkWord(String s) {
        if (s.length() == 0) return false;
            for (int i = 0; i < s.length(); i++) {
                if (i == 0) {
                    if (!Character.isUpperCase(s.charAt(i))) return false;
                } else {
                    if (!Character.isLowerCase(s.charAt(i))) return false;
                }
            }
        return true;
    }

}
