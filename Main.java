import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!"); // Пункт 1
        int varint_1=7;
        System.out.println("Значение целочисленной переменной varint_1 - " + varint_1); //Пункт 2
        varint_1++;
        System.out.println("Увеличение целочисленной переменной varint_1 1-м способом - " + varint_1); //Пункт 3_1
        ++varint_1;
        System.out.println("Увеличение целочисленной переменной varint_1 2-м способом - " + varint_1); //Пункт 3_2
        int a,b,tmp;
        a=10;
        b=5;
        tmp = a;
        a = b;
        b = tmp;
        System.out.println("Значения переменных: а=10 b=5. После перемены значений переменных 1-м способом: а=" + a + " b=" + b); //Пункт 4_1
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Значения переменных: а=5 b=10. После перемены значений переменных 2-м способом: а=" + a + " b=" + b); //Пункт 4_2
        a=3;
        b=4;
        System.out.println("Значения катетов: а=3 b=4. Гипотенуза: " + Math.sqrt(Math.pow(a,2) + Math.pow(b,2))); //Пункт 5
        System.out.println("Число: 11 Последняя цифра: " + ++tmp%10); //Пункт 6
        tmp=123456;
        System.out.println("Число: 123456 Число десятков: " +(tmp- tmp%10)/10%10); //Пункт 7
        tmp=12;
        System.out.println("Число: 12 Число десятков: " +(tmp- tmp%10)/10); //Пункт 8
        System.out.println("Число: 12 Разница с 21: " +(diff21(tmp))); //Пункт 9
        System.out.println("Число: -21 Разница с 21: " +(diff21(-21))); //Пункт 9
        System.out.println("Число: 22 Разница с 21: " +(diff21(22))); //Пункт 9
        System.out.println("Число: 0 Разница с 21: " +(diff21(0))); //Пункт 9
        System.out.println("Число1: 10 Число2: 5 Среднее арифметическое: " +(avg(10,5))); //Пункт 9
        System.out.println("Число1: 10 Число2: 5 Среднее геометрическое: " +(geometric_avg(10,5))); //Пункт 10
        System.out.println("Точка1: (0,1) Точка2: (4,4) Расстояние: " +(length_vector(0,1,4,4))); //Пункт 10

    }
    public static int diff21(int number){
        return 21-number;
    }
    public static double avg(int n1, int n2){
        return (double)(n1+n2)/2;
    }

    public static double geometric_avg(int n1, int n2) {
        double GM_log = 0.0d;
        if (n1 == 0L) {
                return 0.0d;
            }
        if (n2 == 0L) {
                return 0.0d;
            }
        GM_log = Math.log(n1)+Math.log(n2);
        return (double) Math.exp(GM_log / 2);
    }
    public static double length_vector(int n1, int n2,int m1, int m2){
        return (double) Math.sqrt(Math.pow(n1-m1,2)+Math.pow(n2-m2,2));
    }

}