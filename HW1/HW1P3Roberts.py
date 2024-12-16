Python 3.12.1 (v3.12.1:2305ca5144, Dec  7 2023, 17:23:38) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> def partition(input, p, r):
...     pivot = input[r];
...     while p < r:
...         while input[p] < pivot:
...             p += 1
...         while input[r] > pivot:
...             r -= 1
...         if input[p] == input[r]:
...             p += 1
...         elif p < r:
...             tmp = input[p]
...             input[p] = input[r]
...             input[r] = tmp
...     return r
... 
>>> def quicksort(input, p, r):
...     if p < r:
...         j = partition(input, p, r)
...         quicksort(input, p, j-1)
...         quicksort(input, j+1, r)
... 
>>> def main():
...     input = [500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
...     print("Input: ")
...     print(input)
...     quicksort(input, 0, 9)
...     print("Output: ")
...     print(input)
...     return
... 
>>> main()
Input: 
[500, 700, 800, 100, 300, 200, 900, 400, 1000, 600]
Output: 
[100, 200, 300, 400, 500, 600, 700, 800, 900, 1000]
