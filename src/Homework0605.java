public class Homework0605 {

    public static void main(String[] args) {
        int number = 18;
        System.out.println(isEven(number)); // возвращает true если переданное число четное, иначе возвращает false
        boolean result = (isEven(number));
        printCheckResultMessage(number, result); // выводит на экран результат четное или нечетное текстовой строкой

        int number1 = 6;
        int number2 = 3;
        System.out.println(isDivisible(number1, number2)); // возвращает true если числа делятся без остатка, иначе возвращает false
        printCheckDivisibleResultMessage(number1, number2); // выводит результат текстовой строкой

        System.out.println("Проверили, делятся ли " + number + " и " + number1 + " на " + number2 + "?\nРезультат работы метода: " + threeDivisible(number, number1, number2) + " \n");
        //вывели результат работы метода threeDivisible - проверка деления первого и второго числа на третье.

        System.out.println("наибольшее из переданных в метод max3 чисел: " + max3(43, 67, 23) + "\n");
        // передали в метод max3 три числа и вывели результат сравнения

        String str1 = "Hello!";
        String str2 = "How are you!";
        String str3 = "Nice to meet you";
        System.out.println("самая длиная строка: " + longestString(str1, str2, str3) + "\n");
        // передали в метод три строки и сравнили их по длинне. Если все равной длинны, то пишем об этом

        System.out.println("сумма чисел без учета числа заканчивающегося на..."+totalsum(10,15,3)+"\n");

        String str4="Long, long time ago..."; //задали строку
        char ch='L'; //задали букву, позицию которой ищем
        System.out.println("Номер буквы, которую ищем: "+findFirstCharIndex(str4,ch)+"\n"); //вернули порядковый номер буквы в строке или -1, если ее нет

        System.out.println("Номер буквы, которую ищем: "+findLastCharIndex(str4,ch)+"\n"); //вернули порядковый номер буквы в строке или -1, если ее нет

        String str5="Предложение для сравнения один";
        String str6="Предложение для сравнения";
        System.out.println("два предложения совпадают с начала на "+uniFirstPrefix(str5,str6)+" символов\n");

        str5="сравниваем фразы с конца";
        str6="еще раз сравниваем фразы с конца";
        System.out.println("два предложения сопадают с конца на "+uniLastPrefix(str5,str6)+" символов\n");

        String str7="Hello";
        skobki(str7);

        String str8="фраза для проверки метода по вырезанию фрагмента";
        System.out.println("Результат метода sbstr: "+sbstr(0,3,str8)+"\n");

        System.out.println(shifrAccountNum("DE5128279087265"));


    }
    /*
    1. Реализовать метод boolean isEven(int number) который возвращает true если переданное
число четное иначе возвращает false. Реализовать метод void printCheckResultMessage(int
number, boolean result) который выводит на экран строку вида «10 это четное число» или
“15 это не четное число»
     */
    public static boolean isEven(int number) {
        return number % 2 == 0; // проверяем четность делением на 2 без остатка и возвращаем true если да.
    }

    public static void printCheckResultMessage(int number, boolean result) {
        if (result) { //передаем в метод переменную result которая содержит результат выполнения метода isEven, если true, то...
            System.out.println(number + " это четное число  \n");
        } else { // иначе (значит нечетные)...
            System.out.println(number + " это нечетное число  \n");
        }
    }

    /*
    2. Реализовать метод boolean isDivisible(int number1, int number2) который возвращает
true если number1 делится на number2 без остатка. Аналогично первой задаче
реализовать метод печати результата.
     */
    public static boolean isDivisible(int number1, int number2) {
        return number1 % number2 == 0; // проверяем делятся ли переданные числа без остатка и возвращаем true если да.
    }

    public static void printCheckDivisibleResultMessage(int number1, int number2) {
        if (isDivisible(number1, number2)) { // здесь не передаем результат выполнение метода isDivisible через переменную, а вызываем метод сразу из условия
            System.out.println(number1 + " делится на " + number2 + " без остатка  \n");
        } else {
            System.out.println(number1 + " НЕ делится на " + number2 + " без остатка  \n");
        }
    }

    /*
    3. Реализовать метод, который в качестве параметров получает 3 числа типа инт. Метод
должен возвращать true если и первое и второе число делятся без остатка на третье.
     */

    public static boolean threeDivisible(int number, int number1, int number2) {
        return ((number % number2 == 0) & (number1 % number2 == 0)); //проверяем два условия оператором AND
        // делится ли число1 на число3 без остатка и делится ли число2 на число3 без остатка. Если оба условие соблюдены, то true
    }

    /*
    4. Реализовать метод int max3(int num1, int num2, int num3) который возвращает число, наибольшее из трех
    переданных чисел: Например: max3(10,19,0) -> 19
     */
    public static int max3(int num1, int num2, int num3) {
        int bigfirst = (num1 > num2) ? num1 : num2; //выбираем наибольшее из первых двух чисел и записываем в переменную bigfirst
        return (bigfirst > num3) ? bigfirst : num3; //сравниваем bigfirst с третьим числом и возвращаем наибольшее
        // idea предлагает использовать метод math.max, который сравнивает два числа сразу - это было бы проще, но оставляю
        // так как есть, чтобы было видно логику сравнения
        // !NB не делаем проверку на то, равны числа друг другу или нет
    }

    /*
    5. Реализовать метод String longestString (String str1, String str2, String str2) который
возвращает самую длинную строку из трех заданных строк:
Подсказка: Используйте метод, написанный в пункте 4
Например: longestString (“java”,”welcome”,”hello”) -> “welcome”
     */
    public static String longestString(String str1, String str2, String str3) {
        if ((str1.length() == str2.length()) & (str1.length() == str3.length()) & (str2.length() == str3.length())) {
            return "Все строки равны по длинне \n";
            // Тут проверяем и если все строки равной длинны (нет самой длинной), то выводим уведомление
        } else {
            String longeststr = (str1.length() > str2.length()) ? str1 : str2;
            return (longeststr.length() > str3.length()) ? longeststr : str3;
            // здесь сравниваем длинну строк и возвращаем самую длинную
        }
    }

    /*
    6. Реализовать метод, который печатает все числа в диапазоне от 0 до 100, которые не
делятся на 4
     */

    public static void allNotDivisibleBy4() {
        for (int i = 0; i <= 100; i++) {
            if (i % 4 != 0) { // проверяем, делится число на четыре или нет, если нет, то печатаем
                System.out.println(i);
            }
        }
    }

    /*
   8. Реализовать метод, который принимает 3 параметра start, finish, digit типа int. digit
находится в диапазоне (0<=digit<9), если нет, то считаем digit=0. Метод должен вернуть
сумму всех чисел от start до finish исключая те числа, которые заканчиваются на digit.
Например: sum(10,15,3) -> 62 (в данном случае, в сумму входят числа 10,11,12,14 и15.
Число 13 не входит.
     */
    public static int totalsum(int start, int finish, int digit) {
        if ((digit <= 0) | (digit > 9)) { // проверяем, находится ли digit в нужном интервале - иначе даем значение 0
            digit = 0;
        }
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = ((i - digit) % 10 == 0) ? sum : (sum + i);
        }
        // если число i кончается на цифру digit (i минус digit делится на 10 без остатка) то sum остается равным себе,
        // если остаток есть (то есть число i не заканчивается на digit), то к sum прибавляем число i
        return sum;
    }

    /*
    9. Реализовать метод, который int findFirstCharIndex(String str, char ch) который возвращает
позицию первого вхождения (индекс) символа ch в строке str. Если символа в строке нет,
возвращаем -1.
Например: find(“let’s talk about java”,’t’) -> 2
     */
    public static int findFirstCharIndex(String str4, char ch) {
        int i = str4.length(); //возвращает длинну строки
        int result = -1; //задаем исходное значение результата поиска (буква не найдена)
        for (int j = 0; j < i; j++) { //берем каждое значение с 0 позиции до конца строки
            if (str4.charAt(j) == ch) { //проверяем на совпадение с заданной буквой
                result = j; // если совпало, присваиваем порядковый номер буквы результату (начиная с 0, а не с 1)
                break; // заканчиваем цикл, чтобы не брать значения дальше
            }
        }
        return result; // возвращаем результат (если не нашли, то осталось исходное -1)
    }

    /*
    10. Реализовать метод, который int findLastCharIndex(String str, char ch) который возвращает
позицию последнего вхождения (индекс) символа ch в строке str. Если символа в строке
нет, возвращаем -1.
     */
    public static int findLastCharIndex(String str4, char ch) {
        int i = str4.length(); //возвращает длинну строки
        int result = -1; //задаем исходное значение результата поиска (буква не найдена)
        for (int j = (i-1); j >= 0; j--) { //берем каждое значение с конца строки (-1, т.к. с 0 начали) и до 0 позиции
            if (str4.charAt(j) == ch) { //проверяем на совпадение с заданной буквой
                result = (i-j-1); // если совпало, присваиваем порядковый номер буквы результату (начиная с 0, а не с 1)
                // вычитаем из общей длинны строки порядковый номер и еще -1, чтобы получить порядковый номер с конца
                break; // заканчиваем цикл, чтобы не брать значения дальше
            }
        }
        return result; // возвращаем результат (если не нашли, то осталось исходное -1)
    }

    /*
    11. Реализовать метод, который возвращает длину общего префикса двух строк, т.е. сколько
символов начиная с начала одинаковые у обеих строк.
     */

    public static int uniFirstPrefix (String str5,String str6) {
        int i = (str5.length()>str6.length())?str6.length():str5.length(); //выбираем более короткую строку, чтобы избежать ошибки
        int result = 0;
        for (int j = 0; j < i; j++) {
            if (str5.charAt(j)==str6.charAt(j)){ //сравниваем посимвольно
                result=result+1; //каждое совпадение записываем в результат
            } else {
                break; //как только совпадения нет - выходим из цикла и возвращаем результат
            }
        }
        return result;
    }

    /*
    12. Реализовать метод, который возвращает длину общего постфикса двух строк, т.е. сколько
символов начиная с конца одинаковые у обеих строк.
     */
    public static int uniLastPrefix(String str5, String str6) {
        int result = 0;
        String strlong;
        String strshort;
        if (str5.length() >= str6.length()) { //сравниваем строки по длинне и определяем одну короткой, другую длинной
            strlong = str5;
            strshort = str6;
        } else {
            strlong = str6;
            strshort = str5;
        }
        int dldlinnoystoki = (strlong.length() - 1);
        for (int j = (strshort.length() - 1); j >= 0; j--) { //берем длинну более короткой строки и начинаем с ее конца
            if (strlong.charAt(dldlinnoystoki) == strshort.charAt(j)) { //сравниваем посимвольно но с разных длинн - длинна короткой уменьшается циклом
                result++; //каждое совпадение записываем в результат
                dldlinnoystoki--; //убавляем значение длины длинной строки (т.к. в цикле она не уменьшается)
            } else {
                break; //как только совпадения нет - выходим из цикла и возвращаем результат
            }
        }
        return result;
    }

    /*
    13. Реализовать метод, который печатает заданную строку, при этом каждый символ печатается
в [] Например: “Hello” -> [H][e][l][l][o]
     */
    public static void skobki (String str7){
        String result ="";
        for (int i = 0; i < str7.length(); i++) {
            result="["+str7.charAt(i)+"]"; //добавляем в скобки каждую букву
            System.out.print(result); // выводим в строку
        }
        System.out.println("\n");
    }

    /*
    14. Реализовать метод, который возвращает часть заданной строки, начиная с позиции start,
заканчивая позицией finish. (разбирали в классе, но можно реализовать самостоятельно).
Например: substring(“let’s talk about java”, 7,20) -> “talk about ja”
     */

    public static String sbstr (int start, int finish, String str8) {
        String result ="";
        for (int i = start; i < finish; i++) {
            result=result+str8.charAt(i);
        }
        return result;
    }

    /*
    15. Представьте, что вы пишите банковскую программу. Вам нужно реализовать метод,
который вместо заданной строки с номером счета (например ”DE5128279087265”)
возвращает строку вида ”DE51*********65” (количество звездочек соответствует количеству
засекреченных цифр)
     */
    public static String shifrAccountNum(String accnum) {
        String result = "";
        if (accnum.length() == 15) { //проверяем длинну параметра, если неверная, то выдаем ошибку
            char newlet = '*'; // задаем значок замены символа
            for (int i = 0; i <= 14; i++) { //запускаем цикл
                if (i >= 4 & i < 13) { //в цикле задаем условие: буквы диапазоне от 5 до 12
                    result = result + newlet; //меняем на значок замены
                } else {
                    result = result + accnum.charAt(i); //вне диапазоне оставляем как есть
                }
            }
        } else {
            result = "Неверный формат числа";
        }
        return result;
    }


}
