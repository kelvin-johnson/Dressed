# Dressed
Coding exercise for STATS
1. You will get a prompt after running the application: >>> 
2. At the prompt you may enter commands to to tell the "person" the order in which to get dressed and when to leave
3. 1 - hat, 2 - Pants, 3 - Shirt, 4 - Shoes, 5 - Socks, 6 - Leave
4. Enter all commands on one line with no spaces
6. The application should obey the following rules

1. Socks, Pants and Shirt may be put on in any order
2. Socks and Pants must be put on before shoes
3. A Shirt must be put on before a hat
4. A Hat is optional.  All other clothing items are mandatory.
5. The person must leave after getting dressed
6. The person must leave when receiving the leave command '6'
7. Any violation should output fail and stop

I envisioned this using a state machine.  this is not strictly necessary.  However the challenge said to write production
level code that would be maintained.  I figured that a state machine may be easier to maintain than ad-hoc code if the 
requirements became more complex.  However, I spent too much time desinging the solution and did not save enough time to
enter the code.
