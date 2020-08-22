public class UI {
    private static final String divider =
            "\t------------------------------------------------------------------\n";

    protected void printDivider() {
        System.out.print(divider);
    }

    protected void printDividerWithSpacing() {
        System.out.println(divider);
    }

    protected void greetUser() {
        String logo =
                "\t __\n"
                        + "\t/ _|   ___    ___  _   _  ___\n"
                        + "\t| |_  / _ \\  / __|| | | |/ __|\n"
                        + "\t|  _|| (_) || (__ | |_| |\\__ \\ _\n"
                        + "\t|_|   \\___/  \\___| \\__,_||___/(_)\n";
        System.out.println("Welcome to\n" + logo);
        String greetings = divider
                + "\t\"\\(*^O^*) I am Pocus, your personal assistant!"
                + "\n\tBefore we start, may I know your name?\n"
                + divider;
        System.out.println(greetings);
    }

    protected void addressUser(String name) {
        String address = divider
                + "\tHi there, " + name + "!"
                + "\n\tHow can I help you today?\n"
                + divider;
        System.out.println(address);
    }

    protected void exitFocus() {
        String exit = "\tHopefully I have helped you today. Byeee! (*^O^*)/\"\n"
                + divider;
        System.out.println(exit);
    }
}