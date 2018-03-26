package incrdecr;
public class IncrDecr {
    public static void main(String[] args) {
        
       int num  = 5;// Valor inicial
        
        int val1  = num++;// val1 recebe num que é 5 e incrementa num depois, num = 5+1.
        System.out.println("val1: " + val1);
        System.out.println("num: " + num + "\n");
        
        int val2  =  num;//val2 recebe num que é 6.
        System.out.println("val2: " + val2);
        System.out.println("num: " + num + "\n");
        
        int val3  =  ++num;// val3 recebe 7, num já incrementado.
        System.out.println("val3: " + val3);
        System.out.println("num: " + num + "\n"); 

        int val4  =  num + num++;// val4 recebe 14 (num + num) e incrementa num depois, num=8
        System.out.println("val4: " + val4);
        System.out.println("num: " + num + "\n");
        
        int val5  =  num + ++num;// val5 recebe 17 (num + (++num)), já incrementado.
        System.out.println("val5: " + val5);
        System.out.println("num: " + num + "\n");
        
        System.out.println("Esse foram incrementos(++), as mesmas regras valem para os decrementos(--).");    
    }
}
