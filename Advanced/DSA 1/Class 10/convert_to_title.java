public class convert_to_title {

    public String convertToTitle(int A) {

        String str = "";

        while (A != 0) {

            str = (char) ((A - 1) % 26 + 'A') + str;
            A = (A - 1) / 26;
        }

        return str;
    }
}
