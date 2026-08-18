# Phone-Book
# 📖 Phone Book 

A simple console-based Phone Book application written in Java. It lets you manage contacts and their mobile numbers through an interactive, Persian-language command-line menu.

## ✨ Features

- ➕ Add a new contact
- 📱 Add up to 5 mobile numbers per contact
- ❌ Delete a contact
- 📋 Display all contacts and their numbers
- 🔁 Simple loop-based menu until the user exits

## 🗂 Project Structure

```
.
├── Main.java        # Entry point, handles the CLI menu and user input
├── PhoneBook.java    # Manages the collection of contacts (add, delete, list, lookup)
└── Contact.java       # Represents a single contact with a name and a list of mobile numbers
```

### Class Overview

- **`Contact`** — Stores a contact's name and up to 5 mobile numbers.
- **`Phone Book`** — Holds up to 10 contacts in an array. Provides methods to create, delete, retrieve, and display contacts.
- **`Main`** — Runs the interactive console menu, reads user input with `Scanner`, and calls the appropriate `Phone Book` methods.

## ⚙️ Requirements

- Java JDK 8 or higher

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/<your-repo>.git
   cd <your-repo>
   ```
2. Compile the source files:
   ```bash
   javac Main.java PhoneBook.java Contact.java
   ```
3. Run the program:
   ```bash
   java Main
   ```

## 🖥 Menu Options

```
===== دفترچه مخاطبین =====
1. افزودن مخاطب        → Add a contact
2. افزودن شماره به مخاطب → Add a number to a contact
3. حذف مخاطب           → Delete a contact
4. نمایش همه            → Show all contacts
0. خروج                → Exit
```

## 📌 Notes / Current Limitations

- Storage is in-memory only — all data is lost when the program exits.
- Fixed capacity: maximum **10 contacts**, each with up to **5 mobile numbers**.
- No input validation for phone number format.

## 🔮 Possible Improvements

- Persist contacts to a file or database
- Replace fixed-size arrays with `ArrayList` for dynamic capacity
- Add search/edit functionality
- Add phone number format validation

## 📄 License

This project is open source.
