package be.enyed.zk;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ExecutionParam;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;

public class HelloViewmodel {
	
	private static int MESSAGE_COUNT = 0;
	
	private String message;
	
	@Init
	public void init(@ExecutionParam("message") String message){
		this.message = message;
		MESSAGE_COUNT++;
	}
	
	@Command
	public void send(){
		Executions.sendRedirect("/hello/"+message);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessageNumber(){
		return "[ nr: " + MESSAGE_COUNT+ "]";
	}
	
}
