package matrix;

import java.util.ArrayList;

public class HillChipper {
    final String privateKey = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890 \n\t";
    final String zeroKeyCode = "F";
    final String randomKey[] = {"A", "B", "C", "D", "E"};
    final Integer encryptKeyPair[][] = {
        {2,3},
        {1,2}
    };

    public Integer getKeyPairIndex(String keyText) {
        String splitedKey[] = this.privateKey.split("");
        for (int i = 0; i < splitedKey.length; i++) {
            if(splitedKey[i].equals(keyText)) {
                return i;
            }
        }
        return  null;
    }

    public String generateRandomKey(Integer length) {
        String keyResult = "";
        for(int i = 1; i <=  length; i++) {
            keyResult += this.randomKey[(int) (Math.floor(Math.random() * (this.randomKey.length - 1)) + 1)];
        }
        return  keyResult;
    }

    public String generateSignatureKey(String keyText) {
        String resultText = keyText.replaceAll("0", this.zeroKeyCode);
        if(resultText.length() < 4) {
            return "" + generateRandomKey(4 - keyText.length()) + resultText;
        }
        return resultText;
    }





    public String encrypt(String source) {

        String fileToArray[] = source.split("");
        Integer mapedMatrix[][] = {{0,0}, {0, 0}};
        ArrayList<Integer> fileToNum = new ArrayList<>();

//        for(int i = 0; i < fileToNum.size() / 2; i++) {
//            if(i < fileToNum.size())
//        }


        return "12";
    }
}
