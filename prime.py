def prime (bilangank):
    count = 0
    for i in range (1,bilangank+1):
        if (bilangank % i ==0):
            count+=1
    if(count==2):
        return "prime"
    else:
        return "not prime"

tes = prime(2)
print(tes)

