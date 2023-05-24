import java.util.List;

public class User {
    private String name;
    private String membership;
    public static List<User> admins;
    private boolean verified = false;

    void verify(){
        System.out.println("Verifying...");
        set_verified(true);
    }

    void set_verified(boolean verified){
        this.verified = verified;
    }

    boolean get_verified(){
        return this.verified;
    }

    // STATIC METHOD
    public static void print_admin_names(){
        for (User u : admins){
            System.out.println(u.get_name());
        }
    }

    public User(String name){
        set_name(name);
    }

    // METHOD OVERRIDING
    public String toString(){ //to solve toString() issue
        //  return name + " " + membership; dont do this
        // always use setter and getter method
        return get_name() + " " + get_membership(); 
    }

    // METHOD OVERRIDING
    public boolean equals(User u2){
        if (get_name() == u2.get_name()
                && get_membership() == u2.get_membership()) {
            return true;
        } else {
            return false;
        }
    }

    public User(){ // to solve below contructor issue
        name = "tanjiro";
        membership = "Swordsman";
    }
    
    // CONSTRUCTOR (SHOULD MATCH FILE NAME)
    public User(String name, String membership) { 
        //never do this
        // this.name = name;
        // this.membership = membership;
        // instead do this, use setter and getter method
        set_name(name);
        set_membership(membership);
        //how ever creating new object variable without attributes will cause error
        // User u = new User(); this will error
    }

    //SETTER METHOD
    //void means it will not return anything
    void set_name(String name){ 
        this.name = name; // this.name refer to private String name
        // can also rename to _name, so it will me _name = name
    }

    //GETTER METHOD
    String get_name(){ 
        return this.name;
    }

    void set_membership(String membership){
        this.membership = membership;
    }

    // METHOD OVERLOADING
    void set_membership(Membership membership){ 
        this.membership = membership.name();
    }

    public enum Membership{
        Hashira, Trainer, Swordsman
    }

    String get_membership(){
        return this.membership;
    }
}
