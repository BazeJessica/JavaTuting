package tutorialpoint.Test;

public class Test {
    public static void main(String[] args) {
        
            int n = 10;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    if (i % j == 0) {
                        count = count +1;
                    }
                    if(count ==2){
                        System.out.print(i);
                    }
    
                }
            }
        
    }
}
