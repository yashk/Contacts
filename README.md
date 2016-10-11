# Problem statements

# Search through Contacts
## Guidelines
You can use any programming language to solve this. Give references for parts of code not owned by you.If you make any assumptions mention them explicitly at the beginning of your code in comments.
## Evaluation Criteria
We will evaluate your code on the following points:
Structure of code
You've written clean, re-usable functions
Your code is well-documented
You have used appropriate data-structures to solve the problem
Your code passes our test cases
(BONUS) You have written test-cases for the code
(BONUS) You have written a Makefile for the code
(BONUS) You have handled user-input errors in your code.
## Problem:
```
You have to make a Contacts application which supports following two operations:
Add contact
Search Contact
Contact is defined as firstName and/or lastName separated by space. Some examples of valid contacts are:
Chris Harris
Chris Cairns
Harry Potter
Chris
Add contact should take the name and add it to contact list so that it becomes searchable.
Search contact should match the contacts for a given search string.
Expected Program Run:
1) Add contact 2) Search 3) Exit
1
Enter name: Chris Harris
1) Add contact 2) Search 3) Exit
1
Enter name: Chris
1) Add contact 2) Search 3) Exit
2
Enter name: Ch
Chris Harris
Chris
1) Add contact 2) Search 3) Exit
2
Enter name: Chris
Chris
Chris Harris
1) Add contact 2) Search 3) Exit
3
Happy Searching
Each contact can be upto 50 characters.
BONUS Points:
1) If you rank exact matches higher than other matches i.e. in the above run when we searched for Chris, Chris was printed before Chris
Harris.
2) If you allow searching by last name, In the above example If Ha is searched then Chris Harris should be the printed.
3) If exact match is not there for the searched string then order doesn't matter.
How to submit task:
Submit your code as a tarball via email or link to your github repo.
Provide clear instructions to run your program. We will exactly follow the same steps. Be succinct in this step.
Best of Luck!
```
# Solution
Simple Command Line Application to Manage Contacts

## Requirements
```
git
jdk 1.8
maven 3.x
```

## Running the application
```
$ git clone https://github.com/yashk/Contacts.git
$ cd Contacts
$ mvn verify -Pmain -DskipTests=true -q
1) Add contact 2) Search 3) Exit
1
Enter name:yash
1) Add contact 2) Search 3) Exit
2
Enter name:ya
yash
1) Add contact 2) Search 3) Exit
3
Happy Searching
```
## Running tests
```
cd Contacts
mvn test
```

