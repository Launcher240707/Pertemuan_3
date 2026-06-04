import java.util.*;

public class Mahasiswa {
    public static void main(String[] args) {
        List<String> datalist= new ArrayList<>();
        datalist.add("Alvin bot");
        datalist.add("Alvin hebat");
        datalist.add("Alvin plenger");

        datalist.remove(datalist.get(0));

        System.out.println("Data List: " + datalist);

        //Set
        Set<String> dataset= new HashSet<>();
        dataset.add("promag Alvin");
        dataset.add("ahe Alvin");
        dataset.add("mantap Alvin");
        dataset.add("josjis Alvin");

        dataset.remove("promag Alvin");

        System.out.println("Data Set: " + dataset);

        Set<String> dataset2 = new LinkedHashSet<>();
        dataset2.add("betadine Alvin");
        dataset2.add("oskadon Alvin");
        dataset2.add("paramex Alvin");
        dataset2.add("salonpas Alvin");
        dataset2.add("hansaplast Alvin");

        dataset2.remove("betadine Alvin");

        System.out.println("Data Set: " + dataset2);

        Set<String> dataset3 = new TreeSet<>();
        dataset3.add("konidin Alvin");
        dataset3.add("obeha Alvin");
        dataset3.add("antangin Alvin");
        dataset3.add("puyer Alvin");
        dataset3.add("mixagrip Alvin");

        dataset3.remove("obeha Alvin");

        System.out.println("Data Set: " + dataset3);

        Map<String,Integer> stokBuah = new HashMap<>();
        stokBuah.put("Apel",50);
        stokBuah.put("Mangga",150);

        stokBuah.remove("Apel");

        System.out.println("Stok Apel: " + stokBuah.get("Apel"));
        System.out.println("Stok Mangga: " + stokBuah.get("Mangga"));
    }
}
