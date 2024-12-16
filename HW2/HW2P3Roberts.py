def foo(x):
    x[0]=55 # 3. ys = [55, 2, 3] 13. assignment error, range is a tuple object and is immutable
    x=11 # 4. create x with value 11
    return x # 5. return 11
def bar(xs):
    xs=[1, 2, 3] # 7. create xs, set it equal to [1, 2, 3] 15. create xs object equal to [1, 2, 3]
    xs[0]="squeegee" # 8. change xs to ["squeegee", 2, 3] 16. change xs to ["squeegee", 2, 3]
    return xs # 9. return xs # 17. return xs
ys=[[1, 2, 3], 2, 3] # 1. Create a nested list called ys
print(foo(ys)) # 2. Call foo, print 11
print(ys) # 5. print ys, [55, 2, 3]
print(bar(ys)) # 6. call bar, print ["squeegee", 2, 3]
print(ys) # 10. print ys, [55, 2, 3]
zs=range(0, 10) # 11. set zs equal to (0, ... , 10)
print(foo(zs)) # 12. call foo
print(zs) # 13. print zs, range(0, 10)
print(bar(zs)) # 14. call bar, print ["squeegee", 2, 3]
print(zs) # 15. print zs, range(0, 10)

"""
OUTPUT
11
[55, 2, 3]
['squeegee', 2, 3]
[55, 2, 3]
Traceback (most recent call last):
  File "<pyshell#10>", line 1, in <module>
    print(foo(zs))
  File "<pyshell#1>", line 2, in foo
    x[0]=55
TypeError: 'range' object does not support item assignment
range(0, 10)
['squeegee', 2, 3]
range(0, 10)
"""

