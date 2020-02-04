public class Runner {
    //my main containing tests and output

    public static void main(String[] args) {

        System.out.print(helloName("Tenzin"));
        System.out.print(icyHot(100, 12));
        System.out.print(countXX("abcxx"));
        System.out.print(makeOutWord("<<>>", "Cookie"));
        int[] h = {2,3,5,4,3,2};
        int[] b = {5, 6, 7, 2};
        System.out.print(commonEnd(h,b));
        System.out.print(cigarParty(39, false));
        System.out.print(noTeenSum(12, 23, 9));
        System.out.print(catDog("catdog");
        int[] c = {1, 2, 7, 7};
        System.out.print(has77(c));
    }
    public static String helloName(String name) {
        return "hi" + name;
    }

    //warm up 1
    public static boolean icyHot(int Temp1, int Temp2) {
        if (( Temp1 > 100) && ( Temp2 < 0)){
            return true;
        }
        if ((Temp2 > 100) && (Temp1 < 0)){
            return true;
        }
        return false;
    }
    //warm up 2
    public static int countXX(String str){
        int xCounter = 0;
        for(int i =0; i<str.length()-1; i++) {
            if ( (str.substring(i, i+2).equals("xx")) ){
                xCounter = xCounter + 1;
            }
        }
        return xCounter;
    };
    //string 1
    public static String makeOutWord(String out, String word) {
        String startWord = out.substring(0, 2);
        String endWord = out.substring(2, 4);
        String outPut = startWord + word;
        outPut = outPut + endWord;
        return outPut;
    };
    //array 1
    public static boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        }
        if (a[a.length-1] == b[b.length-1]) {
            return true;
        }
        return false;
    };
    //logic 1
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend == false) {
            if ( (cigars < 40) || (cigars > 60)){
                return false;
            }
            return true;
        }
        if (isWeekend == true) {
            if (cigars < 40) {
                return false;
            }
            return true;
        }
        return true;
    };
    //logic 2
    public static int noTeenSum(int a, int b, int c) {
        int A = fixTeen(a);
        int B = fixTeen(b);
        int C = fixTeen(c);
        int outPut = A + B + C;
        return outPut;
    };
    public static int fixTeen(int n){
        if ( (n == 15) || (n == 16)) {
            return n;
        }
        int nothing = 0;
        if ( (n >= 13) && (n <= 19) ) {
            return nothing;
        }
        return n;
    };
    //string 2
    public static boolean catDog(String str) {
        int numOfCats = 0;
        int numOfDogs = 0;
        for(int i = 0; i<str.length()-2; i++) {
            if ( (str.substring(i) == "c") ){
                if (str.substring(i+1) == "a") {
                    if (str.substring(i+2) == "t") {
                        numOfCats = numOfCats + 1;
                    }
                }
            }
            if ( (str.substring(i) == "d") ){
                if (str.substring(i+1) == "o") {
                    if (str.substring(i+2) == "g") {
                        numOfCats = numOfCats + 1;
                    }
                }
            }
        }
        if (numOfCats == numOfDogs) {
            return true;
        }
        return false;
    };
    //array 2
    public static boolean has77(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if ( (nums[i] == 7 ) && (nums[i + 2] == 7) ){
                return true;
            }
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7) {
                if (nums[i + 1] == 7) {
                    return true;
                }
            }
        }
        return false;
    };
    //array 3
    public static int maxSpan(int[] nums) {

    };




}
