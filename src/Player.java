public class Player {
    int number = 0; //в этой перемнной хранится вариант числа

    public void guess() { //метод
        number = (int) (Math.random() * 10); //генерация случайного целого(из-за (int)) числа от 0 до 10 включительно
        System.out.println("Думаю, это число " + number);
    }
}
