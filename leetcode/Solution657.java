public class Solution657 {
    public boolean judgeCircle(String moves) {
        int[] directions = new int[2];
        for(int i=0; i<moves.length(); i++){
            switch(moves.charAt(i)){
                case 'U':
                    directions[0]++;
                    break;
                case 'D':
                    directions[0]--;
                    break;
                case 'L':
                    directions[1]++;
                    break;
                case 'R':
                    directions[1]--;
                    break;
                default:
                    // Do nothing
            }
        }
        if(directions[0] == 0 && directions[1] == 0)
            return true;
        else
            return false;
    }
}