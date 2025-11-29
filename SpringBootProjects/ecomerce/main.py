def fib(n):
    if n <= 1: return 1
    return fib(n-1) + fib(n - 2)

def fib2(n):
    a = 0
    b = 1
    while( n > 0):
        a, b = b, a + b
        n -= 1
    return b


def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(0, n-i-1):
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
    return arr


arr = [64, 34, 25, 12, 22,  90, 11,  88]
print("Unsorted array:", arr)
sorted_arr = bubble_sort(arr)
print("Sorted array:", sorted_arr)


