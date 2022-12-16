public class Main {
    public static void main(String[] args) {
        String twoWord;
        final int NUM = 89;
        String word = "notebook";
        twoWord = NUM + word;
        System.out.println(twoWord);
        if (NUM < 0 ){
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Dы сохранили положитедьное число");
        }else {
            System.out.println("Вы сохранили ноль");
        }

    }
}