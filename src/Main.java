public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println();
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println();
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println();
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        var totalBoxerWeight = boxerWeight1 + boxerWeight2;
        System.out.println();
        System.out.println(totalBoxerWeight);
        var differenceWeightBoxer = boxerWeight2 - boxerWeight1;
        System.out.println(differenceWeightBoxer);

        System.out.println();
        System.out.println(differenceWeightBoxer);
        var differenceWeightBoxerAlternativeVersion = boxerWeight2 % boxerWeight1;
        System.out.println(differenceWeightBoxerAlternativeVersion);

        var totalhours = 640;
        System.out.println();
        var hoursPerWorker = 8;
        var stuff = totalhours / hoursPerWorker;
        System.out.println("Всего работников в компании " + stuff + " человек.");
        var stuff94 = stuff + 94;
        var totalHours94 = stuff94 * hoursPerWorker;
        System.out.println("Если в компании работает " + stuff94 + " человека, то всего " + totalHours94 + " часа может быть поделено между сотрудниками.");

        additionalTask6();
        additionalTask7();
        additionalTask8();
    }
    public static void additionalTask6(){
        byte a = 12;
        byte b = 27;
        byte c = 44;
        byte d = 15;
        byte e = 9;
        int result = -a * (b + (c - d * e));
        System.out.println();
        System.out.println("Здание №6");
        System.out.println(result);


    }
    public static void additionalTask7(){
        int a = 5;
        int b = 7;
        a = a + b;//a=12
        b = a - b;//b=5
        a = a - b;//a=7
        System.out.println();
        System.out.println("Здание №7");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

    }
    public static void additionalTask8(){
        int a = 482;
        int b;
        b=(a/10)%10;
        System.out.println();
        System.out.println("Задание №8");
        System.out.println("b = " + b);



    }


}