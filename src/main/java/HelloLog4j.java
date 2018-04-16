import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HelloLog4j {
    // private static Logger logger = Logger.getLogger(HelloLog4j.class);
    public static void main(String[] args) {
        log.debug("This is debug message.");
    }
}
