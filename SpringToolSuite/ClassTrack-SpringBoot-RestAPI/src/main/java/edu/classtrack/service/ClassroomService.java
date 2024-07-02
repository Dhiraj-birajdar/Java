package edu.classtrack.service;

import edu.classtrack.dto.Classroom;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassroomService implements CollegeService<Classroom> {

    private final CollegeRepository<Classroom> classroomRepository;

    ClassroomService(CollegeRepository<Classroom> classroomRepository) {
        this.classroomRepository = classroomRepository;
    }

    public List<Classroom> findAll() {
        return classroomRepository.findAll();
    }

    public Classroom findById(Long id) {
        return classroomRepository.findById(id);
    }

    public Classroom save(Classroom classroom) {
        return classroomRepository.save(classroom);
    }

    public Classroom update(Classroom classroom) {
        return classroomRepository.update(classroom);
    }

    public String delete(Long id) {
        return classroomRepository.delete(id);
    }

}
