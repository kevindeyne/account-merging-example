# account-merging-example

Input:
Account(1, "John Doe", "Halifax", 1000)
Account(1, "John William Doe", "HLIFX, CA", 1000)
Account(1, "John W. Doe", "HLIFX", 0.89)
Account(2, "Rebecca Almaci", "Toronto", 2345)
Account(2, "Rebecca A", "TR, CA", 1)
Account(3, "Kevin Deyne", "Lake Forest, US", 123)


Output:
Account{id=1, customerName='John Doe', customerCity='Halifax', accountBalance=1000.89}
Account{id=2, customerName='Rebecca Almaci', customerCity='Toronto', accountBalance=2346}
Account{id=3, customerName='Kevin Deyne', customerCity='Lake Forest, US', accountBalance=123}
