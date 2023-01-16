package med.voll.api.controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorDto;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.ListingDoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctors")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid DoctorDto data){repository.save(new Doctor(data));
    }

    // chamando o Pageable como parametro do método, ele traz os resultados paginados.
    @GetMapping
    public Page<ListingDoctor> getDoctors(Pageable pageable){
        return repository.findAll(pageable).map(ListingDoctor::new);
    }

}
