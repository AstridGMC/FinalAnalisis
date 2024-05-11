package tdd.Anagrama;

public class Anagrama {

    public void isAnagrama(String palabra1, String palabra2){
        if(palabra1.length()==palabra2.length()){
            System.out.println((comparar(palabra1, palabra2)));
        }
    }

    public boolean comparar( String palabra1 , String palabra2){
        int contador=0;
        boolean comparacion=true;
           for(int j=0; j< palabra2.length();j++){
                if(palabra1.contains(String.valueOf(palabra1.charAt(j)))){
                    if(!comparacion==false){
                        if(contarCaracteres(palabra1,palabra1.charAt(j))==contarCaracteres(palabra2,palabra1.charAt(j))){
                            comparacion= true;
                            contador++;
                        }else{
                           comparacion= false;
                        }
                    }
                }else{
                    comparacion=false;
                }
            }

        System.out.println(contador);
            if(contador==palabra1.length() && comparacion==true){
                return true;
            }else{
                return false;
            }
    }

    public int contarCaracteres(String palabra, char letra){
        int contador=0;
        for (int i=0; i<palabra.length();i++){
            if(palabra.charAt(i)==letra){
                contador++;
            }
        };
        return contador;
    }

}
