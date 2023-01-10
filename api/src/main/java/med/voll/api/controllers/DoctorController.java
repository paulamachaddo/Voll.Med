package med.voll.api.controllers;

import med.voll.api.doctor.DoctorRegister;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @PostMapping
    public void save(@RequestBody DoctorRegister data){
        System.out.println(data);
    }

}
