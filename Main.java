import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int opc=0,a=0,b=0,res=0;
        //int opc,res;
        Entrada obj1=new Entrada();
        a=obj1.leerNum();
        b=obj1.leerNum();
        Menu obj2=new Menu();
        obj2.menu();
        opc=obj1.opcion();
        Control obj3=new Control();
        res=obj3.controlador(opc,a,b);
        Limite obj4=new Limite();
        obj4.escribir(res,opc);
        System.out.println("XXXXXXXX");
    }
}
