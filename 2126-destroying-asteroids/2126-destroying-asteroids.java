class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        
        Arrays.sort(asteroids);

        long currentMass = mass;
        for (long a : asteroids) {
            if (currentMass < a) {
                return false;
            }

            currentMass += a;
        }

        return true;
    }
}