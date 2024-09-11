public class Operadores {

    public static void main(String[] args) {

        String nomeUm = "Douglas";
        String nomeDois = new String ("Douglas");
        System.out.println(nomeUm.equals(nomeDois));


        int a, b, c, d;
        a = 5;
        b = 6;
        c = 7;
        d = 8;
        String nomeCompleto = "LINGUAGEM" + "JAVA";

        System.out.println(nomeCompleto);


        String resultado = "";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado ="falso";
        System.out.println(resultado);

        String resultado1 = c == d ?"verdadeiro" : "falso";
        System.out.println(resultado1);

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;

        if(numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois?" + simNao);
        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois?" + simNao);
        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que o numeroDois?" + simNao);

        boolean condicao1 =  true;

        boolean condicao2 = true;

        if(condicao1 || condicao2) {
            System.out.println("uma das condições é verdadeiras");
        }
        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");

        }






    }


}
