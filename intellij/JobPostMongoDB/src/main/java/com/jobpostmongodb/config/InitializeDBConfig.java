package com.jobpostmongodb.config;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jobpostmongodb.model.Post;
import com.jobpostmongodb.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
public class InitializeDBConfig {

    private Logger logger = LoggerFactory.getLogger(InitializeDBConfig.class);

    @Bean
    public CommandLineRunner insert(PostRepository repository) {
        return args -> {
            if (repository.count() == 0) {

                ObjectMapper mapper = new ObjectMapper();
                try (InputStream inputStream = new ClassPathResource("data.json").getInputStream()) {
                    List<Post> posts = mapper.readValue(inputStream, new TypeReference<List<Post>>() {
                    });
                    repository.insert(posts);
                } catch (IOException e) {
                    logger.warn(e.getMessage());
                }
            }

//            if (repository.count() < 1) {
//
////                String json = new File("data.json").ne
//                repository.insert(Post.builder()
//                        .profile("dev")
//                        .exp(2)
//                        .desc("development")
//                        .techStack(new String[]{"java", "c"})
//                        .build()
//                );
//                repository.insert(Post.builder()
//                        .profile("test")
//                        .exp(3)
//                        .desc("testing application")
//                        .techStack(new String[]{"java", "selenium"})
//                        .build()
//                );
//                repository.insert(Post.builder()
//                        .profile("desk")
//                        .exp(1)
//                        .desc("desk work")
//                        .techStack(new String[]{"excel", "word"})
//                        .build()
//                );
//            }
        };
    }
}
