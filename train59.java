class train59 {
    public boolean containsPattern(int[] arr, int m, int k) {
        for (int i = 0; i <= arr.length - m * k; i++) {
            boolean ok = true;

            for (int j = 0; j < m * k; j++)
                if (arr[i + j] != arr[i + j % m])
                    ok = false;

            if (ok) return true;
        }

        return false;
    }
}