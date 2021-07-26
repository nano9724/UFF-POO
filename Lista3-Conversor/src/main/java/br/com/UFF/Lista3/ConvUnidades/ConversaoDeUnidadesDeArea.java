
package br.com.UFF.Lista3.ConvUnidades;

public class ConversaoDeUnidadesDeArea {
    //Unidade base em Metro 
   
    private static final double  PE_QUADRADO= (0.929)*(0.929);
    private static final double  METRO_QUADRADO= 1076*PE_QUADRADO;
    private static final double  ACRE= 43560*PE_QUADRADO;
    private static final double  MILHA_QUADRADA =640*ACRE;
    
    public static void ConverterPes(double n){
        double result = n* METRO_QUADRADO;
        System.out.println("Valor em Pe Quadrado: " + result);
       }
    
    public static void ConverterMilha(double n){
        double result = n* MILHA_QUADRADA;
        System.out.println("Valor em Milha Quadrada: " + result);
       }
    
    public static void ConverterACRE(double n){
        double result = n*ACRE;
        System.out.println("Valor em Acre Quadrado: " + result);
       }
    
}