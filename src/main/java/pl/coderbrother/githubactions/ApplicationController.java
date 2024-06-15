package pl.coderbrother.githubactions;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @GetMapping("/")
    public TestDto root() {
        return TestDto.builder()
                .foo("bar")
                .build();
    }

    @Getter
    @Builder
    private static class TestDto {
        private String foo;
    }
}
