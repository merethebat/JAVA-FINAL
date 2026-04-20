#  Gym Management System

Hi, my name is **Merethe Batino** and this is my Gym Management System project for my Java final sprint.

This project is basically a simple console-based system for managing a gym. It’s not anything fancy with a GUI or anything, but it covers the main things you’d expect in a gym system like users, memberships, workout classes, and gym shop items.

I built it using Java and PostgreSQL and tried to keep it structured using services and DAOs.

---

##  What the project does 

The system lets different types of users log in and do different things depending on their role:

- Admin
- Trainer
- Member

Each role has its own menu and options.

---

##  User Roles

###  Admin
Admins basically control everything in the system:
- View all users
- Delete users
- Add gym merchandise
- Check total membership revenue

---

###  Trainer
Trainers focus more on classes:
- Create workout classes
- View and manage classes
- Buy a membership
- View gym products

---

### Member
Members are normal users:
- View workout classes
- Buy memberships
- View gym merchandise
- Check how much they’ve spent

---

## What I used

- Java (console application)
- PostgreSQL for storing data
- DAO and Service layers (to separate logic a bit)
- Scanner for input
- File logging (logs some system actions)

---

##  Database 

The database has a few main tables:
- users
- memberships
- workout_classes
- gym_merch

Each table stores basic info needed for the system to work.

---

## How to run it

1. Clone the GitHub repo
2. Open it in VS Code or IntelliJ
3. Set up PostgreSQL and run the SQL file
4. Update the database connection in `DBConnection.java`
5. Run `Main.java`

---

## Things to note

- It’s a console-based project, so no GUI
- Some features are simplified (like payments and user tracking)
- I focused more on making the system work properly rather than making it look advanced
- It follows a basic layered structure (UI → Service → DAO → Database)

---

## Reflection 

At the start I found that the database and login system a bit confusing, especially connecting everything together, but after breaking it into smaller parts (services and DAOs), it became easier to manage.

---
