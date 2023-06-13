public class Menu extends Entrada {
    
    int op;
    
    Menu(){
    
        this.op=0;
    }
    public void menu(){
        
        System.out.println("1.-Sumar");
        System.out.println("2.-Restar");
        System.out.println("3.-Multiplicar");
        System.out.println("4.-Dividir");
        System.out.println("5.-Salir del Programa");
    }
}
