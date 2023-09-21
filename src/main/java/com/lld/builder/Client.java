package com.lld.builder;

import java.time.LocalDate;

public class Client {

    public static void main(String[] args) {
        User user = createUser();
        UserDTO dto = directBuild(UserDTO.getBuilder(), user);
        System.out.println(dto);
    }

    private static UserDTO directBuild(UserDTO.UserDTOBuilder builder,
                                       User user) {
        return builder.withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withBirthday(user.getBirthDate())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("Deepak");
        user.setLastName("Mishra");
        user.setBirthDate(LocalDate.of(1990, 5, 21));

        Address address = new Address();
        address.setAddressLine1("123 Broadway");
        address.setCity("New York");
        address.setState("Buffalo");
        address.setZipCode("14201");

        user.setAddress(address);

        return user;
    }
}
