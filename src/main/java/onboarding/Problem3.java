package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        String stringNumber = "";
        int stringLength = 0;

        for (int i = 1; i <= number; i++) {
            stringNumber = Integer.toString(i);
            stringLength = stringNumber.length();

            for (int s = 0; s < stringLength; s++) {
                if (stringNumber.charAt(s) == '3') {
                    //
                }
            }
        }
        return answer;
    }
}
