// find the maximum of the array values
public static double max(double[] a) {
    double max = a[0];
    for (int i = 1; i < a.length; i++) {
    	if (a[i] > max) max = a[i];
    }
    return max;
}
// compute the average of the array values
public static double average(double[] a) {
    int N = a.length;
    double sum = 0.0;
    for (int i = 0; i < N; i++) {
    	sum += a[i];
    }
    return sum / N;
}
// copy to another array
public static double[] copy(double[] a) {
    int N = a.length;
    double[] b = new double[N];
    for (int i = 0; i < N; i++) {
    	b[i] = a[i];
    }
    return b;
}
// reverse the elements within an array
public static void reverse(double[] a) {
    int N = a.length;
    for (int i = 0; i < N / 2; i++) {
    	double tmp = a[i];
	a[i] = a[N - 1 - i];
	a[N - i - 1] = tmp;
    }
}
// matrix-matrix multiplication
public static double multiply(double[] a, double[] b) {
    int N = a.length;
    double[][] c = new double[N][N];
    for (int i = 0;i < N; i++) {
    	for (int j = 0; j < N; j++) {
	    for (int k = 0; k < N; k++) {
	    	c[i][j] += a[i][k] * b[k][j];
	    }
	}
    }
    return c;
}
