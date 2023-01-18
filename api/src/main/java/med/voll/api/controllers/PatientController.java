package med.voll.api.controllers;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.patient.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

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

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid updatingPatient data){
        var patient = repository.getReferenceById(data.id());
        patient.updatePatient(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable UUID id){
        repository.deleteById(id);
    }
}
