import java.math.BigInteger;

public class Karatsuba {

	public static void main(String[] args) {
	BigInteger x = new BigInteger("12345678901234567890");
        BigInteger y = new BigInteger("98765432109876543210");

        BigInteger result = karatsubaMultiply(x, y);
        System.out.println("Sonuç: " + result);

	}
	public static BigInteger karatsubaMultiply(BigInteger x, BigInteger y) {
        int n = Math.max(x.bitLength(), y.bitLength());

        // Basic case of Karatsuba algorithm
        if (n <= 2000) {
            return x.multiply(y);
        }

        // Half of n for Karatsuba
        n = (n / 2) + (n % 2);

        // Dividing x and y into parts
        BigInteger a = x.shiftRight(n);
        BigInteger b = x.subtract(a.shiftLeft(n));
        BigInteger c = y.shiftRight(n);
        BigInteger d = y.subtract(c.shiftLeft(n));

        // Multiplication of three Karatsuba
        BigInteger ac = karatsubaMultiply(a, c);
        BigInteger bd = karatsubaMultiply(b, d);
        BigInteger adbc = karatsubaMultiply(a.add(b), c.add(d)).subtract(ac).subtract(bd);

        // Combining the results
        return ac.shiftLeft(2 * n).add(adbc.shiftLeft(n)).add(bd);
    }
}
