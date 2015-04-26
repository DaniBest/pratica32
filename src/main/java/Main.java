/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Daniel Anderson de Freitas
 */
public class Main {
    public static void main(String[] args) {
        Double resposta = Pratica32.densidade(-1.0, 67.0, 3.0);
        System.out.println(resposta);
        Double verificação = (1.0/(Math.sqrt(2.0*Math.PI)*3.0)*Math.exp(-(1.0/2.0)*Math.pow((((-1.0)-67.0)/3.0),2.0)));
        if(resposta.equals(verificação)) {
            System.out.println("Valor Calculado Está Correto.");
        }
    }
}
