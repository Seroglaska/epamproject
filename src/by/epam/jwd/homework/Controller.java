package by.epam.jwd.homework;


public class Controller {
    Input input = new Input();
    Logic logic = new Logic();
    View view = new View();
    public void Task1(){
        int a = input.NumberTask1();
        boolean b = logic.LogicTask1(a);
        view.OutPutTask1(b);
    }
    public void Task2(){
        double [] Array = input.NumbersTask2();
        double d = logic.LogicTask2(Array);
        view.OutPutTask2(d);
    }

    public void Task3(){
        double [] Array = input.NumbersTask3();
        double [] a = logic.LogicTask3(Array);
        view.OutPutTask3(a);
    }
    public void Task4(){
        int [] Array = input.NumbersTask4();
        boolean a = logic.LogicTask4(Array);
        view.OutPutTask4(a);
    }
}
