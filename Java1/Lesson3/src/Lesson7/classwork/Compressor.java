package Lesson7.classwork;

//4(3(ab)c) -> ababab
public class Compressor {

    private String str;

    public Compressor(String str) {
        this.str = str;
    }

    public String compress() {
        //aaaaab -> 5(a)
        for (int i = 0; i < str.length()-1; i++) {
            int cnt = 0;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
                cnt++;
                i++;
            }
            //cnt equal, i - cnt - start
            //конкатенация строк - сложение двух строк по символам
            //мама + мыла = мамамыла
            int a = 3; /*Integer.parseInt("124");*/
            if (cnt > 0) {
                str = str.substring(0, i - cnt) +
                        (cnt + 1) + '(' + str.charAt(i-1) + ')'+ str.substring(i + 1);
                return compress();
            }
        }
        return str;
    }
}