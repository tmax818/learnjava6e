package ch04.src;

public class Types {
    
    public static void main(String[] args) {
        int primitive_int = 42;
        Integer reference_int = 42;

        long primitive_long = 83247509;
        Long reference_long = 83247509l;

        boolean primitive_bool = true;
        Boolean reference_bool = true;

        double primitive_double = 3.14;
        Double reference_dobule = 3.14;

        char primitive_char = 'a';
        Character reference_char = 'j';


        System.out.printf("A reference_int is %d\n", reference_int.MIN_VALUE);
        System.out.printf("A primitive_int is %d\n", primitive_int);

        System.out.printf("What is stored in %s\n", Integer.toBinaryString((int) primitive_char));
        System.out.printf("%d\n", 0b1100001);
        System.out.printf("%c\n", 97);
        System.out.printf("%c\n", 0b1100001);

    }
}
