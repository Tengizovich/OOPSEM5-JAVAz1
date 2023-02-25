import java.io.IOException;
import java.util.logging.FileHandler;

import Homework.JAVA_OOP.Console.View;
import Homework.JAVA_OOP.Model.Logger.LoggerMP;
import Homework.JAVA_OOP.Model.Method.CalcModel;
import Homework.JAVA_OOP.Model.RN_Calc.RN_Calc;

public class Presenter {
    View view; // Метод взаимодействия с интерфейсом, консолью ввода.

    RN_Calc model = new RN_Calc(); // Модель выполнения математической операции.

    Integer[] res; // Результат расчёта

    View m = new View(); // Описание меню

    LoggerMP log = new LoggerMP();

    // public Presenter(CalcModel calc, View v) {
    //     this.model = calc;
    //     this.view = v;
    // }

    public Presenter( View v) {

        this.view = v;
    }

    public void buttonClickRN() {
        while (true) {
            switch (m.MenuRN()) {
                case 1:// Операция сложения
                    log.setLogger("Выбрана операция сложения");
                    Data();
                    res = model.getSum();
                    showData(res);
                    break;
                case 2:// Операция вычитания
                    log.setLogger("Выбрана операция вычитания");
                    Data();
                    res = model.getSub();
                    showData(res);
                    break;
                case 3:// Произведение
                    log.setLogger("Выбрана операция умножения");
                    Data();
                    res = model.getMult();
                    showData(res);
                    break;
                case 4:// Деление
                    log.setLogger("Выбрана операция деления");
                    Data();
                    res = model.getDiv();
                    showData(res);
                    break;
                case 0: // Выход из программы
                    log.setLogger("Выход из программы");
                    return;
            }

        }

    }

   

    public void Data() {
        System.out.println("Рациональные числа вводятся: a m/n, m/n, a.\n"
        +"Где a - целое число, m - числитель, n- знаменатель.");
        String xStr = view.getValueStr("Введите 1-е число: ");
        String yStr = view.getValueStr("Введите 2-е число: ");
        Integer[] xRN = view.getValueRN(xStr);
        model.setX(xRN);
        Integer[] yRN = view.getValueRN(yStr);
        model.setY(yRN);
        System.out.println();
        log.setLogger("Пользователь ввёл 1-число: "+ xStr);
        log.setLogger("Пользователь ввёл 2-число: "+ yStr);
        
        
    }

    public void showData(Integer[] res) {
        String data = view.showRN(res, "Ответ = ");
        log.setLogger("Ответ "+ data);
        System.out.println();
    }

}
