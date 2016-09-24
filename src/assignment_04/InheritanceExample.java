package assignment_04;

public class InheritanceExample {

    public static void main(String[] args) {

        first a = new first();
        second b = new second();

        a.one = "Hello ";
        a.two = "world.";
        a.add();

        b.one = "My name ";
        b.two = "is ";
        b.three = "Oushneek";
        b.add();
        b.addagain();
    }
}

class first {

    String one, two, result1;

    public void add() {
        result1 = one.concat(two);
        System.out.println("' class 1 ' Result 1 : " + result1);
    }
}

class second extends first {

    String three, result2;

    public void addagain() {
        System.out.println("' class 2 ' Result 1 : " + result1);

        result2 = result1.concat(three);
        System.out.println("' class 2 ' Result 2 : " + result2);
    }
}
