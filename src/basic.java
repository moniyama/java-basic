//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class basic {
        public static void main(String[] args) {
            String name = "Moni";
            System.out.println("Hello and wel1come " + name);

            // types int, byt, float, double (mais preciso que float)
            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

            System.out.println("Max value " + max);
            System.out.println("Min value " + min);

            byte maxByte = Byte.MAX_VALUE;
            byte minByte = Byte.MIN_VALUE;

            System.out.println("maxByte value " + maxByte);
            System.out.println("minByte value " + minByte);

            long maxLong = Long.MAX_VALUE;
            long minLong = Long.MIN_VALUE;

            System.out.println("maxLong value " + maxLong);
            System.out.println("minLong value " + minLong);

            float maxFloat = Float.MAX_VALUE;
            float minFloat = Float.MIN_VALUE;

            System.out.println("maxFloat value " + maxFloat);
            System.out.println("minFloat value " + minFloat);

            double maxDouble = Double.MAX_VALUE;
            double minDouble = Double.MIN_VALUE;

            System.out.println("maxDouble value " + maxDouble);
            System.out.println("minDouble value " + minDouble);

            char letra = 'a';

            //operators - careful with types
            int num = 1;

            // compare == != && e ||

            System.out.println(num++); // post - print depois add
            System.out.println(++num); // pre - add e depois print

            // switch case normal, mas pode ser com arrow
//         switch (time) {
//            case 10 -> System.out.println("a");
//            case 7 -> { System.out.println("b") }; more code lines
//        }
        }
}

// Diagrama de classes
// - private -> cada objeto/instancia tem a sua propria
// + public -> acessivel em qualquer instancia
// # protected
// italico abstrato
// underline static -> existe sem necessidade da criacao de objeto (nova instancia)

// <<>> abstrat ou interface
