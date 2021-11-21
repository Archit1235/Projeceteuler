file = open("name.txt", "r")
text = eval(f'[{file.read()}]')
file.close()

text.sort()

file = open("name.txt", "w")
file.write(str(text)[1:-1])
file.close()

score = 0
for i in range(len(text)):
    x = 0
    for j in range(len(text[i])):
        x += ord(text[i][j]) - 64
    score += x * (i+1)
print(score)