
package aula;


public interface Subject {
    //adiciona o observador
    public void addObserver (Observer observer);
    
    //remove o observador
    public void removeObserver (Observer observer);
    
    //notifica todos os observadores
    public void notifyAllObserver();
}
