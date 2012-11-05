package MVCGame;

public class MVCMain {

	
	public static void main(String[] args)
	{
		Model model = new Model();
		View view = new View(model);
		Controller controller = new Controller(model, view);
		view.addController(controller);
		model.addObserver(view);
	}
	
}
