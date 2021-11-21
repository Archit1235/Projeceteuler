f1 = 1
f2 = 1
temp = 1
n = 1
while(len(str(f2)) < 1000):
    # print(f2)
    temp = f1
    f1 = f2
    f2 = temp + f1
    n += 1
print(n+1)