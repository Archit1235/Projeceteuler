d = 1
m = 1
y = 1901
md = 31
days = 2
s = 0

while (d < 32 and m < 13 and y < 2001):
    # print (d, m, y)
    if m == 2:
        if (y % 100 != 0 and y % 4 == 0) or (y % 100 == 0 and y % 400 == 0):
            md = 29
        else:
            md = 28
    elif m == 4 or m == 6 or m == 9 or m == 11:
        md = 30
    elif m == 1 or m == 3 or m == 5 or m == 7 or m == 8 or m == 10 or m == 12:
        md = 31
    if d == 31 and m == 12:
        y += 1
        m = 1
    if d == md:
        d = 0
        m += 1
    if days % 7 == 0:
        days = 0
        if d == 1:
            s += 1
            print (d, m, y)
    d += 1
    days += 1
print(s)