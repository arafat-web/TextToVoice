/*
 * Name: Text To Speech Coverter
 * Author: Arafat Hossain Ar
 * Date: 20/05/2020
 * All right reserved. Don't copy single line of code without permission.
 */
package texttovoice;
import com.sun.speech.freetts.*;
import java.util.Scanner;
/**
 * Test Code for Text to Speech.
 * @author Arafat Hossain Ar
 */
public class TextToVoice {

     private static final String name = "kevin16";
     static String text="Hello";
     static String text2 = "How are you";
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text1 = in.nextLine();
       Voice voice;
        VoiceManager vcm = VoiceManager.getInstance();
        voice = vcm.getVoice(name);
        voice.allocate();
         if( text1.equalsIgnoreCase(text)){
        voice.speak(text);
         } else if(text1.equalsIgnoreCase(text2)){
             voice.speak(text2);
         } else{
             voice.speak("Failed to understand");
         }
        
    }
    
}
