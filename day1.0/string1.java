public class string1 {
    public static void main(String[] args) {
        String name = "harsh"; // direct object created consider it as at index 103 in heap memory
        name = name + "singh"; //now we think that we have changed the exidting data of objext at index 103 in heap memory but what happens is it creates a new object and stores itself in new memory location i.e 104 so i have change the variable reference to 104 previous obejct is ready for garbage collection.
        String S1 = "harsh";// it will refer to index 103 since that have already harsh in its heap memory
        String S2 = "Harsh";// it will again create a new object again since Harsh is not in heap memory
    }
}
