package com.pilalab.back.controller;

import com.pilalab.back.entity.User;
import com.pilalab.back.handler.SystemHandler;
import com.pilalab.back.repository.MainService;
import com.pilalab.back.repository.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/main")
public class MainController {

    private final UserService userService;
    private SystemHandler systemHandler = new SystemHandler();

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/test")
    public String mainTest() {

        return "hello world";
    }

    @GetMapping(value = "/getUserById/{userId}")
    public Map<String, Object> getUserById(@PathVariable String userId) {
        System.out.println("userId: " + userId);
        return null;
    }

    @GetMapping(value = "/findAll")
    public Map<String, Object> findAll() {
        Map<String, Object> result = new HashMap<>();
        List<User> findAll = userService.getAllUsers();
        result.put("result",findAll);

        return result;
    }

    @PostMapping(value = "/createUser")
    public Map<String, Object> createUser(@RequestBody Map<String, Object> params) {
        Map<String, Object> result = new HashMap<>();
        if (!params.containsKey("userCreateId") ||
                !params.containsKey("userName") ||
                !params.containsKey("userEmail") ||
                !params.containsKey("userPhone") ||
                !params.containsKey("userRegion") ||
                !params.containsKey("userPassword") ||
                !params.containsKey("userAccess")
        ) {
            result.put("result", 400);
            result.put("message", "필수항목을 입력해 주시기 바랍니다.");
        }else {
            String userCreateId = (String) params.get("userCreateId");
            String userName = (String) params.get("userName");
            String userEmail = (String) params.get("userEmail");
            String userPhone = (String) params.get("userPhone");
            String userRegion = (String) params.get("userRegion");
            String userPassword = (String) params.get("userEmail");
            String userAccess = (String) params.get("userAccess");

            User user = new User();
//            user.setUserId(systemHandler.generate());
            user.setUserCreateId(systemHandler.generate());
            user.setUserName(userName);
            user.setUserEmail(userEmail);
            user.setUserPhone(userPhone);
            user.setUserRegion(userRegion);
            user.setUserPassword(userPassword);
            user.setUserAccess(userAccess);

            try{
                userService.createUser(user);
                result.put("result", 200);
                result.put("message", "User Insert Success");
            }catch(Exception e) {
                result.put("result", 400);
                result.put("message", e);
            }


        }

        return result;
    }

}
