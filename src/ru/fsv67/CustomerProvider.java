package ru.fsv67;

/**
 * Система регистрации пользователей
 */
public class CustomerProvider {
    private Database database;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password) {
        return new Customer();
    }
}
