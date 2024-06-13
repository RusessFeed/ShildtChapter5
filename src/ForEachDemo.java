public class ForEachDemo {
    public static void main(String[] args) {
        int pepepe[] = {35, 45, 55, 65};
        int sum = 0;

        for (int popopo : pepepe) {
            System.out.println("Массив хранит: " + popopo);
            sum += popopo;
        }
        System.out.println("Сумма = " + sum);


        String[][] stringArrays = {
                {"Zelim", "Ilyas", "Rusya", "Ankalaev"},
                {"Mohammed", "Ahmed", "Evgeniy"}
        };

        for (String[] stringArray : stringArrays) {
            for (String name : stringArray) {
                System.out.println("Имя: " + name);
            }
        }



    }
}



