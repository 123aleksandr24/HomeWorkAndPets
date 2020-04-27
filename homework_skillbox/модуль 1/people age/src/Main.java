public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25;
        int katyaAge = 27;
        int mishaAge = 35;

        int min = 0, middle = 0, max = 0;


        if (vasyaAge < katyaAge && katyaAge < mishaAge) {
            min = vasyaAge;
            middle = katyaAge;
            max = mishaAge;
        }

        if (vasyaAge < mishaAge && mishaAge < katyaAge) {
            min = vasyaAge;
            middle = mishaAge;
            max = katyaAge;
        }

        if (katyaAge < vasyaAge && vasyaAge < mishaAge) {
            min = katyaAge;
            middle = vasyaAge;
            max = mishaAge;
        }

        if (katyaAge < mishaAge && mishaAge < vasyaAge) {
            min = katyaAge;
            middle = mishaAge;
            max = vasyaAge;

        }

        if (mishaAge < vasyaAge && vasyaAge < katyaAge) {
            min = mishaAge;
            middle = vasyaAge;
            max = katyaAge;
        }

        if (mishaAge < katyaAge && katyaAge < vasyaAge) {
            min = mishaAge;
            middle = katyaAge;
            max = vasyaAge;
        }
        {
            System.out.println("минимальный возраст " + min);
            System.out.println("средний возраст " + middle);
            System.out.println("максимальный возраст " + max);
        }

    }
}
