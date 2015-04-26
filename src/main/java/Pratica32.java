/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Daniel Anderson de Freitas
 */
public class Pratica32 {

    public static double densidade(double x, double media, double desvio) {
        double d = (1.0 / (Math.sqrt(2.0 * Math.PI) * desvio) * Math.exp(-(1.0 / 2.0) * Math.pow(((x - media) / desvio), 2.0)));
        return d;
    }

    public static void main(String[] args) {

        System.out.println(Pratica32.densidade(-1.0, 67.0, 3.0));
        if (Pratica32.densidade(-1.0, 67.0, 3.0) == (1.0 / (Math.sqrt(2.0 * Math.PI) * 3.0) * Math.exp(-(1.0 / 2.0) * Math.pow((((-1.0) - 67.0) / 3.0), 2.0)))) {
            System.out.println("Valor Calculado Está Correto.");
        }

    }
}
