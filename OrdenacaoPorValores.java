package extra;

public class OrdenacaoPorValores {

    public static void main(String[] args) {
        double precos [] = new double[5];
        precos[0] = 1200;
        precos[1] = 12;
        precos[2] = 120;
        precos[3] = 13;
        precos[4] = 14;
        int menor = 0;


        for(int i = 0; i< precos.length - 1; i++){
            if(precos[i] < precos[menor]){
                menor = i;
            }
        }
        System.out.println("o carro mais baratato é de numero: "+ menor);
        System.out.println("o carro mais barato custa: "+ precos[menor]);


    }
}