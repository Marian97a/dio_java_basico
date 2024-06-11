public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "T"; //M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
                break;
            }
            case "M": {
                System.out.println("hats e Instagran grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligacação");
            }


        /*if(plano == "B") {
            System.out.println("100 minutos de ligacação");
        }else if(plano == "M") {
            System.out.println("100 minutos de ligacação");
            System.out.println("Whats e Instagran grátis");
        }else if(plano =="T") {
            System.out.println("Voce escolheu o plano T com,");
            System.out.println("100 minutos de ligacação");
            System.out.println("Whats e Instagran grátis");
            System.out.println("5GB Youtube");
        }*/
    }
}
}
