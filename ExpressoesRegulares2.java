/*
Autor: José Artur Kassala
telefones: 995377451, 932693623
email: Josearturkassala0@hotmail.com / arturjose0@gmail.com
github: arturjose0

*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;

public  class ExpressoesRegulares2{
    public static void main(String[] args){
        String espReg="9([1-4]|9)([0-9]){7}";
        String palavra=JOptionPane.showInputDialog("Digite os numeros de contactos:", "");
       // String palavra="995377451";
        Pattern espRegComp= Pattern.compile(espReg);
        Matcher verificar = espRegComp.matcher(palavra);
String pegar="";
        while(verificar.find()){
            pegar+=verificar.group()+", ";
        }

JOptionPane.showMessageDialog(null,"Os contactos validos sao:\n"+pegar);
        //System.out.println("telefones validos: "+pegar);
    }
}