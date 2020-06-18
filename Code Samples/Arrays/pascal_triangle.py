def pascal(n):
    arr = [[1]]
    for i in range(1,n):
        temp = []
        temp.append(1)
        for j in range(1,i):
            temp.append(arr[i-1][j-1] + arr[i-1][j])
        temp.append(1)
        arr.append(temp)
        
    for i in arr:
        print(i)


if __name__ == "__main__":
    n = int(input())
    pascal(n)
