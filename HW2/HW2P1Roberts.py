def scope_test():
    def do_local():
         spam = "local spam" # 4. create a nested spam, set it to "local spam"
    def do_nonlocal():
        nonlocal spam # 7. gain access to (non)local spam
        spam = "nonlocal spam" # 8. set (non)local spam equal to "nonlocal spam"
    def do_global():
        global spam # 11. gain global access to spam
        spam = "global spam" # 12. create a global spam equal to "global spam"
    spam = "test spam" # 2. create local spam, set it to "test spam"
    do_local() # 3. call do_local
    print("After local assignment:", spam) # 5. first print of local spam
    do_nonlocal() # 6. call nonlocal
    print("After nonlocal assignment:", spam) # 9. second print of local spam
    do_global() # 10. call do_global
    print("After global assignment:", spam) # 11. third print of local spam
scope_test() # 1. Call scope_test
print("In global scope:", spam) # 12. fourth print of global spam

"""
Output
After local assignment: test spam
After nonlocal assignment: nonlocal spam
After global assignment: nonlocal spam
In global scope: global spam
"""
