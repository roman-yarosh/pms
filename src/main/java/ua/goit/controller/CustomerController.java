package ua.goit.controller;

import ua.goit.model.dao.jdbc.JdbcCustomerDAO;
import ua.goit.model.entity.Customer;

import java.util.List;
import java.util.Optional;

public class CustomerController implements Controller<Customer, Long> {

    private JdbcCustomerDAO jdbcCustomerDAO = JdbcCustomerDAO.getInstance();

    @Override
    public Optional<Customer> read(Long key) {
        return jdbcCustomerDAO.read(key);
    }

    @Override
    public void create(Customer customer) {
        jdbcCustomerDAO.create(customer);
    }

    @Override
    public void update(Customer customer) {
        jdbcCustomerDAO.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        jdbcCustomerDAO.delete(customer);
    }

    @Override
    public List<Customer> getAll() {
        return jdbcCustomerDAO.getAll();
    }
}
