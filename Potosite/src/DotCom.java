/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author y.voytovich
 */
import java.util.*;
public class DotCom {
    //Ячейки с описанием и именем сайтов
    private ArrayList<String> locationCells;
    private String name;
    //Сеттер где находится сайт
    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }
    //Сеттер имени 
    public void setName(String n){
        name=n;
    }
    //Проверка попадания
    public String checkYouself(String userInput){
        String result ="Мимо";
        //метод indexOf из ArrayList если ход совпал с одним из элементов тогда indexOf() вернет его местоположение иначе вернет -1 
        int index = locationCells.indexOf(userInput);
        if(index >= 0){
            //Если элемент есть удаляем его из ArrayList remove()
            locationCells.remove(index);
            // Проверяем все ли разгаданы сайта не пустой ли 
            if(locationCells.isEmpty()){
                result = "Потопил";
                System.out.println("Ой! Вы потопили"+name+"    : ( ");
            }else{
                result = "Попал";
            }
        }
        return result;
    }
}
