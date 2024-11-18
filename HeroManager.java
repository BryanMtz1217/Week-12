import java.util.ArrayList;
import java.util.Arrays;

public class HeroManager {
    private ArrayList<Hero> heroes;

    // Constructor
    public HeroManager() {
        heroes = new ArrayList<>();
    }

    // Adds Hero
    public void addHero(Hero hero) {
        heroes.add(hero);
    }

    // Removes Hero by name
    public void removeHero(String name) {
        heroes.removeIf(hero -> hero.getName().equals(name));
    }

    // Bubble Sort by power level
    public void bubbleSortHeroesByPower() {
        int n = heroes.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (heroes.get(j).getPowerLevel() > heroes.get(j + 1).getPowerLevel()) {
                    // Swap heroes[j] and heroes[j+1]
                    Hero temp = heroes.get(j);
                    heroes.set(j, heroes.get(j + 1));
                    heroes.set(j + 1, temp);
                }
            }
        }
    }

    // Insertion Sort by power level
    public void insertionSortHeroesByPower() {
        int n = heroes.size();
        for (int i = 1; i < n; ++i) {
            Hero key = heroes.get(i);
            int j = i - 1;

            // Move elements of heroes[0..i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && heroes.get(j).getPowerLevel() > key.getPowerLevel()) {
                heroes.set(j + 1, heroes.get(j));
                j = j - 1;
            }
            heroes.set(j + 1, key);
        }
    }

    // Display Heroes as a 2D Array
    public void displayHeroesAs2DArray() {
        String[][] heroArray = new String[heroes.size()][3];
        for (int i = 0; i < heroes.size(); i++) {
            heroArray[i][0] = heroes.get(i).getName();
            heroArray[i][1] = String.valueOf(heroes.get(i).getPowerLevel());
            heroArray[i][2] = heroes.get(i).getAffiliation().toString();
        }
        System.out.println(Arrays.deepToString(heroArray));
    }

    // Displays Heroes
    public void displayHeroes() {
        for (Hero hero : heroes) {
            System.out.println(hero);
        }
    }
}
