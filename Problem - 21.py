def d(x):
    s = 0
    for i in range(1, int(x/2) + 1):
        if x % i == 0:
            s += i
    return s

ami = 0
for i in range(1, 10001):
    if d(d(i)) == i and i != d(i):
        ami += i
print (ami)