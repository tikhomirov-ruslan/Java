package practice4;

class Circle extends Shape
{
	
	private int radius;
	
	public Circle(Color color, int position, int radius) 
	{
		
		super(color, position);
		this.radius = radius;
	}
	
	@SuppressWarnings("unused")
	public void draw() 
	{
		
		int centerX = 0; // Adjust this value if you want to change the center of the circle
        int centerY = 0; // Adjust this value if you want to change the center of the circle

        for (int y = -radius; y <= radius; y++) 
        {
            for (int x = -radius; x <= radius; x++) 
            {
                if (x * x + y * y <= radius * radius) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Circle Position: " + position + ", Color: " + color + ", Radius: " + radius);
    }
		
//		System.out.println("Circle radius: " + radius + " (" + x + ", " + y + ")");
//		System.out.println("Color: " + color);
	
}
