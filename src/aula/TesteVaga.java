
package aula;


public class TesteVaga {
    public static void main (String[]args){
        vagaEstagio vaga = new vagaEstagio();
        vaga.recebeVaga("Estagio Infra-Estrutura");
        Observer estagiario = new Estagiario("Roberto", vaga);
        Observer estagiario2 = new Estagiario ("Daniel", vaga);
        vaga.recebeVaga("Estagio TI");
        vaga.recebeVaga("Estagio Front-End");
    }
}
