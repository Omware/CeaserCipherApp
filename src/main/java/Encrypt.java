public class Encrypt {
    private int userKey;
    private String userInputText;
    public Encrypt(String InputText, int key) {
        userKey = key;
        userInputText = InputText;
    }
    public String getUserInputText() {
        return userInputText;
    }
    public int getUserKey() {

        return userKey;
    }
    public boolean checksValidity()
    {
        char[] chars = userInputText.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }
        return true;
    }
    public boolean checksKeyValidity()
    {
        return userKey >0 && userKey < 26;

    }

}
