/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxe;

/**
 *
 * @author Adria
 */
public class Exerc8 {
  
    public static boolean quadradoMagico(int[][] matriz){
    
    int soma=0;
    int demaisSomas;
    
    for(int j=0; j< matriz[0].length ; j++){
    soma= soma+matriz[0][j];   
}
    // linhas
    for (int i=1; i<matriz.length; i++){
        demaisSomas=0;
        for(int j=0; j<matriz[i].length;j++){
            demaisSomas+=matriz[i][j]; 
        }
        if (demaisSomas !=soma){
        return false;
        }
    }
    
    
    // colunas
    for (int j=0; j<matriz[0].length; j++){
    demaisSomas=0;
    for (int i=0; i< matriz.length;i++){
    demaisSomas+= matriz[i][j];
    }
    if (demaisSomas!=soma){
     return false;   
    }
    
    }
    
    //diagonais
    demaisSomas=0;
    
    for(int i=0; i<matriz.length; i++){
    demaisSomas+= matriz[i][i];
    }
    if (demaisSomas != soma){
    return false;
    }
    
    
    demaisSomas=0;
    int i=0;
    for (int j=matriz.length-1;j>=0;j--){
    demaisSomas+=matriz[i][j];
    i++;
    }
    if (demaisSomas!=soma){
    return false;
    }
    return true;
    
}
    
    public static void main (String [] args){
    int [][] matriz = new int [4][4];
    matriz [0][0]=4;
    matriz [0][1]=14;
    matriz [0][2]=15;
    matriz [0][3]=1;
    matriz [1][0]=9;
    matriz [1][1]=7;
    matriz [1][2]=6;
    matriz [1][3]=12;
    matriz [2][0]=5;
    matriz [2][1]=11;
    matriz [2][2]=10;
    matriz [2][3]=8;
    matriz [3][0]=16;
    matriz [3][1]=2;
    matriz [3][2]=3;
    matriz [3][3]=13;
    
    if (quadradoMagico(matriz))
        System.out.println("É um quadrado mágico");
    
    }

}
