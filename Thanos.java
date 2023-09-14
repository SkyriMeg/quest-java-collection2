import java.util.*;

// import java.util.List;

public class Thanos {

  public static void main(String[] args) {
    List<Hero> heroes = new ArrayList<>();
    heroes.add(new Hero("Hulk", 49));
    heroes.add(new Hero("Black Widow", 34));
    heroes.add(new Hero("Captain America", 100));
    heroes.add(new Hero("Thor", 1501));

    // OK : Modify Hero to implements Comparable and sort by name (ascending)

    Comparator<Hero> comparator = new Comparator<Hero>() {
      @Override
      public int compare(Hero hero1, Hero hero2) {
        return hero1.getName().compareTo(hero2.getName());
      }
    };

    Collections.sort(heroes, comparator);

    System.out.println("\nOrder by name:");
    showList(heroes);

    // OK : Add a Comparator and sort by age (descending)

    Collections.sort(heroes);

    System.out.println("\nOrder by age:");
    showList(heroes);
  }

  private static void showList(List<Hero> heroes) {
    for (Hero heroe : heroes) {
      System.out.println(heroe.getName() + ", " + heroe.getAge());
    }
  }
}
