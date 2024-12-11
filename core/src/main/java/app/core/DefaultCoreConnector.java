package app.core;

import org.springframework.stereotype.Service;

@Service
public class DefaultCoreConnector implements CoreConnector {
    @Override
    public String callCore(String message) {
        return "accept : {" + message + "}";
    }
}
