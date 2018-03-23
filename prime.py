def prime (bilanganka):
    count = 0
    for i in range (1,bilanganka+1):
        if (bilanganka % i ==0):
            count+=1
    if(count==2):
        return "prime"
    else:
        return "not prime"

tes = prime(2)
print(tes)
#komentarkami