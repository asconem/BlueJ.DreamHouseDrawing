    
    /**
     * This class represents a simple picture. You can draw the picture using
     * the draw method. But wait, there's more: being an electronic picture, it
     * can be changed. You can set it to black-and-white display and back to
     * colors (only after it's been drawn, of course).
     *
     * This class was written as an early example for teaching Java with BlueJ.
     * 
     * @author  Michael Kölling and David J. Barnes
     * @version 1.1  (24 May 2001)
     */
    public class Picture
    {
        private Square wall;
        private Square window;
        private Triangle roof;
        private Circle sun;
        private Circle DoorKnob;
        private Square HouseBody;
        private Square WindowL;
        private Square WindowR;
        private Square Grass;
        private Rect Stair1;
        private Rect Stair2;
        private Rect Stair3;
        private Rect Door;
        private Rect WindowBar1;
        private Rect WindowBar2;
        private Rect WindowBar3;
        private Rect WindowBar4;
        private Rect Chimney;
    
        /**
         * Constructor for objects of class Picture
         */
        public Picture()
        {
            // nothing to do... instance variables are automatically set to null
        }
    
        /**
         * Draw this picture.
         */
        public void draw()
        {
            HouseBody = new Square();
            HouseBody.changeColor("blue");
            HouseBody.inputLocation(60,70);
            HouseBody.changeSize(180);
            HouseBody.makeVisible();
            
            Grass = new Square();
            Grass.changeColor("green");
            Grass.inputLocation(0,250);
            Grass.changeSize(300);
            Grass.makeVisible();
            
            Stair1 = new Rect();
            Stair1.changeColor("black");
            Stair1.inputLocation(90,250);
            Stair1.changeSize(120,15);
            Stair1.makeVisible();
            
            Stair2 = new Rect();
            Stair2.changeColor("black");
            Stair2.inputLocation(80,260);
            Stair2.changeSize(140,15);
            Stair2.makeVisible();
            
            Stair3 = new Rect();
            Stair3.changeColor("black");
            Stair3.inputLocation(70,270);
            Stair3.changeSize(160,15);
            Stair3.makeVisible();
            
            Door = new Rect();
            Door.changeColor("yellow");
            Door.inputLocation(135,180);
            Door.changeSize(40,70);
            Door.makeVisible();
            
            WindowL = new Square();
            WindowL.changeColor("yellow");
            WindowL.inputLocation(90,110);
            WindowL.changeSize(40);
            WindowL.makeVisible();
            
            WindowR = new Square();
            WindowR.changeColor("yellow");
            WindowR.inputLocation(175,110);
            WindowR.changeSize(40);
            WindowR.makeVisible();
            
            DoorKnob = new Circle();
            DoorKnob.changeColor("black");
            DoorKnob.inputLocation(160,210);
            DoorKnob.changeSize(10);
            DoorKnob.makeVisible();
            
            WindowBar1 = new Rect();
            WindowBar1.changeColor("black");
            WindowBar1.inputLocation(108,110);
            WindowBar1.changeSize(5,40);
            WindowBar1.makeVisible();
            
            WindowBar2 = new Rect();
            WindowBar2.changeColor("black");
            WindowBar2.inputLocation(90,129);
            WindowBar2.changeSize(40,5);
            WindowBar2.makeVisible();
            
            WindowBar3 = new Rect();
            WindowBar3.changeColor("black");
            WindowBar3.inputLocation(193,110);
            WindowBar3.changeSize(5,40);
            WindowBar3.makeVisible();
            
            WindowBar4 = new Rect();
            WindowBar4.changeColor("black");
            WindowBar4.inputLocation(175,129);
            WindowBar4.changeSize(40,5);
            WindowBar4.makeVisible();
            
            Chimney = new Rect();
            Chimney.changeColor("red");
            Chimney.inputLocation(60,36);
            Chimney.changeSize(20,40);
            Chimney.makeVisible();
            
        roof = new Triangle();
        roof.changeColor("magenta");
        roof.changeSize(75, 280);
        roof.inputLocation(150,21);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.inputLocation(225,5);
        sun.changeSize(60);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
