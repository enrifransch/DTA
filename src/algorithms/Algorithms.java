package algorithms;

public class Algorithms {

    public static void cycle(int n) {

        String number = "1";
        System.out.println(number);

        for (int i = 0; i < n; i++) {
            number = lookAndSay(Long.parseLong(number));
            System.out.println(number);
        }
    }

    private static String lookAndSay(long number) {

        StringBuilder result = new StringBuilder();
        String str = number + "";

        int count = 1;
        int num = 0;
        boolean flag = false;

        for (int i=0; i < str.length(); i++) {

            num = Character.getNumericValue(str.charAt(i));
            count = 1;
            flag = false;

            if (i+1 == str.length()) {
                result.append(count + "" + num);
                return result.toString();
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (Character.getNumericValue(str.charAt(j)) == Character.getNumericValue(str.charAt(i))) {
                    count++;
                } else {
                    result.append(count + "" + num);
                    i = j - 1;
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                result.append(count + "" + num);
                return result.toString();
            }
        }

        result.append(count + "" + num);
        return result.toString();
    }
}
