/**
 * Created by michaelfestger on 5/11/17.
 */

package io;

public class MethodsLecture {
    public static boolean makeTacos(boolean tortillas, boolean fill, boolean salsa){

        if(tortillas && fill && salsa){
            return true;
        }else{
            return false;
        }


    }

    public static void areTheTacosReady(boolean answer){
        if(answer){
            System.out.println("Tacos are ready!");
        }else{
            System.out.println("Tacos are NOT ready!");
        }
    }

    public static String serve(String client){
        return client + " was served.";
    }


    public static void main(String[] args) {
       boolean answerC1 =  makeTacos(true, true, true);
        areTheTacosReady(answerC1);
        if(answerC1) {
            serve("Mike");
        }
        }

    }

