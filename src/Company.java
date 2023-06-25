

    import java.util.HashMap;
    import java.util.HashSet;
    import java.util.Iterator;

    public class Company {
        public static void main(String[] args) {
            HashMap<Integer, String> bank = new HashMap<>();  //HashMap pastreaza doar 2 variabile cheia si valoarea
            bank.put(1, "MAIB");
            bank.put(2, "mobias");
            bank.put(3, "Victoriabank");
            bank.put(4, "Moldinconbank");
            for (Integer i : bank.keySet()) {          //for keys
             //   System.out.println(i);
            }
          //  for (String i : bank.values()) {         // for values
                //System.out.println(i);
                //System.out.println(bank);
                bank.replace(2,"ComertBank");     //izmeniti znacenie v HashMap schimbam 2, mobias in comert
                System.out.println(bank.get(2));
            System.out.println(!bank.isEmpty());
            bank.remove(2); //stergem din colectie key 2
            bank.clear(); //stergem toata colectia
            System.out.println(bank.isEmpty());
          //  }
            HashSet<String>city=new HashSet();
            city.add("Chisinau");
            city.add("Stambul");
            city.add("Amsterdam");
            city.add("Balti");
            city.add("A");
            //city.add("Amsterdam");
            System.out.println(city);
            System.out.println(city.contains("Chisinau"));
            System.out.println(city.remove("A"));
            System.out.println(city);
            Iterator<String>i= city.iterator();
            while (i.hasNext()){
                System.out.println(i.next());
            }
        }
    }
    //}
