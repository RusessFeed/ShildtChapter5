public class PersonArray {
    public static void main(String[] args) {
        Person[] persons = new Person[3];

        persons[0] = new Person("Zelim", 2018);
        persons[1] = new Person("Ruslan", 1999);
        persons[2] = new Person("Ilyas", 1995);

        for (int i = 0; i < persons.length; i++) {
            if ((2024 - persons[i].getDenRozhdenki()) < 18) {
                System.out.println("Иди спать!");
            } else {
                System.out.println("Можно пить квас!");
            }
            System.out.println(persons[i].getName());
        }
        persons[0].setName("Evgeni");
        System.out.println(persons[0].getName());
    }
}

class Person {
   private String name;
   private int denRozhdenki;

   String getName() {
       return name;
    }

    int getDenRozhdenki() {
       return denRozhdenki;
    }

    void setName(String name) {
       this.name = name;
    }


    Person(String name, int denRozhdenki ) {
        this.name = name;
        this.denRozhdenki = denRozhdenki;
    }
}