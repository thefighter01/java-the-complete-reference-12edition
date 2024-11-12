package version1;

public class SwithWithArrows {
    public static void main(String[] args) {
        int up , down , left ,right ;
        up = down= left = right = 0;

        char direction = 'R';

        switch (direction) {
            case 'L' ->{
                System.out.println("move left");
                left++;
            }
            case 'R' ->{
                System.out.println("move right");
                right++;
            }
            case 'U' ->{
                System.out.println("move up");
                up++;
            }
            case 'D' ->{
                System.out.println("move down");
                down++;
            }
        }

        System.out.println(right);
    }
}
