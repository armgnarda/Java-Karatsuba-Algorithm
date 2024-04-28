# Java-Karatsuba-Algorithm
This repository contains an implementation of the Karatsuba multiplication algorithm in Java. Karatsuba algorithm is a fast multiplication algorithm that utilizes divide-and-conquer approach to efficiently multiply large integers. The code demonstrates how to implement the Karatsuba algorithm recursively to multiply two large numbers.

Let x and y be large int numbers

x = a.10^2 + b
y = c.10^2 + d

x.y = (a.10^n/2 + b).(c.10^n/2 + d)
    = a.c.10^n/2.10^n/2 + a.d.10^n/2 + b.c.10^n/2 + b.d
    = a.c.10^n + (a.d + b.c).10^n/2 + b.d

z2 = a.c
z1 = a.d + b.c --> (a + b).(c + d) - a.c - b.d => a.d + b.c
z0 = b.d

If we substitute into the above equation;

 = z2.10^n + z1.10^n/2 + z0  --> this give you result

Karatsuba multiplication algorithm was developed by Soviet mathematician Anatolii Alexeevitch Karatsuba in the 1960s. The purpose of this algorithm is to efficiently multiply large numbers. While traditional multiplication algorithms have a complexity of n^2, the Karatsuba algorithm can perform the multiplication of large numbers in O(n^log3) complexity when used recursively, which translates to nearly O(n^1.585) complexity. Therefore, the Karatsuba algorithm provides a more efficient solution, especially when working with large numbers.
