package app.api;

import app.core.CoreConnector;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class BasicController {
    private final CoreConnector connector;

    @GetMapping
    public ResponseEntity<String> get(
            @RequestParam(value = "message", defaultValue = "default message") String message
    ) {
        return ResponseEntity.ok(connector.callCore(message));
    }
}
