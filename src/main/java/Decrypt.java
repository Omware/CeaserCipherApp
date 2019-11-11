public class Decrypt {
    private int userKey;
    private String userInputText;
    public Decrypt(String InputText, int key) {
        userKey = key;
        userInputText = InputText;
    }
    public String getUserInputText() {
        return this.userInputText;
    }
    public int getUserKey() {

        return this.userKey;
    }
    public String getDescription() {

        String decodedValue = "";
        String newArr[] = userInputText.split("");
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i<newArr.length;i++)
        {
            if (userInputText.charAt(i) == ' ')
            {
                decodedValue += " ";
            }
            else
            {
                int charPosition = letters.indexOf(userInputText.charAt(i));
                int keyVal = (charPosition - userKey) % 26;

                if (keyVal < 0)
                {
                    keyVal = letters.length() + keyVal;
                }

                char replaceValue = letters.charAt(keyVal);
                decodedValue += replaceValue;
            }
        }
        return decodedValue;
    }
}


