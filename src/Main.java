import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        //instance of class == object
        // User u = new User(); // User = type, u = variable, same as int x = ... object stored in this variable u
        // then what do we do with this object? we give attributes to the variable!
        // u.name = "Sanemi";
        // u.membership = "Hashira";

        /* this for encapsulation or method overloading
        u.set_name("sanemi");
        u.set_membership(User.Membership.Hashira);

        System.out.println(u.get_name());
        System.out.println(u.get_membership());
        */

        // CONSTRUCTOR STYLE
        System.out.println("\nCONSTRUCTOR");
        User u = new User("Sanemi","Hashira");
        User u2 = new User(); // will be default values
        System.out.println(u.get_name());
        System.out.println(u.get_membership());
        System.out.println(u2.get_name());
        System.out.println(u2.get_membership());
        System.out.println(u); // what it does it print u.toString() which return memory adress and type of the data
        System.out.println(u2);
        System.out.println(u.equals(u2)); 

        // GENERIC LIST
        System.out.println("\nGENERIC LIST");
        // User u = new User();
        // u.set_name("Sanemi");
        // List<User> users = new ArrayList<User>();
        // users.add(u);
        User.admins = new ArrayList<User>(); // STATIC DATA MEMBERS
        User.admins.add(new User("Sanemi"));
        User.admins.add(new User("Giyu"));
        User.admins.add(new User("Tanjiro"));
        // System.out.println(users.get(0).get_name());
        // for (int i=0; i< User.admins.size(); i++){
        //     System.out.println(User.admins.get(i).get_name());
        // }
        // // or
        // for (User u : User.admins){
        //     System.out.println(u.get_name());
        // }
        User.print_admin_names();

        //INHERTIANCE
        System.out.println("\nINHERITANCE");
        Student s = new Student();
        s.set_name("student");
        System.out.println(s.get_verified());
        s.set_membership("Swordsman");
        System.out.println(s.get_membership());

        //POLYMORPHISM
        System.out.println("\nINHERITANCE");
        Teacher t = new Teacher();
        t.set_name("teacher");
        User.admins.add(s);
        User.admins.add(t);

        for (User _u : User.admins){
            _u.verify();
        }
    }
}
