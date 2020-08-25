//import util.Input;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class GroceryList {
//    private static final Input input = new Input();
////    private static final HashMap<String,String[]> categories;
//    // Get Hashmap, Category as Key, String[];
//    public static String[] getCategory() {
//        int userInput;
//        String[] list;
//        System.out.println("Please pick a category to browse");
//        userInput = input.getInt(0,2);
//        switch(userInput) {
//            case 0:
//                list = new String[]{"Pumpernickel Bread", "Banana Bread"};
//                break;
//            case 1:
//                list = new String[]{"Arrowhead Water", "Dasani Water"};
//                break;
//            case 2:
//                list = new String[]{"Apple","Orange","Peach"};
//                break;
//        }
//        return list;
//    }
//
//    public static ArrayList<String> getItem(ArrayList<String> list, String[] category) {
//        boolean userContinue;
//        int item, amount;
//
//        do {
//            for(int i=0; i<category.length; i++) {
//                System.out.println(i + ". " + category[i]);
//            }
//
//            System.out.println("What item would you like to buy?");
//            System.out.println("");
//
//            System.out.println("Would you like to get another item from this list? [Y/N]");
//            userContinue = input.yesNo();
//            if(!userContinue)
//                break;
//        } while(true);
//
//        return list;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<String> groceryList = new ArrayList<String>();
//        String[] currentCategory;
//        int userInput;
//        boolean userContinue;
//
//
//        do {
//            System.out.print("Would you like to enter a new item? [Y/N]: ");
//            userContinue = input.yesNo();
//            if(!userContinue)
//                break;
//
//            currentCategory = getCategory();
//        } while(userContinue);
//    }
//}

//
//    A user should be prompted if they would like to create a grocery list.
//
//        If they pick yes, they will be prompted if they would like to enter a new item.
//
//        If the users picks yes, they should be given the following three prompts:
//
//        Given an ordered list of grocery categories to choose from, select the category.
//        Enter name of the item.
//        Enter how many of the item.
//        The user will then be given the choice to finalize the list or add an additional item.
//
//        Once the user finalizes the list, they will be presented with a complete list organized alphabetically and grouped by category, and including quantity.
//
//        For an extra bonus, allow users to filter the results by only one category of items at a time.
//
//        For a super gold star bonus, allow users to edit the list items.