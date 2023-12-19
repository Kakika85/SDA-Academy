package ukoly;

import java.util.ArrayList;
import java.util.List;

public class CookFromAvailible {
    List<Receipe> recepty=new ArrayList<>();
    static String input="Kuřecí pečeně: Kuřecí prsa, olivový olej, česnek, rozmarýn, citron, sůl, pepř.\n" +
            "\n" +
            "Těstoviny s rajčatovou omáčkou: Těstoviny, rajčata, cibule, česnek, olivový olej, bazalka, sůl, oregano.\n" +
            "\n" +
            "Losos se špenátovou krémovou omáčkou: Losos, špenát, smetana, máslo, citron, petržel, sůl, pepř.\n" +
            "\n" +
            "Quinoa salát s avokádem: Quinoa, avokádo, rajčata, okurka, cibule, citrónový dresink, olivový olej, sůl, pepř.\n" +
            "\n" +
            "Hovězí guláš s knedlíkem: Hovězí maso, cibule, paprika, rajčata, hovězí vývar, hladká mouka, vejce, sůl, majoránka.\n" +
            "\n" +
            "Ryba na grilu se zeleninovým pestem: Rybí filet, paprika, cuketa, cherry rajčata, olivový olej, bazalka, piniové oříšky, česnek, sůl, pepř.\n" +
            "\n" +
            "Krevety s česnekovým máslem: Krevety, máslo, česnek, petržel, citron, sůl, pepř.";

    void printReceipeFromIngredient(String ... item){
        //print recipes availible
        for(Receipe r:recepty){
            if(r.canCookFrom(item)){
                System.out.println(r);
            }
        }
    }


    public static void main(String[] args) {
        String[] lines = input.split("\n");
        //pro kazdy radek vytvorte novy objekt
        CookFromAvailible cookFromAvailible = new CookFromAvailible();
        //z lines vytvorte objekt a dejte ho do listu recepty


    }
    public static class Receipe{
        String name;
        List<String> items;

        public Receipe(String wholeLine) {
            //parse line to fields
        }

        public boolean canCookFrom(String ... ingediens){
            return items.containsAll(List.of(ingediens));
        }
    }
}
