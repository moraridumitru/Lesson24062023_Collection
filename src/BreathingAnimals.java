public class BreathingAnimals implements ToBreathe {
    public static void main(String[] args) {
        BreathingAnimals Human =new BreathingAnimals();
        BreathingAnimals Fish =new BreathingAnimals();
        BreathingAnimals Infusoria =new BreathingAnimals();
        Human.toBreathe("lungs");
        Fish.toBreathe("gills");
        Infusoria.toBreathe("skin");
        Humans Americans =new Human;
    }
    @Override
    public void toBreathe(String breathingMecanism){
     if (breathingMecanism.equals("lungs")) {
         System.out.println("It is the human");
     }
     else if (breathingMecanism.equals("gills")){
         System.out.println("It is the fish");
     } else if (breathingMecanism.equals("skin")) {
         System.out.println("It is the infusoria");

     } else {
         System.out.println("Animal does not found");
     }
    }
}
