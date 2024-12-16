x = 10 # 1. set global x equal to 10
c = 10 # 2. set global c equal to 10

def spam ():
    c=14 # 4. create local c, set it equal to 14
    bbeans = 15 # 5. create local bbeans, set it equal to 15
    def inner ():
        c="funtimes!" # 9. create nested c, set it equal to "funtimes!"
        def innerinner():
            global a # 11. global access to variable a
            a=54 # set global a to 54
            nonlocal c # use nested c
            c=54 # set it equal to 54
            nonlocal bbeans # use local bbeans
            bbeans=68 # set local bbeans equal to 68
        innerinner() # 10. call innerinner
        print(c) # print nested c (54)
        return bbeans # return local bbeans
    print(x) # 6. print global x (10)
    print(c) # 7. print local c (14)
    return inner() # 8. call inner

print(spam()) # 3. call spam, return and print local bbeans (68)

"""
OUTPUT
10
14
54
68
"""
