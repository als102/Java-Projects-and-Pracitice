package learnprogramming;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount >=0 && smallCount >=0 && goal >=0) {
            while (bigCount*5 > goal){
                bigCount --;
            }
            if (bigCount*5 == goal){
                return true;
            }
            return (smallCount>= (goal - (bigCount*5)));
        }
        return false;
    }
}
