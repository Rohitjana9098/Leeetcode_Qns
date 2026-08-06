class Solution {

    int total_products = 1;
    int total_sum = 0;

    public int subtractProductAndSum(int n) {

        // Base case
        if (n == 0)
            return total_products - total_sum;

        int d = n % 10;

        total_products *= d;
        total_sum += d;

        return subtractProductAndSum(n / 10);
    }
}