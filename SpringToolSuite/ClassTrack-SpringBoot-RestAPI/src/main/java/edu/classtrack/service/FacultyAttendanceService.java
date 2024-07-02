package edu.classtrack.service;

import edu.classtrack.dto.FacultyAttendance;
import edu.classtrack.repository.CollegeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyAttendanceService implements CollegeService<FacultyAttendance> {

    private final CollegeRepository<FacultyAttendance> facultyAttendanceRepository;

    public FacultyAttendanceService(CollegeRepository<FacultyAttendance> facultyAttendanceRepository) {
        this.facultyAttendanceRepository = facultyAttendanceRepository;
    }

    public List<FacultyAttendance> findAll() {
        return facultyAttendanceRepository.findAll();
    }

    public FacultyAttendance findById(Long id) {
        return facultyAttendanceRepository.findById(id);
    }

    public FacultyAttendance save(FacultyAttendance facultyAttendance) {
        return facultyAttendanceRepository.save(facultyAttendance);
    }

    public FacultyAttendance update(FacultyAttendance facultyAttendance) {
        return facultyAttendanceRepository.update(facultyAttendance);
    }

    public String delete(Long id) {
        return facultyAttendanceRepository.delete(id);
    }

}
