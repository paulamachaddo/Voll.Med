package med.voll.api.controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.patient.ListingPatients;
import med.voll.api.patient.Patient;
import med.voll.api.patient.PatientDto;
import med.voll.api.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository repository;

    @PostMapping
    @Transactional
    public void save(@RequestBody @Valid PatientDto patient) {repository.save(new Patient(patient));
    }

    @GetMapping
    public Page<ListingPatients> getPatients(Pageable pageable){
        return repository.findAll(pageable).map(ListingPatients::new);
    }
}
