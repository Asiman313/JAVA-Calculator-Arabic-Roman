
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Добро пожаловать в калькулятор Асимана Гулиева");
        System.out.println();
        System.out.println("Обрати внимание, что данный калькулятор может работать только с числами от 1 до 10 (как с арабскими так и с римскими)");
        System.out.println();
        System.out.println("Можешь ввести операцию:");

        calc();

    }
    static void calc(){
        String resr = "";
        int res = 0;
        int x = 0;
        int y = 0;
        String a_t = "0";
        String b_t = "0";
        String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] numr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

        Scanner console = new Scanner(System.in);
        String a = console.nextLine();
        String[] aa = a.split(" ");


        for (int i = 0; i < 10; i++) {
            if (num[i].intern() == aa[0].intern()) {
                a_t = "num";
            }
        }
        for (int j = 0; j < 10; j++) {
            if (numr[j].intern() == aa[0].intern()) {
                a_t = "numr";
            }
        }
        for (int k = 0; k < 10; k++) {
            if (num[k] == aa[2].intern()) {
                b_t = "num";
            }
        }
        for (int h = 0; h < 10; h++) {
            if (numr[h].intern() == aa[2].intern()) {
                b_t = "numr";
            }
        }
        if (aa[1].intern() != "+" && aa[1].intern() != "/" && aa[1].intern() != "*" && aa[1].intern() != "-") {
            System.out.println("Неизвестная операция. Калькулятор работает только с операциями   +, /, *, -");
        }
        if (b_t.intern() != a_t) {
            System.out.println("Ой! Произошла ошибка. Нужно выбрать с какими цифрами работаем (с арабскими или римскими). Цифры должны быть целыми в интервале от единицы до десяти :)");
        }
        if (aa.length != 3) {
            System.out.println("Введено более двух операндов");
        }
        if ((a_t.intern() != "num" && a_t.intern() != "numr") || (b_t.intern() != "num" && b_t.intern() != "numr")) {
            System.out.println("Должны быть введены целые арабские или римские цифры от 1 до 10");
        }
        if (aa.length == 3) {
            if (b_t.intern() == a_t) {
                if (aa[1].intern() == "+" || aa[1].intern() == "/" || aa[1].intern() == "*" || aa[1].intern() == "-") {
                    if (b_t.intern() == "num") {
                        switch (aa[0]) {
                            case "1":
                                x = 1;
                                break;
                            case "2":
                                x = 2;
                                break;
                            case "3":
                                x = 3;
                                break;
                            case "4":
                                x = 4;
                                break;
                            case "5":
                                x = 5;
                                break;
                            case "6":
                                x = 6;
                                break;
                            case "7":
                                x = 7;
                                break;
                            case "8":
                                x = 8;
                                break;
                            case "9":
                                x = 9;
                                break;
                            case "10":
                                x = 10;
                                break;
                        }
                        switch (aa[2]) {
                            case "1":
                                y = 1;
                                break;
                            case "2":
                                y = 2;
                                break;
                            case "3":
                                y = 3;
                                break;
                            case "4":
                                y = 4;
                                break;
                            case "5":
                                y = 5;
                                break;
                            case "6":
                                y = 6;
                                break;
                            case "7":
                                y = 7;
                                break;
                            case "8":
                                y = 8;
                                break;
                            case "9":
                                y = 9;
                                break;
                            case "10":
                                y = 10;
                                break;
                        }
                        switch (aa[1]) {
                            case "+":
                                res = x + y;
                                System.out.println("Вот что получилось: " + a + " = " + res);
                                break;
                        }
                        switch (aa[1]) {
                            case "-":
                                res = x - y;
                                System.out.println("Вот что получилось: " + a + " = " + res);
                                break;
                        }
                        switch (aa[1]) {
                            case "/":
                                res = x / y;
                                System.out.println("Вот что получилось: " + a + " = " + res);
                                break;
                        }
                        switch (aa[1]) {
                            case "*":
                                res = x * y;
                                System.out.println("Вот что получилось: " + a + " = " + res);
                                break;
                        }
                    }
                    if (b_t.intern() == "numr") {
                        switch (aa[0]) {
                            case "I":
                                x = 1;
                                break;
                            case "II":
                                x = 2;
                                break;
                            case "III":
                                x = 3;
                                break;
                            case "IV":
                                x = 4;
                                break;
                            case "V":
                                x = 5;
                                break;
                            case "VI":
                                x = 6;
                                break;
                            case "VII":
                                x = 7;
                                break;
                            case "VIII":
                                x = 8;
                                break;
                            case "IX":
                                x = 9;
                                break;
                            case "X":
                                x = 10;
                                break;
                        }
                        switch (aa[2]) {
                            case "I":
                                y = 1;
                                break;
                            case "II":
                                y = 2;
                                break;
                            case "III":
                                y = 3;
                                break;
                            case "IV":
                                y = 4;
                                break;
                            case "V":
                                y = 5;
                                break;
                            case "VI":
                                y = 6;
                                break;
                            case "VII":
                                y = 7;
                                break;
                            case "VIII":
                                y = 8;
                                break;
                            case "IX":
                                y = 9;
                                break;
                            case "X":
                                y = 10;
                                break;
                        }
                        switch (aa[1]) {
                            case "+":
                                res = x + y;
                                switch (res) {
                                    case 2:
                                        resr = "II";
                                        break;
                                    case 3:
                                        resr = "III";
                                        break;
                                    case 4:
                                        resr = "IV";
                                        break;
                                    case 5:
                                        resr = "V";
                                        break;
                                    case 6:
                                        resr = "VI";
                                        break;
                                    case 7:
                                        resr = "VII";
                                        break;
                                    case 8:
                                        resr = "VIII";
                                        break;
                                    case 9:
                                        resr = "IX";
                                        break;
                                    case 10:
                                        resr = "X";
                                        break;
                                    case 11:
                                        resr = "XI";
                                        break;
                                    case 12:
                                        resr = "XII";
                                        break;
                                    case 13:
                                        resr = "XIII";
                                        break;
                                    case 14:
                                        resr = "XIV";
                                        break;
                                    case 15:
                                        resr = "XV";
                                        break;
                                    case 16:
                                        resr = "XVI";
                                        break;
                                    case 17:
                                        resr = "XVII";
                                        break;
                                    case 18:
                                        resr = "XVIII";
                                        break;
                                    case 19:
                                        resr = "XIX";
                                        break;
                                    case 20:
                                        resr = "XX";
                                        break;
                                }
                                System.out.println("Вот что получилось: " + a + " = " + resr);
                                break;
                            case "-":
                                res = x - y;
                                switch (res) {
                                    case 0:
                                        System.out.println("Не бывает римской цифры '0'");
                                        break;
                                    case 1:
                                        resr = "I";
                                        break;
                                    case 2:
                                        resr = "II";
                                        break;
                                    case 3:
                                        resr = "III";
                                        break;
                                    case 4:
                                        resr = "IV";
                                        break;
                                    case 5:
                                        resr = "V";
                                        break;
                                    case 6:
                                        resr = "VI";
                                        break;
                                    case 7:
                                        resr = "VII";
                                        break;
                                    case 8:
                                        resr = "VIII";
                                        break;
                                    case 9:
                                        resr = "IX";
                                        break;
                                }
                                if (resr.intern() == ""){
                                    System.out.println("Число должно быть положительным");
                                    break;
                                }
                                System.out.println("Вот что получилось: " + a + " = " + resr);
                                break;
                            case "/":
                                res = x / y;
                                switch (res) {
                                    case 1:
                                        resr = "I";
                                        break;
                                    case 2:
                                        resr = "II";
                                        break;
                                    case 3:
                                        resr = "III";
                                        break;
                                    case 4:
                                        resr = "IV";
                                        break;
                                    case 5:
                                        resr = "V";
                                        break;
                                    case 6:
                                        resr = "VI";
                                        break;
                                    case 7:
                                        resr = "VII";
                                        break;
                                    case 8:
                                        resr = "VIII";
                                        break;
                                    case 9:
                                        resr = "IX";
                                        break;
                                    case 10:
                                        resr = "X";
                                        break;
                                }
                                if (resr.intern() == ""){
                                    System.out.println("Число должно быть положительным");
                                    break;
                                }
                                System.out.println("Вот что получилось: " + a + " = " + resr);
                                break;
                            case "*":
                                res = x * y;
                                switch (res) {
                                    case 1:
                                        resr = "I";
                                        break;
                                    case 2:
                                        resr = "II";
                                        break;
                                    case 3:
                                        resr = "III";
                                        break;
                                    case 4:
                                        resr = "IV";
                                        break;
                                    case 5:
                                        resr = "V";
                                        break;
                                    case 6:
                                        resr = "VI";
                                        break;
                                    case 7:
                                        resr = "VII";
                                        break;
                                    case 8:
                                        resr = "VIII";
                                        break;
                                    case 9:
                                        resr = "IX";
                                        break;
                                    case 10:
                                        resr = "X";
                                        break;
                                    case 11:
                                        resr = "XI";
                                        break;
                                    case 12:
                                        resr = "XII";
                                        break;
                                    case 13:
                                        resr = "XIII";
                                        break;
                                    case 14:
                                        resr = "XIV";
                                        break;
                                    case 15:
                                        resr = "XV";
                                        break;
                                    case 16:
                                        resr = "XVI";
                                        break;
                                    case 17:
                                        resr = "XVII";
                                        break;
                                    case 18:
                                        resr = "XVIII";
                                        break;
                                    case 19:
                                        resr = "XIX";
                                        break;
                                    case 20:
                                        resr = "XX";
                                        break;
                                    case 21:
                                        resr = "XXI";
                                        break;
                                    case 22:
                                        resr = "XXII";
                                        break;
                                    case 23:
                                        resr = "XXIII";
                                        break;
                                    case 24:
                                        resr = "XXIV";
                                        break;
                                    case 25:
                                        resr = "XXV";
                                        break;
                                    case 26:
                                        resr = "XXVI";
                                        break;
                                    case 27:
                                        resr = "XXVII";
                                        break;
                                    case 28:
                                        resr = "XXVIII";
                                        break;
                                    case 29:
                                        resr = "XXIX";
                                        break;
                                    case 30:
                                        resr = "XXX";
                                        break;
                                    case 31:
                                        resr = "XXXI";
                                        break;
                                    case 32:
                                        resr = "XXXII";
                                        break;
                                    case 33:
                                        resr = "XXXIII";
                                        break;
                                    case 34:
                                        resr = "XXXIV";
                                        break;
                                    case 35:
                                        resr = "XXXV";
                                        break;
                                    case 36:
                                        resr = "XXXVI";
                                        break;
                                    case 37:
                                        resr = "XXXVII";
                                        break;
                                    case 38:
                                        resr = "XXXVIII";
                                        break;
                                    case 39:
                                        resr = "XXXIX";
                                        break;
                                    case 40:
                                        resr = "XL";
                                        break;
                                    case 41:
                                        resr = "XLI";
                                        break;
                                    case 42:
                                        resr = "XLII";
                                        break;
                                    case 43:
                                        resr = "XLIII";
                                        break;
                                    case 44:
                                        resr = "XLIV";
                                        break;
                                    case 45:
                                        resr = "XLV";
                                        break;
                                    case 46:
                                        resr = "XLVI";
                                        break;
                                    case 47:
                                        resr = "XLVII";
                                        break;
                                    case 48:
                                        resr = "XLVIII";
                                        break;
                                    case 49:
                                        resr = "XLIX";
                                        break;
                                    case 50:
                                        resr = "L";
                                        break;
                                    case 51:
                                        resr = "LI";
                                        break;
                                    case 52:
                                        resr = "LII";
                                        break;
                                    case 53:
                                        resr = "LIII";
                                        break;
                                    case 54:
                                        resr = "LV";
                                        break;
                                    case 55:
                                        resr = "LV";
                                        break;
                                    case 56:
                                        resr = "LVI";
                                        break;
                                    case 57:
                                        resr = "LVII";
                                        break;
                                    case 58:
                                        resr = "LVIII";
                                        break;
                                    case 59:
                                        resr = "LIX";
                                        break;
                                    case 60:
                                        resr = "LX";
                                        break;
                                    case 61:
                                        resr = "LXI";
                                        break;
                                    case 62:
                                        resr = "LXII";
                                        break;
                                    case 63:
                                        resr = "LXIII";
                                        break;
                                    case 64:
                                        resr = "LXIV";
                                        break;
                                    case 65:
                                        resr = "LXV";
                                        break;
                                    case 66:
                                        resr = "LXVI";
                                        break;
                                    case 67:
                                        resr = "LXVII";
                                        break;
                                    case 68:
                                        resr = "LXVIII";
                                        break;
                                    case 69:
                                        resr = "LXIX";
                                        break;
                                    case 70:
                                        resr = "LXX";
                                        break;
                                    case 71:
                                        resr = "LXXI";
                                        break;
                                    case 72:
                                        resr = "LXXII";
                                        break;
                                    case 73:
                                        resr = "LXXIII";
                                        break;
                                    case 74:
                                        resr = "LXXIV";
                                        break;
                                    case 75:
                                        resr = "LXXV";
                                        break;
                                    case 76:
                                        resr = "LXXVI";
                                        break;
                                    case 77:
                                        resr = "LXXVII";
                                        break;
                                    case 78:
                                        resr = "LXXVIII";
                                        break;
                                    case 79:
                                        resr = "LXXIX";
                                        break;
                                    case 80:
                                        resr = "LXXX";
                                        break;
                                    case 81:
                                        resr = "LXXXI";
                                        break;
                                    case 82:
                                        resr = "LXXXII";
                                        break;
                                    case 83:
                                        resr = "LXXXIII";
                                        break;
                                    case 84:
                                        resr = "LXXXIV";
                                        break;
                                    case 85:
                                        resr = "LXXXV";
                                        break;
                                    case 86:
                                        resr = "LXXXVI";
                                        break;
                                    case 87:
                                        resr = "LXXXVII";
                                        break;
                                    case 88:
                                        resr = "LXXXVIII";
                                        break;
                                    case 89:
                                        resr = "LXXXIX";
                                        break;
                                    case 90:
                                        resr = "XC";
                                        break;
                                    case 91:
                                        resr = "XCI";
                                        break;
                                    case 92:
                                        resr = "XCII";
                                        break;
                                    case 93:
                                        resr = "XCIII";
                                        break;
                                    case 94:
                                        resr = "XCIV";
                                        break;
                                    case 95:
                                        resr = "XCV";
                                        break;
                                    case 96:
                                        resr = "XCVI";
                                        break;
                                    case 97:
                                        resr = "XCVII";
                                        break;
                                    case 98:
                                        resr = "XCVIII";
                                        break;
                                    case 99:
                                        resr = "XCIX";
                                        break;
                                    case 100:
                                        resr = "C";
                                        break;
                                }
                                System.out.println("Вот что получилось: " + a + " = " + resr);
                                break;
                        }
                    }


                }
            }
        }
    }
}