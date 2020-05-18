import java.util.regex.Pattern;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;

public class ExpressoesRegulares1{
    public static void main(String[] args){
        // TEMA: METACARACTERES
        // \\d -> tudo que for digito 
        // \\D -> tudo que nao for digito ate os caracteres especiais 
        // \\s -> todo espaço em branco do tipo \t \n \f \r 
        // \\S -> todo espaço que nao for em branco
        // \\w -> Caracter de palavras (nao caracter especiais), de a-z e A-Z, digitos e _
        // \\W -> O inverso do anterior

        String expReg= "\\d";
        String palavra = JOptionPane.showInputDialog("");
        Pattern padrao = Pattern.compile(expReg);
        Matcher encontrar = padrao.matcher(palavra);
        
        //System.out.println(encontrar.pattern());
String letras="";
        while(encontrar.find()){
          // System.out.print(encontrar.start()+", ");
          letras+=palavra.charAt(encontrar.start());
           
        }
        System.out.println("");
        
        if(letras.length()==9 && letras.charAt(0)=='9'){
            if(letras.charAt(1)=='2' || letras.charAt(1)=='3' || letras.charAt(1)=='4' ){
       // System.out.println("numero de telefone da unitel -> "+letras);
                JOptionPane.showMessageDialog(null, "numero de telefone da unitel -> "+letras);
                
            }else  if(letras.charAt(1)=='1' || letras.charAt(1)=='9'){
                JOptionPane.showMessageDialog(null, "numero de telefone da movicel -> "+letras);
            //System.out.println("numero de telefone da movicel -> "+letras);
            }else{
                JOptionPane.showMessageDialog(null, "numero de telefone desconhecido -> "+letras);

           // System.out.println("numero de telefone desconhecido -> "+letras);
                
            } 


        }else{
        System.out.println("nao reconheco o numero "+letras);

        }


    }
}