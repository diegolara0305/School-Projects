import java.util.Locale.Category;

import javax.xml.transform.Templates;

/* Diego Lara*/

public class CL3v2_Lara {
    public static void main(String[] args) {
        // creating the head of the list, the list is empty
        House head = null;
        System.out.println("Is the list empty (should be true)?: " + isEmpty(head)); // should be true
        // creating first house, not adding to list yet
        House house1 = new House(79901, 150000.23, 'A');
        // adding the new house to the list
        head = addToList(head, house1);
        System.out.println("Is the list empty (should be false)?: " + isEmpty(head)); // should be false
        // creating second house
        House house2 = new House(79913, 250030.82, 'B');
        // adding second house to list
        head = addToList(head, house2);
        System.out.println("Printing the list....");
        printList(head);
        // creating third house
        House house3 = new House(79934, 128723.12, 'A');
        // adding third house to list
        head = addToList(head, house3);
        System.out.println("Printing the list (again but with third house now)....");
        printList(head);
        System.out.println("Check if the list contains a category C house: " + listContainsCategoryC(head));
        // creating fourth house
        House house4 = new House(79924, 73233.12, 'C');
        // adding fourth house to list
        head = addToList(head, house4);
        System.out.println("Printing the list (again but now with fourth house)....");
        printList(head);
        System.out.println("Check if the list contains a category C house: (again but now should be true): "
                + listContainsCategoryC(head));

        // //Uncomment the following lines for extra credit only!
        // System.out.println("....so, you have decided to go for the extra credit, then  solve this:");

        //Creating fifth house called "house5" with the following values: 79921,
        // "Price undefined", 'C'
        // //TODO: your code here for creating object called 'house5'
        // //add fifth house to the list
        // head = addToList(head, house5);
        // printList(head);//House 5 should appear now, but price as a String not double
    }

    public static boolean isEmpty(House head) {
        if (head == null) {
            return false;
        }
        return true;
    }

    public static House addToList(House head, House newHouseToAdd) {
        House temp = head;
       if(head != null){
        while(temp.next != null){
            temp = temp.next;
           }
       }
       else{
       return newHouseToAdd;
       }
       return head;
    }

    public static void printList(House head) {
        House temp = head;
        if (temp != null) {
            
                System.out.println(temp);
                temp = temp.next;
            
        } else {
            System.out.println("The list is empty");
        }

    }

    public static boolean listContainsCategoryC(House head) {
       House temp = head;
       while(temp != null){
       if(temp.getCategory =="C"){
        return true;
       }
       }
        return false;
    }
}
