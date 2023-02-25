import Homework.JAVA_HW11_OOP.Console.InputRN;
import Homework.JAVA_HW11_OOP.Console.OutputRN;
import Homework.JAVA_HW11_OOP.Console.View;
import Homework.JAVA_HW11_OOP.Model.RN_Calc.RN_Calc;
import Homework.JAVA_HW11_OOP.Presenter.Presenter;

public class Program {

    public static void main(String[] args) {

       Presenter p = new Presenter( new View());

       p.buttonClickRN();
