public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() throws Exception {
        try {
            int count = 0;
            for (int a = 0; a < name.length(); a++) {
                if (Character.isWhitespace(name.charAt(a))) {
                    count++;
                }
            }

            if (!name.startsWith(" ") && !name.endsWith(" ") && name.length() >= 3 && name.length() <= 19 && count == 1) {
                return true;
            }
        } catch (Exception exception)
            {System.out.println("Name to emboss was null");}
        return false;
    }
}