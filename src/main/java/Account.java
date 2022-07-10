public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {

        int count = 0;
        for (int a = 0; a < name.length(); a++) {
            if(Character.isWhitespace(name.charAt(a))) {
                count++;
                }
            }

        if (!name.startsWith(" ") && !name.endsWith(" ") && name.length() >= 3 && name.length() <= 19 && count == 1) {
            System.out.println("This name will be printed: " + name);
            return true;
        }
        System.out.println("This name cannot be printed: " + name);
        return false;
    }
}