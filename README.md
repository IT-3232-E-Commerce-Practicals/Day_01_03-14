# IT 3232 - E-Commerce Practical (Day 01-Java Basics)

This repository contains Java programs for basic coding exercises related to the IT 3232 E-Commerce practical session. The activities focus on **loops, object-oriented programming (OOP) concepts**, and **data structures**.

---

## **1. Print a Message**
- A simple Java program to print a message to the console.
  ```sh
    Output: Hello World!
---

## **2. Print Numbers from 1 to 10**
- Uses a loop to print numbers from **1 to 10**.
  ```sh
   Output: 1 2 3 4 5 6 7 8 9 10
---

## **3. Print Numbers in Reverse**
- Uses a loop to print numbers from **10 to 1**.
     ```sh
     Output: 10 9 8 7 6 5 4 3 2 1

---

## **4. Print Odd Numbers between 1 to 20**
- Uses a loop to print all odd numbers between **1 and 20**
    ```sh
     Output: 1 3 5 7 9 11 13 15 17 19.

---

## **5. Reverse the Left and Right Numbers**
- Input: A number **N**
- Output: The first half of numbers (from **N/2 to 1**) is reversed, and the second half (from **(N/2) + 1 to N**) remains in normal order.
    ```sh
     Example:
        Input: 9  
        Output: 4 3 2 1 5 9 8 7 6  

        Input: 13  
        Output: 6 5 4 3 2 1 7 13 12 11 10 9 8  
  
---

## **6. Student Class Implementation**
- Creates a **Student** class with attributes like **name, ID, and marks**.
- Stores **5 student objects** in a suitable data structure.
- Computes the **average marks** of all students.
  ```sh
  Example: 

  Name: Dilki
  Average of Dilki is: 85.00
  ----------------------------------------
  Name: Malki
  Average of Malki is: 75.0
  ----------------------------------------
  Name: Pinki
  Average of Pinki is: 90.45560
  ----------------------------------------
  Name: Dhammika
  Average of Dhammika is: 99.000
  ----------------------------------------
  Name: Kulathunga
  Average of Kulathunga is: 98.8754
  ----------------------------------------
---

## **7. Library System using OOP Principles**
This program implements an **OOP-based library system** with:
- **Inheritance**: Different types of books - `PrintedBook`, `EBook`, `AudioBook`.
- **Polymorphism**: Methods like `displayDetails()` overridden in each book type.
- **Encapsulation**: Private variables with getters and setters.
     ```sh
      Example:  
      Library Collection:  

        Printed Book: J.K. Rowling by Harry Potter and the Sorcerer’s Stone, Year: 1997, Pages: 309 , Popular Pages: 371
        E-Book: Dan Brown by The Da Vinci Code, Year: 2003, Pages:500 
        Audio Book: Malala Yousafzai by I Am Malala, Year: 2013, Pages:345 , Duration: 12.0 hours 

---

## **8. Retail Store Management System**
A **Retail Store** program that allows:
- **Adding, Editing, and Deleting Products** like fruits, vegetables, grocery, etc.
- **Displaying available products** with details such as **name, price, and quantity**.
  ```sh
         Example:  

         Products in the Store:  
         Fruit: Banana | Price: 160.0 | Quantity: 10
         Vegetable: Tomato | Price: 245.0 | Quantity: 5  
         Grocery: Sugar | Price: 300.0 | Quantity: 1 

           -----------------------------------------------  
         After editing Banana:  

         Products in the Store:  
         Fruit: Banana | Price: 200.0 | Quantity: 12  
         Vegetable: Tomato | Price: 245.0 | Quantity: 5 
         Grocery: Sugar | Price: 300.0 | Quantity: 1  

          -----------------------------------------------  
         After deleting Tomato:  

         Products in the Store:  
         Fruit: Banana | Price: 200.0 | Quantity: 12 
         Grocery: Sugar | Price: 300.0 | Quantity: 1  

---

## **How to Run the Programs**
1. Clone the repository:
   ```sh
   git clone https://github.com/IT-3232-E-Commerce-Practicals/Day_01_03-14
2. Navigate to the project directory.
3. Compile and run Java files using:

   - javac filename.java
   - java filename
