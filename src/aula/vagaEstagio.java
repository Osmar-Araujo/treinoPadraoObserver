
package aula;
import java.util.List;
import java.util.ArrayList;

public class vagaEstagio implements Subject {
    private final List <Observer> observers;
    private final List <String> vagas;
    
    public vagaEstagio(){
        this.observers = new ArrayList<>();
        this.vagas = new ArrayList();
    }
    
    public void recebeVaga (String vagas){
        this.vagas.add(vagas);
        this.notifyAllObserver();
    }
    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int ind = this.observers.indexOf(observer);
        if (ind >= 0){
            this.observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObserver() {
        observers.stream().forEach((observer) -> {
            observer.upDate(this.vagas.get(this.vagas.size()-1));
        });
    }
    
}
