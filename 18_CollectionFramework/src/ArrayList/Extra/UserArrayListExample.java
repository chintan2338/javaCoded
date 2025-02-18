package ArrayList.Extra;

import java.util.ArrayList;

class UserInfo {
    private String username;
    private int age;
    private String id;
    private String mobileNumber;

    // Constructor
    public UserInfo(String username, int age, String id, String mobileNumber) {
        this.username = username;
        this.age = age;
        this.id = id;
        this.mobileNumber = mobileNumber;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }
}

public class UserArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList to store UserInfo objects
        ArrayList<UserInfo> userList = new ArrayList<>();

        // Adding UserInfo objects to the ArrayList
        // userList.add(new UserInfo("Alice", 25, "ID123", "1234567890"));
        // userList.add(new UserInfo("Bob", 30, "ID456", "9876543210"));
        // userList.add(new UserInfo("Charlie", 35, "ID789", "5555555555"));
        
        UserInfo ui1 = new UserInfo("Alice", 25, "ID123", "1234567890");
        userList.add(ui1);
        
        UserInfo ui2 = new UserInfo("Bob", 30, "ID456", "9876543210");
        userList.add(ui2);
        
        UserInfo ui3 = new UserInfo("Charlie", 35, "ID789", "5555555555");
        userList.add(ui3);
        
        

        // Retrieving and printing UserInfo objects from the ArrayList
        System.out.println("User Information:");
        for (UserInfo user : userList) {
            System.out.println("Username: " + user.getUsername());
            System.out.println("Age: " + user.getAge());
            System.out.println("ID: " + user.getId());
            System.out.println("Mobile Number: " + user.getMobileNumber());
            System.out.println();
        }
    }
}
