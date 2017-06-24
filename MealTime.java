import java.io.Console;

public class MealTime {
  public static void main(String[] args) {
    Console myConsole = System.console();
    String breakfast = "breakfast";
    String lunch = "lunch";
    String dinner = "dinner";

    whatYouAteFor(breakfast);
    String inputBreakfast = myConsole.readLine();
    whatYouAteFor(lunch);
    String inputLunch = myConsole.readLine();
    whatYouAteFor(dinner);
    String inputDinner = myConsole.readLine();

    summaryOfMeals(inputBreakfast, inputLunch, inputDinner);
  }

  public static void whatYouAteFor(String meal) {
    System.out.println("What did you eat for " + meal + "?");
  }

  public static void summaryOfMeals(String meal1, String meal2, String meal3) {
    System.out.println("You ate " + meal1 + " for breakfast, " + meal2 + " for lunch, and " + meal3 + " for dinner.");
  }
}
