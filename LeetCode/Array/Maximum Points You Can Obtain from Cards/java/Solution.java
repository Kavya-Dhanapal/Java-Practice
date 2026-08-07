class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int totalSum = 0;
        for (int num : cardPoints) {
          totalSum += num;
        }

        int Size = n - k;

        if (Size == 0) {
            return totalSum;
        }

        int Sum = 0;

        for (int i = 0; i < Size; i++) {
            Sum += cardPoints[i];
        }

        int min = Sum;

        for (int i = Size; i < n; i++) {
            Sum += cardPoints[i];
            Sum -= cardPoints[i - Size];

            min = Math.min(min,Sum);
        }

        return totalSum - min;
    }
}