package creazionali.abstractFactory;

public class WindowsButton implements Button{


    @Override
    public void render() {
        //
        System.out.println("Displayed windows button");
    }

    @Override
    public void onClick() {
        //
        System.out.println("Clicked windows button");

    }
}
