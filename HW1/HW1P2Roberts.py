Python 3.12.1 (v3.12.1:2305ca5144, Dec  7 2023, 17:23:38) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> def report(xs):
...     people, apartments, trumax, tmpmax = 0, 0, 0, 0
...     for x in range(0, len(xs)):
...         if type(xs[x]) == str:
...             tmpmax += 1
...             people += 1
...         else:
...             apartments += 1
...             if trumax < tmpmax:
...                 trumax = tmpmax
...             tmpmax = 0
...     average = people / apartments
...     return average, trumax
... 
>>> def main():
...     print(report([100, "Jill Johnson", "Billy Ray Cyrus", 110, "Shweta Agarwal", 120, "Miguel Rosas", "Elena Rosas", "Mateo Rosas", 200, "Jason Chan", 210, "Rosalia Torress"]))
... 
...     
>>> main()
(1.6, 3)
