package com.dhiraj.reactive.student;

import com.github.javafaker.Faker;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

  private final StudentService service;
  private final StudentRepository repository;

  @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
  public Flux<Student> findAll() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public Mono<Student> findById(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public Mono<Student> create(@RequestBody StudentRequest request) {
    return service.save(request);
  }

  @GetMapping("/filter")
  public Flux<Student> findByAuthor(@RequestParam String name) {
    return service.findByFirstname(name);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    service.deleteById(id);
  }

  @GetMapping("create/{n}")
  public void createNStudents(@PathVariable int n){
    Faker fake = new Faker();
    for(int i=0;i<n;i++){
      repository.save(
                        Student.builder()
                                .firstname(fake.name().firstName())
                                .lastname(fake.name().lastName())
								.address(fake.address().fullAddress())
								.phone(fake.phoneNumber().cellPhone())
                                .age(fake.number().numberBetween(12,25))
                                .build()
                ).subscribe();
    }
  }
}
