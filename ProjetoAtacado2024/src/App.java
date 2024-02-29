import java.time.LocalDate;

import dominio.*;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("\n\n\n----------------------------------------------");
        
        PessoaFisica pf1 = new PessoaFisica(10, 
            "Rua x 80", 
            "33211234", 
            LocalDate.now(), 
            "Alexandre", 
            "12390238910283");
        System.out.println(pf1.toString());

        System.out.println("----------------------------------------------");

        PessoaJuridica pj1 = new PessoaJuridica(1000, 
        "Rua Z", 
        "32154567", 
        LocalDate.now(), 
        "Zezinho Empreendimentos", 
        "Bolicho do Zé", 
        "987");
        System.out.println(pj1.toString());

        System.out.println("----------------------------------------------\n\n\n");
    }
}
