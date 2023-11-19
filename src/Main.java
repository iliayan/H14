public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу UserDao
        UserDao userDao = new UserDao();

        // Додаємо користувачів
        userDao.addUser(new User("John"));
        userDao.addUser(new User("Jane"));

        // Виводимо початковий стан масиву
        System.out.println("Початковий стан масиву:");
        userDao.getUsers().forEach(System.out::println);

        // Розвертаємо елементи масиву
        userDao.reverseUsers();

        // Виводимо розвернутий масив
        System.out.println("\nРозвернутий масив:");
        userDao.getUsers().forEach(System.out::println);
    }
}