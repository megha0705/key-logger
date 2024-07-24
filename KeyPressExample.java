import java.awt.event.*;
import javax.swing.*;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class KeyPressExample extends JFrame implements KeyListener {
    public KeyPressExample(){
        setTitle("key press example");
        setSize(400, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addKeyListener(this);
    }
 
    @Override
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        String text = KeyEvent.getKeyText(keyCode);
        //System.out.println("key pressed is " + text);
        
        try( BufferedWriter f_writer = new BufferedWriter(new FileWriter("/Users/Saptarshi/OneDrive/Desktop/java/key-logger/TextFile.txt", true))){
            f_writer.write(text);  
            f_writer.newLine();  
            System.out.println(text);
        }catch(IOException i){
            System.out.println("an error has occured" + i.getMessage());
        }
    }
  

    @Override
    public void keyReleased(KeyEvent e){
        int keyCode = e.getKeyCode();
     
    }
    @Override
    public void keyTyped(KeyEvent e) {
        char keyChar = e.getKeyChar();
       
    }
    public static void main(String[]args){
        new KeyPressExample();
        
        
    }



}//it shows the key which is beings pressed
//WRITE INTO A FILE/*
/*
class KeyPressExample{
    public static void main(String [] args){
        
    }
}*/
//and it is working ;)
