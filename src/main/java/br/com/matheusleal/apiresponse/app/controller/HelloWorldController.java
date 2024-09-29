package br.com.matheusleal.apiresponse.app.controller;

import br.com.matheusleal.apiresponse.app.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello-world")
public class HelloWorldController {

    @GetMapping
    public ResponseEntity<ApiResponse<String>> helloWorld() {
        return ResponseEntity.ok().body(
                ApiResponse.success("Hello World!", HttpStatus.OK.value())
        );
    }
}
