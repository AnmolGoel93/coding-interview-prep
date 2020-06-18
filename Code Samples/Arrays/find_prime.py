import math

def printPrime(n):
    prime = [True for i in range(n+1)]
    for divisor in range(2, int(math.sqrt(n)) + 1):
        if(prime[divisor]):
            for i in range(2*divisor, n+1, divisor):
                prime[i] = False
    for i in range(2, n+1):
        if(prime[i]):
            print(i, end = " ")
    print()
    print("No of primes:",prime.count(True))

printPrime(int(input()))
