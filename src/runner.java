public class runner {
    public static void main(String[] args) {
        System.out.println(icyHot(30,40));
        int[] x = {1,1,2,2,1};
        System.out.println(noTriples(x));
        System.out.println(helloName("Maria"));
        int[] y = {1,2,3};
        System.out.println(sum3(y));
        System.out.println(luckySum(1, 2, 3));
        System.out.println(catDog("catdog"));
        System.out.println(equalIsNot("This is not"));
        System.out.println(nearTen(16));
        int[] z = {1,2,3};
        System.out.println(no14(z));
        System.out.println(seriesUp(3));
    }



    //IcyHot warm up 1
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

//NoTriples warm up 2
public static boolean noTriples(int[] nums) {
    for (int i=0; i < (nums.length-2); i++) {
        int first = nums[i];
        if (nums[i+1]==first && nums[i+2]==first){
            return false;
        }
    }
    return true;
}

//HelloName string 1
public static String helloName(String name) {

        return "Hello " + name + "!";
}

//sum3 array 1
public static int sum3(int[] nums) {
    int sum = nums[0] + nums[1] + nums[2];
    return sum;
}

    //luckySum logic 2
    public static int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13){
            b = 0;
            c = 0;
            sum = 0;
        }
        if (b == 13){
            c = 0;
            sum += a;
        }
        if (c == 13){
            sum = a + b;
        }

        if (a != 13 && b != 13 && c != 13){
            sum = a + b + c;
        }
        return sum;
    }

    //catDog string 2
    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;

        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals("t") && str.substring(i-1,i).equals("a") && str.substring(i-2,i-1).equals("c")){
                cat ++;
            }
        }
        for(int j=0; j<str.length(); j++){
            if(str.substring(j,j+1).equals("g") && str.substring(j-1,j).equals("o") && str.substring(j-2,j-1).equals("d")){
                dog ++;
            }
        }
        if(cat == dog){
            return true;
        }else
            return false;
    }

    //equalIsNot string 3
    public static boolean equalIsNot(String str) {
        int is = 0;
        int not = 0;

        for(int i=0; i<str.length(); i++){
            if(str.substring(i,i+1).equals("s") && str.substring(i-1,i).equals("i")){
                is ++;
            }
        }
        for(int j=0; j<str.length(); j++){
            if(str.substring(j,j+1).equals("t") && str.substring(j-1,j).equals("o") && str.substring(j-2,j-1).equals("n")){
                not ++;
            }
        }
        if(not == is){
            return true;
        }else
            return false;
        }

        //nearTen logic 1
    public static boolean nearTen(int num) {
        if (num % 10 <= 2 || num % 10 >= 8){
            return true;
        }else{
            return false;
        }
    }
//array 2 no14
public static boolean no14(int[] nums) {
    boolean no1 = true;
    boolean no4 = true;

    for (int i = 0; i < nums.length; i++){
        if(nums[i] == 1){
            no1 = false;
        }
        if(nums[i] == 4){
            no4 = false;
        }
    }
    return no1 || no4;
}


    //array 3 seriesUp
    public static int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int num = 0;
        for (int i = 1; i <= n; ++i)
            for (int j = 1; j <= i; ++j)
                result[num++] = j;
        return result;
    }












}
