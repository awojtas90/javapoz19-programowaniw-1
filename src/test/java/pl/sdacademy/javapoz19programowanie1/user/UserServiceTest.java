package pl.sdacademy.javapoz19programowanie1.user;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class UserServiceTest {

    @Test
    public void findByGenderShouldReturnFilteredList() {

        UserService userService = new UserService();

        List<User> list = userService.findByGender(Gender.female);

        Assert.assertEquals("Lista", 3, list.size());

        Assert.assertTrue("Wszystkie", list.stream()
                .map(user -> user.getGender())
                .allMatch(gender -> gender.equals(Gender.female)));
    }

    public void mapToNamesShouldReturnListWithNames() {
        UserService userService = new UserService();

        List<String> names = userService.mapToNames();
        Assert.assertEquals(Arrays.asList("Bird Ramsey", "Lillian Burgess", "Kristie Cole", "Leonor Cross", "Marsh Mccall"), names);


    }

    @Test
    public void sortByAgeShouldReturnSortedByAgeListofUsers() {
        UserService userService = new UserService();

        List<User> users = userService.sortByAge();
        users.forEach(user -> System.out.println(user));
    }

    @Test

    public void sortByBalanceReturnSortedByBalanceListofUsers() {
        UserService userService = new UserService();
        List<User> users = userService.sortbyBalance();
        users.forEach(user -> System.out.println(user));
    }

    @Test
    public void avgBalanceShouldReturnAvgValue() {
        UserService userService = new UserService();

        double avgBalance = userService.avgBalance();

        Assert.assertEquals(290318.2, avgBalance, 0.1);
        System.out.println(avgBalance);
    }

    @Test
    public void findWithHighestBalanceShouldReturnUserWithHighestBalance() {
        UserService userService = new UserService();
        User withHighestBalance = userService.findWithHighestBalance();
        Assert.assertEquals(Long.valueOf(394645), withHighestBalance.getBalance());
    }

}