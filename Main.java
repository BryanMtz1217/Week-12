public class Main {
    public static void main(String[] args) {
        HeroManager heroManager = new HeroManager();

        // Adds heroes
        heroManager.addHero(new Hero("Spider-Man", 85, Affiliation.AVENGERS));
        heroManager.addHero(new Hero("Batman", 90, Affiliation.JUSTICE_LEAGUE));
        heroManager.addHero(new Hero("Wolverine", 95, Affiliation.X_MEN));
        heroManager.addHero(new Hero("Wonder Woman", 92, Affiliation.JUSTICE_LEAGUE));

        // Displays original list of heroes
        System.out.println("Original list of heroes:");
        heroManager.displayHeroes();

        // Sorts heroes by power level using Bubble Sort
        heroManager.bubbleSortHeroesByPower();
        System.out.println("\nHeroes sorted by power level (Bubble Sort):");
        heroManager.displayHeroes();

        // Sorts heroes by power level using Insertion Sort
        heroManager.insertionSortHeroesByPower();
        System.out.println("\nHeroes sorted by power level (Insertion Sort):");
        heroManager.displayHeroes();

        // Removes a hero by name
        heroManager.removeHero("Batman");
        System.out.println("\nList of heroes after removing Batman:");
        heroManager.displayHeroes();

        // Adds a new hero
        heroManager.addHero(new Hero("Iron Man", 88, Affiliation.AVENGERS));
        System.out.println("\nList of heroes after adding Iron Man:");
        heroManager.displayHeroes();

        // Displays heroes in 2D array
        System.out.println("\nHeroes in 2D array format:");
        heroManager.displayHeroesAs2DArray();
    }
}
