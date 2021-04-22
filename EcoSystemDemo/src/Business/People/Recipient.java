/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

/**
 *
 * @author TEJAL
 */
<<<<<<< HEAD
public class Recipient  extends People implements Comparable<Recipient>{
    
    private String organ;
    private int priority;

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
     public int compareTo(Recipient o) {
		return Integer.compare(o.getPriority(), this.getPriority());
	}
=======
public class Recipient {
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
    
}
