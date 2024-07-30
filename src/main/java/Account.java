import java.util.Objects;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    /*Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
          Если строка удовлетворяет условиям, метод возвращает true, иначе — false.*/
    //private int countOfSpace = 0;//задали изначальное количество пробелом как 0 для цикла фор
    public boolean checkNameToEmboss() {
//        for(int i = 0; i < name.length(); i++){
//            if (name.charAt(i) == ' ') {
//                countOfSpace++;
//                //цикл работает, пока переменная i меньше длины строки
//                //условие if - если символ пробела стоит под индексом, номер которого
//                //записан в переменную i после очередного перебора символов в строке в цикле for увеличить переменную countOfSpace на 1
//            }
//        }
        if (name.length() >= 3 && name.length() <= 19 && !name.startsWith(" ") && !name.endsWith(" ")) {
            String[] split = name.split(" ");//в массиве переменной split разделенные пробелом строки//проходимся по каждому индексу массива переменной split "Тимоти" и "Шаламе"
                if(split.length == 2){
                    System.out.println("Имя подходит");
                    return true;
            }
        }
        System.out.println("Имя не подходит");
        return false;
    }
}