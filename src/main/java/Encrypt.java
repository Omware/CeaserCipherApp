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
    public String encrypt()
    {
        String encoded = "";
        String encodedArray[] = userInputText.split("");
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<encodedArray.length;i++)
        {
            if (userInputText.charAt(i) == ' ')
            {
                encoded += " ";
            }
            else
            {
                int charPosition = alphabet.indexOf(userInputText.charAt(i));
                int key = (userKey + charPosition) % 26;
                encoded += alphabet.charAt(key);
            }
        }
        return encoded.toUpperCase();
    }

}
