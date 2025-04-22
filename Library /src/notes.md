pushing the code (as usual):

git add .
git commit -m "Updates in code"
git push


ENUMs are constants and not strings! 

Library:

- list of books will be done via a List (done for the moment)

- user needs to ask for a book; (now I need to compare user's input to the book list)
- program checks whether the book is available or exists in the library;
- then, program checks whether the book is available for borrowing;
- then, a user gets the book and it is unavailable anymore;

To do:

1. I want to print out all the available books to a user in order he could choose one.  [x]
    1.1. There is some issue with the override which I need to get into later       [x]

2. Now, a user needs to pick up a book and write its name in the terminal. Then the program will check whether this book is in the list. [x]

3. If a user types a book not in the inventory, the program stops. Needs fixing. [x]

4. Need to implement the way for a book to be borrowed out. [x]

5. The program now tells that a book is unavailable even if it has not been borrowed. []


