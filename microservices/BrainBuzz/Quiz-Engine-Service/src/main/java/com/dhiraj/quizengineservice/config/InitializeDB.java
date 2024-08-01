package com.dhiraj.quizengineservice.config;

//
//import com.dhiraj.brainbuzz.model.Question;
//import com.dhiraj.brainbuzz.repository.QuestionRepository;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.ClassPathResource;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//@Configuration
//public class InitializeDB {
//
//    private Logger logger = LoggerFactory.getLogger(InitializeDB.class);
//
//    @Bean
//    public CommandLineRunner insert(QuestionRepository repository) {
//        return args -> {
//            if (repository.count() == 0) {
//
//                ObjectMapper mapper = new ObjectMapper();
//                try (InputStream inputStream = new ClassPathResource("questions.json").getInputStream()) {
//                    List<Question> questions = mapper.readValue(inputStream, new TypeReference<List<Question>>() {
//                    });
//                    repository.insert(questions);
//                } catch (IOException e) {
//                    logger.warn(e.getMessage());
//                }
//            }
//        };
//    }
//}
//
