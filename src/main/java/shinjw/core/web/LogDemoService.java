package shinjw.core.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shinjw.core.common.MyLogger;

@Service
@RequiredArgsConstructor
public class LogDemoService {

//    private final ObjectProvider<MyLogger> myLoggerProvider;
private final MyLogger myLogger;

    public void logic(String id) {
//        MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
