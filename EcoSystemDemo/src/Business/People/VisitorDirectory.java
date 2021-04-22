/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
/**
 *
 * @author TEJAL
 */
public class VisitorDirectory {
    
<<<<<<< HEAD
    private ArrayList<Visitor> visitorList;

    public VisitorDirectory() {
        visitorList = new ArrayList();
    }

    public ArrayList<Visitor> getVisitorList() {
        return visitorList;
    }

    public void setVisitorList(ArrayList<Visitor> visitorList) {
        this.visitorList = visitorList;
    }
    
    public Visitor createVisitor(String email, boolean option){
        Visitor visitor = new Visitor();
        visitor.setEmail(email);
        visitor.setOption(option);
        visitorList.add(visitor);
        return visitor;
    }
    
=======
>>>>>>> 5f8eaeead469eab9fad6c663c9464f1f58d8b92e
}
