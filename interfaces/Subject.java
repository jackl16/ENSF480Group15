//Subject.java
package interfaces;

interface Subject{
    public void register(Subscription o);
    public void remove(Subscription o);
    public void notifySubscription();
    
}