
package aula;


public class Estagiario implements Observer{
    private final String  nome;
    public Estagiario(String nome, Subject subject){
        this.nome = nome;
        subject.addObserver(this);
    }

    @Override
    public void upDate(String texto) {
        System.out.println (this.nome + " uma nova vaga para você! " + texto);
    }
}
