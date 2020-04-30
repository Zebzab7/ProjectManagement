package acceptance_tests;
import project_management.Worker;
public class WorkerHelper {
	private Worker worker;
	
	public Worker getWorker() {
		if (worker == null) {
			worker = exampleWorker();
		}
		return worker;
	}
	
	private Worker exampleWorker() {
		worker = new Worker("PEPE", "1234");
		return worker;
	}
}
