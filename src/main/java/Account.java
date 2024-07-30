public class Account {

    private final String name;
    int countOfSpace = 0;//задали изначальное количество пробелом как 0 для цикла фор

    public Account(String name) {
        this.name = name;
    }

    /*Этот метод должен проверять, что сохранённая через конструктор строка соответствует требованиям.
          Если строка удовлетворяет условиям, метод возвращает true, иначе — false.*/
    public boolean checkNameToEmboss() {
        for(int i = 0; i < name.length(); i++){ //цикл работает, пока переменная i меньше длины строки
            //условие if работает так - если символ пробела стоит под индексом, номер которого
            //записан в переменную i после очередного перебора символов в строке в цикле for
            //увеличить переменную countOfSpace на 1
            if (name.charAt(i) == ' ') {
                countOfSpace++;
            }
        }
        if(name.length() >= 3 & name.length() <= 19 & !name.startsWith(" ") & !name.endsWith(" ") & countOfSpace == 1 ){
            //если длина входящей строки больше или = 3 и меньше или = 19 и не начинается на пробел
            //и не заканчивается на пробел и имеет 0 или 1 пробел (проверили наличие пробела в цикле for)
            //выдать текст ниже и результат
            System.out.println("Имя подходит");
            return true;
        }
        System.out.println("Имя не подходит");
        return false;
    }
}