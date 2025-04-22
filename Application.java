public class Application{
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory f){
        this.factory = f;
        this.button = factory.createButton();
    }

    public void createUI(){
        this.button = factory.createButton();
    }

    public void paint(){
        button.paint();
    }
}