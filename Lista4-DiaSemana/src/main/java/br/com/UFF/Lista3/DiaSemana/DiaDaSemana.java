
package br.com.UFF.Lista3.DiaSemana;


public enum DiaDaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6), SABADO(7);
    
    private final int dia;
    DiaDaSemana(int valor){
        dia=valor; }

    public int getDia() {
        return dia;
    }
    
    
    
}
