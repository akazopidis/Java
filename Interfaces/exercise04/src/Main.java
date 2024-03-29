class Main {

    public static void main(String[] args) {
        Food[] array = new Food[5];

        array[0] = new Snack("sna1", 150);
        array[1] = new Snack("sna1", 150);
        array[2] = new TropicalFruit("fru1",500,"ty1");
        array[3] = new TropicalFruit("fru2",1500,"ty2");
        array[4] = new Snack("sna3", 1050);

        double sum = 0.0;
        for (var x: array) {
            sum += x.eat();
        }
        System.out.println("Total calories: " +  sum);
        System.out.println("===================");

        StandardMethods i = array[2];
        i.print();
        i = array[4];
        i.print();

        DoubleAdjustments d = array[4];
        d.doubleEverything();
        array[4].print();

        System.out.println("===================");
        System.out.println(array[0]==array[1]);
        System.out.println(array[0].equals(array[1]));

        Object o;
        o = array[1];
        System.out.println(array[0].equals(o));
    }
}
