package hw2;

/* Задание:
1. Проанализировать код программы.
2. Запустить ее и посмотреть какое значение принимает переменная c.
3. Добавить !или изменить текушие! "кастинги" (операции по преобразованию типа) в коде программы таким образом, чтобы
переменная c приняла знвчение 256
4. Запустить программу, посмотреть результат. Если результат неверный - вернутся к п.1. Если все верно - написать
комментарий к программе и обьяснить почему до подстановки переменная с принимала иное значение.
*/
public class TaskSeven {
    public static void main(String[] args) {
        int a = (byte)44;
        int b = (byte)300;
        short c = (byte)(b - a);
        System.out.println(c);
    }
}