package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.*;

public class Demo1 {
	private static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String args[]) {
		log.debug("I am debugging");
		if(5>4) {
			log.info("object is presnt");
			log.fatal("this is fatal");
			log.error("object is not present");
		}
	}

}
