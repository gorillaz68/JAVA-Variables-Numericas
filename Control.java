public class Control{
    
    int opc=0,res=0;
    
    Control(){
    
        this.opc=0;
    }
    public int controlador(int x, int a,int b){
        // Your code here!
        this.opc=x;
        switch(opc){
            
            case 1:
                res=a+b;
                //System.out.println("el resultado es:"+res);
                break;
            case 2:
                res= a-b;
                //System.out.println("el resultado es:"+res);
                break;
            case 3:
                res = a * b;
                //System.out.println("el resultado es:"+res);
                break;
            case 4:
                res = a / b;
                //System.out.println("el resultado es:"+res);
                break;
            case 5:
                System.out.println("Fin del programa");
                break;
            default:
                break;
        }
        return res;
    }
}
