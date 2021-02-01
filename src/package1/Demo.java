package package1;
import org.apache.logging.log4j.*;

public class Demo {
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
log.debug("iam debugging");
log.info("present");
log.error("not present");
log.fatal("this is fatal");
	}

}
