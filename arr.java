import java.text.DecimalFormat;
import java.util.Scanner;
public class arr {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.print(display(n, a));
  }
  public static double display(int n, int[] a) {
    int count = 0, sum = 0, n1 = 0, d = 0;
    int count1 = 0;
    double avg = 0;
    for (int i = 2; i < n; i++) {
      count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0) {
          count++;
        }
      }
      if (count == 2) {
        sum = sum + a[i];
        count1++;
      }
    }
    avg = (double) (sum) / count1;
    DecimalFormat df = new DecimalFormat("#.00");
    double ddd = Double.parseDouble(df.format(avg));
    return ddd;
  }
}