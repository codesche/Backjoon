iyear = int(input())

if (iyear % 4 == 0) and (iyear % 400 == 0):
    print("1")
elif (iyear % 4 == 0) and (iyear % 100 != 0):
    print("1")
elif (iyear % 400 == 0):
    print("1")
elif (iyear % 100 == 0) and (iyear % 400 != 0):
    print("0")
elif (iyear % 4 != 0) or (iyear % 4 != 0):
    print("0")
