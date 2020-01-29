package it.intersistemi.corsojava.threads.todaytomorrow;

public class FirstThread extends Thread{

    String word = "Today";
    public void run(){
        while(true){
            while(PrintTodayTomorrowMain.flag){
                for(int index = 0; index < 5; index++){
                    for(int secondIndex = 0; secondIndex < word.length(); secondIndex++){
                        PrintTodayTomorrowMain.printer.print(word.charAt(secondIndex));
                    }
                    PrintTodayTomorrowMain.flag = true;
                }
            }
        }
    }
}
