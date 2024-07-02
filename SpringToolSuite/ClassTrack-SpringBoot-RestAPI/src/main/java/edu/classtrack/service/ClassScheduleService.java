package edu.classtrack.service;

import edu.classtrack.dto.ClassSchedule;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassScheduleService implements CollegeService<ClassSchedule> {

    private final CollegeRepository<ClassSchedule> classScheduleRepository;

    public ClassScheduleService(CollegeRepository<ClassSchedule> classScheduleRepository) {
        this.classScheduleRepository = classScheduleRepository;
    }

    public List<ClassSchedule> findAll() {
        return classScheduleRepository.findAll();
    }

    public ClassSchedule findById(Long id) {
        return classScheduleRepository.findById(id);
    }

    public ClassSchedule save(ClassSchedule classSchedule) {
        return classScheduleRepository.save(classSchedule);
    }

    public ClassSchedule update(ClassSchedule classSchedule) {
        return classScheduleRepository.update(classSchedule);
    }

    public String delete(Long id) {
        return classScheduleRepository.delete(id);
    }
}
