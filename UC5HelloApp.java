
public class UC5HelloApp {
    public static void main(String[] args) {

        StringBuilder names = new StringBuilder();


        if (args.length == 0) {
            names.append("World");
        }
        else {

            for (String name : args) {
                names.append(name).append(", ");
            }


            names.setLength(names.length() - 2);
        }


        System.out.println("Hello, " + names + "!");
    }
}