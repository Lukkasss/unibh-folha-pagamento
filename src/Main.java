import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: Lucas Vilela
 * Date: 06/11/2018
 * Time: 20:54
 * To change this template use File | Settings | File and Code Templates.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Dependentes> a = new ArrayList<>();
        a.add(new Dependentes("11005", "Coringa", 28));
        a.add(new Dependentes("11005", "Asgard", 28));
        a.add(new Dependentes("11111", "Pudge", 18));
        a.add(new Dependentes("22222", "Batman", 25));

        ArrayList<Dependentes> b = new ArrayList<>();
        b.add(new Dependentes("895", "Stuart", 15));
        b.add(new Dependentes("51454", "Drake", 16));

        ArrayList<Dependentes> c = new ArrayList<>();
        c.add(new Dependentes("652", "Loki", 24));
        c.add(new Dependentes("454", "Thor", 13));
        c.add(new Dependentes("023", "Sherlock Holmes", 11));

        ArrayList<Dependentes> d = new ArrayList<>();
        d.add(new Dependentes("95956", "Mr. Bean", 8));
        d.add(new Dependentes("1652", "Chaves", 9));
        d.add(new Dependentes("48489", "Kiko", 10));

        Mensalista men = new Mensalista("1", "Lucas", "119", 8000.0, 300.0, a);
        Comissionado com = new Comissionado("2", "Yasmin", "119", 80000.0, 10.0, 300.0, b);
        Confianca conf = new Confianca("3", "Leonardo", "26356", 5000.0, 30.0, 500.0, c);
        Horista hor = new Horista("4", "Orlando", "4444444", 100.0, 10.0, 100.5, d);

        System.out.println("************** MENSALISTA **************");
        System.out.println(men.montarRelatorio());
        System.out.println("****************************************");
        System.out.println("************** COMISSIONADO **************");
        System.out.println(com.montarRelatorio());
        System.out.println("****************************************");
        System.out.println("************** CONFIANÇA **************");
        System.out.println(conf.montarRelatorio());
        System.out.println("****************************************");
        System.out.println("************** HORISTA **************");
        System.out.println(hor.montarRelatorio());
        System.out.println("****************************************");
    }
}
