n = 999
ones = ['one', 'two', 'three', 'four', 'five', 'six', 'seven', 'eight', 'nine']
tens = ['ten', 'twenty', 'thirty', 'forty', 'fifty', 'sixty', 'seventy', 'eighty', 'ninety']
teens = ['eleven', 'twelve', 'thirteen', 'fourteen', 'fifteen', 'sixteen',  'seventeen', 'eighteen', 'nineteen']

def one(i):
    global ones
    return len(ones[i - 1])
    
def ten(i):
    print(i)
    global tens
    global teens
    if(i == 0):
        return 0
    elif(i % 10 == 0):
        return len(tens[int(i/10) - 1])
    elif (i > 10 and i < 20):
        return teens[i%10 - 1]
    elif (i > 20 and i < 100):
        return len(tens[int(i/10) - 1]) + one(i%10)
        
sum = 0
for i in range (1, n + 1):
    if (len(str(i)) == 1):
        sum += one(i)
    elif (len(str(i)) == 2):
            sum += ten(i) 
    elif (len(str(i)) == 3):
        sum += one(i%10) + len('hundredand')
print(sum)