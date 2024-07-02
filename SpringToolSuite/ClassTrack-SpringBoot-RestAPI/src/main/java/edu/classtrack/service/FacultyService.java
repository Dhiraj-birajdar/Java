package edu.classtrack.service;

import edu.classtrack.dto.Faculty;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService implements CollegeService<Faculty>{

    private final CollegeRepository<Faculty> facultyRepository;

    public FacultyService(CollegeRepository<Faculty> facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public List<Faculty> findAll() {
        return facultyRepository.findAll();
    }

    public Faculty findById(Long id) {
        return facultyRepository.findById(id);
    }

    public Faculty save(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty update(Faculty faculty) {
        return facultyRepository.update(faculty);
    }

    public String delete(Long id) {
        return facultyRepository.delete(id);
    }

}
