import java.util.*;
public class Entrada extends Contenedor {
    
    int num,opc;
    //Scanner sc = new Scanner(System.in);
    Entrada(){
        this.num=0;
        this.opc=0;
    }
    public int leerNum(){
        // Your code here!
        this.num = Integer.parseInt(lee.nextLine());
        //this.num = lee.nextInt();
        System.out.println("Ingrese el numero:"+num);
        return num;
    }
    public int opcion(){
        this.opc = Integer.parseInt(lee.nextLine());
        System.out.println("Ingrese opcion:"+opc);
        return opc;
    }
}
