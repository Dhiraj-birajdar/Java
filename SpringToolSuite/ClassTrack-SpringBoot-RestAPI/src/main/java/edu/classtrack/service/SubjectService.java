package edu.classtrack.service;

import edu.classtrack.dto.Subject;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService implements CollegeService<Subject>{

    private final CollegeRepository<Subject> subjectRepository;

    public SubjectService(CollegeRepository<Subject> subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }

    public Subject findById(Long id) {
        return subjectRepository.findById(id);
    }

    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject update(Subject subject) {
        return subjectRepository.update(subject);
    }

    public String delete(Long id) {
        return subjectRepository.delete(id);
    }

}
