def rotate(arr, n):
    last = arr[n - 1]
    
    for i in range(n-1, 0, -1):
        arr[i] = arr[i - 1]
    
    arr[0] = last
    
    
if __name__ == "__main__":
    
    arr = [1, 2, 3, 4, 5, 6]
    n = len(arr)
    print("Given array")
    print(arr)
    rotate(arr, n)
    print("Sorted array")
    print(arr)
    