public class GuessGame {
    Player p1; //объявление переменных экземпляра
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player(); //присваивание объекта переменным экземпляра
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0; //переменная со значением 0
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false; //переменная со значением false
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10); //генерация случайного целого числа от 0 до 10 включительно
        System.out.println("Я загадываю число от 0 до 9...");
        while (true) { //цикл, который будет работать пока не выполнится условие
            System.out.println("Число, которое нужно угадать - " + targetNumber);
            System.out.println(" ");
            p1.guess(); //метод
            p2.guess();
            p3.guess();
            System.out.println(" ");
            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " + guessp1);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это " + guessp2);

            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " + guessp3);
            System.out.println(" ");
            if (guessp1 == targetNumber) { //условие такое, что ответ игрока должен быть равен сгенерированному числу
                p1isRight = true; //если условие выполняется, то игрок прав
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) { //условие такое, что либо 1 либо 2 либо 3 игрок должен быть прав
                System.out.println("У нас есть победитель!");
                System.out.println(" ");
                System.out.println("Первый игрок угадал?" + p1isRight);
                System.out.println("Второй игрок угадал?" + p2isRight);
                System.out.println("третий игрок угадал?" + p3isRight);
                System.out.println(" ");
                System.out.println("Конец игры.");
                break; //если условие выполняется, то здесь программа останавливается
            } else { //если условие не выполняется, то цикл начинается сначала
                System.out.println("Попробуйте еще раз.");
                System.out.println(" ");
            }
        }
    }
}
