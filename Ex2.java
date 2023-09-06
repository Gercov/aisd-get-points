public class Ex2 {
  public static void main(String[] args) {
    int a = 6054;
    int b = 234;

    System.out.println(Ex2.run(a, b));
  }

  public static int run(int a, int b) {
    if (a <= 0 || b <= 0) {
      throw new IllegalArgumentException("a and b can't be negative or equals zero");
    } else {
      return ex2(a, b);
    }
  }

  public static int ex2(int a, int b) {
    if (b == 0) {
      return 0;
    }

    if (a == 0) {
      return 0;
    }

    if (a < b) {
      return ex2(b, a);
    }

    if (a % b == 0) {
      return b;
    }

    return ex2(b, a % b);
  }
}
