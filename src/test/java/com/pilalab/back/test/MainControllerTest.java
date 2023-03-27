package com.pilalab.back.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pilalab.back.controller.MainController;
import com.pilalab.back.entity.User;
import com.pilalab.back.repository.MainService;
import com.pilalab.back.repository.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MainControllerTest {

    @Autowired
    private MainController mainController;

    @Test
    public void testFindAll() {
        Map<String, Object> result = mainController.findAll();
        // 이후에 결과를 검증하는 코드를 작성할 수 있습니다.
        List<User> resultUser = (List<User>) result.get("result");

//        for(User  x : resultUser){
//            System.out.println(x.getUserId());
//        }

        System.out.println("result"+ result);
    }

    @Test
    public void createUser() {
        Map<String, Object> result = new HashMap<>();

        String userName = "테스트이름";
        String userCreateId = "123455";
        String userEmail = "test@email.com";
        String userPhone = "010-1234-1234";
        String userRegion = "인천";
        String userPassword = "1234";
        String userAccess = "N";
        
        Map<String, Object> params = new HashMap<>();

        params.put("userId", "1234567");
        params.put("userCreateId", userCreateId);
        params.put("userName", userName);
        params.put("userEmail", userEmail);
        params.put("userPhone", userPhone);
        params.put("userRegion", userRegion);
        params.put("userPassword", userPassword);
        params.put("userAccess", userAccess);
        
        result = mainController.createUser(params);

        System.out.println("result: " + result);


    }

}

