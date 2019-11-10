public class Decrypt {
    private int userKey;
    private String userInputText;
    public Decrypt(String InputText, int key) {
        userKey = key;
        userInputText = InputText;
    }
    public String getUserInputText() {
        return userInputText;
    }
    public int getUserKey() {

        return userKey;
    }
    public String getDecription() {

    }

}
