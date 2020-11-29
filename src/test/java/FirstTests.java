import models.api.User;
import org.junit.Assert;
import org.junit.Test;
import services.ApiRequestsUsers;

import java.util.UUID;

public class FirstTests {
    ApiRequestsUsers apiRequestsUsers = new ApiRequestsUsers();
    User newUser = User.builder()
            .job("QA")
            .name("Anna")
            .id(UUID.randomUUID())
            .createdAt("2020.29.11")
            .build();

    User createdUser = apiRequestsUsers.createUser(newUser);


    @Test
    public void responseNotNull(){
        Assert.assertNotNull(createdUser);
    }
    @Test
    public void rightName(){
        Assert.assertEquals(createdUser.getName().toLowerCase(),newUser.getName().toLowerCase());
    }


}
