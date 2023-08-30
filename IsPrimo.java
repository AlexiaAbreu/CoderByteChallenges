package extra;
//algorítimo que recebe um numero e diz se o número é primo ou não
public class IsPrimo {
    public static void main(String[] args) {
        int num = 7;

    }
    public boolean IsNumPrimo(int number){
        if(number % number == 1 || number % 1 ==number ){
            System.out.println("é primo");
            return true;
        }
        System.out.println("não é");
        return false;
    }


}
