public class Main {
    public static void main(String[] args) {
        String nameOfMyCountry = "Bishkek7";
        final int NUM = 7;
        String word = "Bishkek";
        System.out.println(word + NUM);
        System.out.println(nameOfMyCountry +" " + NUM + " " + word);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        }
        if ( NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else{
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Введите ваше имя" + ':');


    }
}