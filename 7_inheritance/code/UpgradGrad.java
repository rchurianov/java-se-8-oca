
class Ugrad {

    int DM = 140;
    int perYear() { return DM/4; }
}

class Grad extends Ugrad {
    int DM = 28; // we have *hidden* Upgrad.DM field by
    int perYear() { return DM/2; }
 }

 public class UpgradGrad {
  public static void main(String[] args){
     Grad g = new Grad();
     System.out.println(g.DM); // Grad.DM field is accessed directly, thus output = 28
     System.out.println(g.perYear()); // 14
     Ugrad u = g; // this will work because of implicit casting to a superclass
     System.out.println(u.DM); // g is casted to u. Grad.DM was hiding Upgrad.DM. Thus Upgrad.DM emerges.
     System.out.println(u.perYear()); // because g is just referred to as Upgrad, its original Grad.perYear() method will be called
  }
}
