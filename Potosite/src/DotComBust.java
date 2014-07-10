/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y.voytovich
 */
import com.sun.org.apache.bcel.internal.generic.CHECKCAST;
import java.util.*;
public class DotComBust {
    //Объявляем ссылку helper типа GameHelper(от класса GameHelper)и создаем объект GameHelper 
    //Здесь будем хранить данные от пользователя
    private GameHelper helper = new GameHelper();
    //Объявляем ArrayList dotComList будем хранить сайты
    private ArrayList<DotCom> dotComList= new ArrayList<DotCom>();
    private int numOfGuesses =0;
    
    private void setupUpGame(){
        //Сайты тут и присвоим им имена
        DotCom one = new DotCom();
        one.setName("ya.ru");
        DotCom two = new DotCom();
        two.setName("mail.ru");
        DotCom three =new DotCom();
        three.setName("rambler.ru");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        System.out.println("Ваша цель потопить три 'сайта'. ");
        System.out.println("ya.ru, mail.ru, rambler.ru");
        System.out.println("Попытайтесь их потопить за минимальное количество попыток");
        //Перебираем каждый элемент dotComList и присваем каждый раз ссылке dotComToSet
        for(DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);//Адресс сайта из gamehelper
            dotComToSet.setLocationCells(newLocation); //Сеттер из dotcom присваеваим новой переменой 
        }
    }
    private void startPlaying(){
        while(!dotComList.isEmpty()){//Продолжаем пока список элементов не станет пустым
            String userGuess = helper.getUserInput("Сделайте ход");//Пользовательский ввод  
            checkUserGuess(userGuess);//вызываем метод checkUSerGuess проверка попадания
            
        }
        finishGame();//метод конец игры
    }
    private void checkUserGuess(String userGuess){
        numOfGuesses++;//Считаем количество попыток пользователем
        String result = "Мимо"; //По умолчанию результат промах
        for(DotCom dotComToTest : dotComList){//Перебираем каждый элемент dotComList и присваем каждый раз ссылке dotComToSet
            result = dotComToTest.checkYouself(userGuess);//ищем попадание или потопление
            if(result.equals("Попал")){
                break;//если попал выходим из  цикла
            }
            if(result.equals("Потопил")){
                dotComList.remove(dotComToTest);//Если потопил удаляем его из списка
                break;
            }
        }
        System.out.println(result);//Выводим результат
    }
    // Выводим о том что пользователь прошел игру и результаты игры
    private void finishGame(){
        System.out.println("Все сайты потоплены - русского поиска больше нет");
        if(numOfGuesses <=18) {
            System.out.println("Это заняло у вас "+numOfGuesses+ " попыток");
            System.out.println("Вы быстро расправились с русскими поисковиками попробуйте теперь английские");
        }else{
            System.out.println("Это заняло у вас много времени "+numOfGuesses+" попыток");
            System.out.println("За вами уже выехали прячтесь");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DotComBust game = new DotComBust();//создаем игровой объект
        game.setupUpGame();//Говорим подготовте игру
        game.startPlaying();//Говорим начинаем игру 
    }
    
}
