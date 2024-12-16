Python 3.12.1 (v3.12.1:2305ca5144, Dec  7 2023, 17:23:38) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> list = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
>>> every3rdfrom2nd = list[1::3]
>>> print(every3rdfrom2nd)
[1, 4, 7]
>>> list += ["10", "11", "12"]
>>> print(list)
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, '10', '11', '12']
>>> intstostrings = [str(ints) for ints in list if type(ints) == int]
>>> print(intstostrings)
['0', '1', '2', '3', '4', '5', '6', '7', '8', '9']
