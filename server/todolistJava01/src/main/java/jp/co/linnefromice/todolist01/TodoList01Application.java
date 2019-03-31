package jp.co.linnefromice.todolist01;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoList01Application implements CommandLineRunner {

	Log log = LogFactory.getLog(TodoList01Application.class);

	public static void main(String[] args) {
		SpringApplication.run(TodoList01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("START Application");
	}
}
