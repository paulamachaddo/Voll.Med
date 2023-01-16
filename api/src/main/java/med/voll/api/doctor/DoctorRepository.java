package med.voll.api.doctor;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;


public interface DoctorRepository extends JpaRepository<Doctor, UUID> {}
