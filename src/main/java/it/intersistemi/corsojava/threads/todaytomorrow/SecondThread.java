package it.intersistemi.corsojava.threads.todaytomorrow;

public class SecondThread extends Thread{

    String word = "Tomorrow";
    public void run(){
        while(true){
            while(PrintTodayTomorrowMain.flag == false){
                for(int index = 0; index < 2; index++){
                    for(int secondIndex = 0; secondIndex < word.length(); secondIndex++){
                        PrintTodayTomorrowMain.printer.print(word.charAt(secondIndex));
                    }
                    PrintTodayTomorrowMain.flag = false;
                }
            }
        }
    }
}