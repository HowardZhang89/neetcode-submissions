class Solution {
    public int numRescueBoats(int[] people, int limit) {
        // sort by weight ascending
        // greedy algorithm:
            // take a heavy person, find a light person
            // we know no future heavy person will be heavier
        // two pointer solution
        int boats = 0;
        Arrays.sort(people);
        int l = 0; int r = people.length - 1;
        while(l <= r){
            boats++;
            if(people[r] + people[l] > limit){
                r--;
            }else{ // people[l] + people[r] <= limit
                r--; 
                l++;
            }
        }
        return boats;

    }
}