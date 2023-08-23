package com.example.signup.controller;

import com.example.signup.model.Signup;
import com.example.signup.services.signupservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class SignupController {

    @Autowired
    signupservices signupservices;

    //    @RequestMapping(method = RequestMethod.GET, value = "/signups")
    //    public List<Signup> getAllUsers()
    //    {
    //        return signupservices.getAllSignup();
    //    }
    //    @RequestMapping(method = RequestMethod.GET, value = "/signup/{name}")
    //    public Signup getSignupInfo(@PathVariable String name) {
    //        return signupservices.getSignupInfo(name);
    //    }

    @RequestMapping(method = RequestMethod.POST, value = "/signups")
    public Signup addSignup(@RequestBody Signup signup)
    {
        signupservices.addSignup(signup);
        return signup;
    }

    //    @RequestMapping(method = RequestMethod.PUT, value = "/signups/{name}")
    //    public Signup editSignup(@PathVariable String name, @RequestBody Signup signup) {
    //        signupservices.editSignup(name, signup);
    //        return signup;
    //    }

}
