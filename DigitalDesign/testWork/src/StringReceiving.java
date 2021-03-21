public class StringReceiving {

    private StringBuilder finishdString = new StringBuilder();

    private boolean flag = true;

    public String computetation(String string) {
        computetationString(string);
        return finishdString.toString();
    }

    private String computetationString(String string) {
        String newLocalString = string + " ";
        int i = 0;

        while (newLocalString.charAt(i) != ' ' && flag) {
            if (newLocalString.charAt(i) == ']') {
                subLocalString(newLocalString, i);
            }
            i++;
        }
        if (flag) finishdString.append(newLocalString.trim());
        flag = false;
        return newLocalString.trim();
    }

    private void subLocalString(String localString, int indexEnd) {
        String localBuilderString = "";
        int indexLocalEnd = indexEnd + 1;
        int indexLocalStart = 0;
        indexEnd--;

        while (localString.charAt(indexEnd) != '[') {
            localBuilderString = localString.charAt(indexEnd) + localBuilderString;
            indexEnd--;
        }

        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localBuilderString);

        for (int i = 0; i + 1 < Integer.parseInt(localString.substring(indexEnd - 1, indexEnd)); i++) {
            localStringBuilder.append(localBuilderString);
        }
        indexLocalStart = indexEnd - 1;

        if (indexLocalEnd == localString.length() && indexLocalStart == 0 && flag) {
            computetationString(localStringBuilder.toString());
        } else if (indexLocalEnd == localString.length() && flag) {
            computetationString(localString.substring(0, indexLocalStart) + localStringBuilder.toString());
        } else if (indexLocalStart == 0 && flag) {
            computetationString(localStringBuilder.toString() + localString.substring(indexLocalEnd));
        } else if (flag) {
            computetationString(localString.substring(0, indexLocalStart) + localStringBuilder.toString() + localString.substring(indexLocalEnd));
        }
    }

}
