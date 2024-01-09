public class Picture
{
    private Square wall;
    private Square wall1;
    private Square wall2;
    private Square wall3;
    private Square wall4;
    private Square wall5;
    private Square wall6;
    private Square wall7;
    private Triangle roof;
    private Circle sun;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        wall1 = new Square();
        wall2 = new Square();
        wall3 = new Square();
        wall4 = new Square();
        wall5 = new Square();
        wall6 = new Square();
        wall7 = new Square();
        roof = new Triangle();
        sun = new Circle();
        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.changeColor("gunmetalgray");
            wall.moveHorizontal(-230);
            wall.moveVertical(90);
            wall.changeSize(30);
            wall.makeVisible();

            wall1.changeColor("gunmetalgray");
            wall1.moveHorizontal(-230);
            wall1.moveVertical(60);
            wall1.changeSize(30);
            wall1.makeVisible();

            wall2.changeColor("gunmetalgray");
            wall2.moveHorizontal(-230);
            wall2.moveVertical(30);
            wall2.changeSize(30);
            wall2.makeVisible();

            wall3.changeColor("gunmetalgray");
            wall3.moveHorizontal(-230);
            wall3.moveVertical(0);
            wall3.changeSize(30);
            wall3.makeVisible();

            wall4.changeColor("gunmetalgray");
            wall4.moveHorizontal(-230);
            wall4.moveVertical(-30);
            wall4.changeSize(30);
            wall4.makeVisible();

            wall5.changeColor("gunmetalgray");
            wall5.moveHorizontal(-230);
            wall5.moveVertical(-60);
            wall5.changeSize(30);
            wall5.makeVisible();

            wall6.changeColor("gunmetalgray");
            wall6.moveHorizontal(-230);
            wall6.moveVertical(-90);
            wall6.changeSize(30);
            wall6.makeVisible();

            wall7.changeColor("gunmetalgray");
            wall7.moveHorizontal(-200);
            wall7.moveVertical(10);
            wall7.changeSize(30);
            wall7.makeVisible();

            roof.changeSize(60, 180);
            roof.moveHorizontal(170);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        wall2.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        wall2.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
