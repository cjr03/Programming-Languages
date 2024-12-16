Python 3.12.1 (v3.12.1:2305ca5144, Dec  7 2023, 17:23:38) [Clang 13.0.0 (clang-1300.0.29.30)] on darwin
Type "help", "copyright", "credits" or "license()" for more information.
>>> def nqueens(n):
...     board = [[0 for x in range(n)] for x in range(n)]
...     solved = False
...     def solvenqueens(board, col, n):
...         def isvalid(board, row, col, n):
...             for horizontal in range(col):
...                 if board[row][horizontal] == 1: return False
...             blrow, blcol = row, col
...             ulrow, ulcol = row, col
...             while blcol != -1 and blrow != n:
...                 if board[blrow][blcol] == 1: return False
...                 blrow += 1
...                 blcol -= 1
...             while ulcol != -1 and ulrow != -1:
...                 if board[ulrow][ulcol] == 1: return False
...                 ulrow -= 1
...                 ulcol -= 1
...             return True
...         if col == n:
...             nonlocal solved
...             if solved == False: print(board)
...             solved = True;
...             return
...         for row in range(n):
...             if isvalid(board, row, col, n):
...                 board[row][col] = 1
...                 solvenqueens(board, col + 1, n)
...                 board[row][col] = 0
...     solvenqueens(board, 0, n)
... 
>>> nqueens(8)
[[1, 0, 0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 0, 1, 0], [0, 0, 0, 0, 1, 0, 0, 0], [0, 0, 0, 0, 0, 0, 0, 1], [0, 1, 0, 0, 0, 0, 0, 0], [0, 0, 0, 1, 0, 0, 0, 0], [0, 0, 0, 0, 0, 1, 0, 0], [0, 0, 1, 0, 0, 0, 0, 0]]
