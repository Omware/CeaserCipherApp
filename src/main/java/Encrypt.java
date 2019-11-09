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
}
