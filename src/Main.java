import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> myArrList = new ArrayList<>();

        boolean done = false;
        String userChoice;
        String trash;
        String arrayAdd = "";
        String arrayInsert = "";
        int arrayIndex = 0;
        System.out.println("~ListMaker 2024~");
        do {
            System.out.println("\n[ A - Add item to list | D - Delete item from list | I - Insert item into the list | P - Print the list | Q - Quit ]");
            userChoice = in.nextLine();
            switch (userChoice)
            {
                case "A":
                case "a":
                    addItem();
                    myArrList.add(in.nextLine());
                    break;
                case "D":
                case "d":
                    deleteItem();
                    myArrList.remove(in.nextInt());
                    break;
                case "I":
                case "i":
                    insertItem();
                    myArrList.add(arrayIndex, arrayInsert);
                    break;
                case "P":
                case "p":
                    System.out.println(myArrList);
                    break;
                case "Q":
                case "q":

                    done = SafeInput.getYNConfirm(in,"Are you sure you'd like to quit? Enter Y or N");
                    break;
                default:
                    System.out.println("Your input is invalid. Please provide a valid input.");

            }
        } while(!done);
    }
    public static String addItem() {
        Scanner in = new Scanner(System.in);
        String arrayAdd;
        arrayAdd=SafeInput.getNonZeroLength(in, "Enter a string to be added to the array");

        return arrayAdd;
    }
    public static void deleteItem() {
        Scanner in = new Scanner(System.in);
        int arrayIndex;
        arrayIndex=SafeInput.getInt(in, "Enter the index integer at which you'd like to delete a string");

    }
    public static void insertItem() {
        Scanner in = new Scanner(System.in);
        String arrayInsert;
        int arrayIndex;
        arrayInsert=SafeInput.getNonZeroLength(in, "Enter a string to be inserted into the array");
        arrayIndex=SafeInput.getInt(in, "Enter the index integer at which you'd like to insert the string");
        arrayIndex=in.nextInt();
    }

}